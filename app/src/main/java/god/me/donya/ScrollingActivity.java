package god.me.donya;

import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.text.util.Linkify;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.Objects;
import java.util.Optional;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class ScrollingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String shortcode = "CZKBjT4tXI-";
                String url = "https://www.instagram.com/graphql/query/?query_hash=bc3296d1ce80a24b1b6e40b1e72903f5&variables=%7B%22shortcode%22%3A%22" + shortcode + "%22%2C%22first%22%3A120%2C%22after%22%3A%22%7B%5C%22bifilter_token%5C%22%3A+%5C%22KDMBAgC4AP______________________________AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA%5C%22%7D%22%7D";

                AsyncTask<String, Void, String> execute = new InstaFerch().execute(url);

            }
        });

        TextView textView = ((TextView) findViewById(R.id.ContactName));

//        textView.setText("https://instagram.com/donya\nhttps://instagram.com/google");

        Linkify.addLinks(textView, Linkify.WEB_URLS);

//
//        findViewById(R.id.emailbutton).setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                Intent browserIntent = new Intent(Intent.ACTION_VIEW);
//                browserIntent.setData(Uri.parse("https://instagram.com"));
//                startActivity(browserIntent);
//            }
//        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_scrolling, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private class InstaFerch extends AsyncTask<String, Void, String> {

        @Override
        protected String doInBackground(String... params) {

            OkHttpClient client = new OkHttpClient();

            String cookie = "mid=YYrdhgALAAEYiXPu0PW6m2YdYCKQ; ig_did=708EBF26-AFEE-4E07-BCB4-07E6C33C6979; ds_user_id=38081432117; csrftoken=Qv2ZJ1iQNvQjTeutrVQ8Wlt8XKd6XORx; sessionid=38081432117:zMIenkyzhHUtQh:1; shbid=\"2510\\05438081432117\\0541681988916:01f7aa1c5a164c70cbada099aae687c50ce05ddd67c5d84aac7c13c9c1cf5ea724c7fc72\"; shbts=\"1650452916\\05438081432117\\0541681988916:01f72ccfee5843a778d5cd7f1ae821bc589fca0dd33314ee16391cf037fa8a764f652fad\"; rur=\"RVA\\05438081432117\\0541682066259:01f7385e3136fc8f6d7fc8b9425cd9eea87f1e9e42e4c5496b869fb4d85140d476439de1\"";


            Request request = new Request.Builder()
                    .url("https://www.instagram.com/donya/?__a=1")
                    .addHeader("cookie", cookie)

                    .build();

            try (Response response = client.newCall(request).execute()) {

                String edge_owner_to_timeline_media = Objects.requireNonNull(response.body()).string().split("edge_owner_to_timeline_media")[1];
                String shortcode = edge_owner_to_timeline_media.split("\"shortcode\":\"")[1].split("\"")[0];

                System.out.println("short code "+shortcode);
                String url = "https://www.instagram.com/graphql/query/?query_hash=bc3296d1ce80a24b1b6e40b1e72903f5&variables=%7B%22shortcode%22%3A%22" + shortcode + "%22%2C%22first%22%3A120%2C%22after%22%3A%22%7B%5C%22bifilter_token%5C%22%3A+%5C%22KDMBAgC4AP______________________________AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA%5C%22%7D%22%7D";

                Request request2 = new Request.Builder()
                        .url(url)
                        .addHeader("cookie", cookie)
                        .build();


                try (Response response2 = client.newCall(request2).execute()) {
                    return response2.body().string();
                } catch (IOException e) {
                    return null;
                }


            } catch (IOException e) {
                return null;
            }


        }

        @Override
        protected void onPostExecute(String result) {
            JSONObject jsonObject = null;

            JSONArray edges = null;
            try {
                jsonObject = new JSONObject(result);


                JSONObject root = ((JSONObject) ((JSONObject) ((JSONObject) jsonObject.get("data")).get("shortcode_media"))
                        .get("edge_media_to_parent_comment"));
                edges = (JSONArray) root.get("edges");


                JSONObject page_info = (JSONObject) root.get("page_info");
                boolean has = (boolean) page_info.get("has_next_page");

                String end_cursor = (String) page_info
                        .get("end_cursor");
                String a = proccessEdges(edges);


                TextView textView = ((TextView) findViewById(R.id.ContactName));


                textView.setText(a);

                Linkify.addLinks(textView, Linkify.WEB_URLS);

            } catch (JSONException e) {
                TextView textView = ((TextView) findViewById(R.id.ContactName));

                textView.setText(e.getLocalizedMessage());
            }


        }


        private String proccessEdges(JSONArray edges) throws JSONException {
            String s = "";
            System.err.println(edges.length());
            for (int i = 0; i < edges.length(); i++) {
                JSONObject jsonObject = edges.getJSONObject(i);
                String username = (String) ((JSONObject) ((JSONObject) jsonObject
                        .get("node"))
                        .get("owner"))
                        .get("username");
                String userid = (String) ((JSONObject) ((JSONObject) jsonObject
                        .get("node"))
                        .get("owner"))
                        .get("id");
                String text = (String) ((JSONObject) jsonObject
                        .get("node"))
                        .get("text");
                Integer created_at = (Integer) ((JSONObject) jsonObject.get("node")).get("created_at");
                java.util.Date time = new java.util.Date((long) created_at * 1000);

                s += "https://instagram.com/" + username + " " + text.substring(0, Math.min(50, text.length() - 1)) + "\n\n";

            }
            return s;


        }


        @Override
        protected void onPreExecute() {
            TextView textView = ((TextView) findViewById(R.id.ContactName));

            textView.setText("IN FETCHING >>>>>>...........");
        }

        @Override
        protected void onProgressUpdate(Void... values) {

        }
    }


}
