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


            String cookie = "mid=YnAuvQALAAG5M9S-scqy1fcZT3EG; ig_did=FC5F1D71-F893-4831-9D31-E13FE356C69F; ig_nrcb=1; csrftoken=2y9aPvn5uajcxsoce6dj0BFrDlIhZ2Os; ds_user_id=46965647003; sessionid=46965647003:gowgt2O9E876ns:29; dpr=2.5; shbid=\"18799\\05446965647003\\0541685777395:01f7a72f7bee2cb0b7c7f543a63294adbaac9db51d4c58ba0d3d8ec9ba06d002e5a73186\"; shbts=\"1654241395\\05446965647003\\0541685777395:01f721d04fd185ceb3b324e702630a777da1cb4e44f263d04fd3f264e611d421f26f3c12\"; datr=7OmZYkO-Dnr4CQFkqhPJGjmX; rur=\"FRC\\05446965647003\\0541685790071:01f7d3f676f7d8d6ea67b53d1a618130599560a03cc7ebac51bdeb5fb7463c76013ec315\"";

            Request request = new Request.Builder()
                    .url("https://i.instagram.com/api/v1/users/web_profile_info/?username=donya")
                    .addHeader("cookie", cookie)
                    .addHeader("user-agent", "user-agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.0.0 Safari/537.36")
                    .addHeader("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102\"")
                    .addHeader("sec-ch-ua-mobile", "?0")
                    .addHeader("referer", "https://www.instagram.com/p/CeUDkhxrdsk/")
                    .addHeader( "accept", "*/*")
                    .addHeader(  "accept-language", "en-US,en;q=0.9")
                .addHeader(    "sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102\"")
                  .addHeader(  "sec-ch-ua-mobile", "?0")
                 .addHeader(   "sec-ch-ua-platform", "\"Windows\"")
                .addHeader(    "sec-fetch-dest", "empty")
                .addHeader(    "sec-fetch-mode", "no-cors")
                  .addHeader(  "sec-fetch-site", "same-site")
                  .addHeader(  "x-asbd-id", "198387")
                 .addHeader(   "x-csrftoken", "xQdcYg6QCFUrOtGiYTOxddGVoXsV9UhR")
                 .addHeader(   "x-ig-app-id", "936619743392459")
                  .addHeader(  "x-ig-www-claim", "hmac.AR2a0s-zR6Hdr23fE_Vi87zvcuSrHFY-d8M4qLMQoFBGCaq5")
                  .addHeader(  "cookie", "mid=YilRLwALAAGjeUi_YBySMg6kQ-hO; ig_did=5D56230F-1B28-4239-BF5E-E5B1B9800D19; shbid=\"550\\05448586000684\\0541685604300:01f7f1aac8445c160872064eb126e5707c3ff62ecedc0f87e5fcb76228c8a394f02610ca\"; shbts=\"1654068300\\05448586000684\\0541685604300:01f78753db2cea07ffaad796e882c305bf2377e77e436a3e9bd4b0c2bd734930878b01ab\"; dpr=2.5; datr=XhSXYsttNzhSBBrOPvp-eIw6; ds_user_id=46965647003; csrftoken=xQdcYg6QCFUrOtGiYTOxddGVoXsV9UhR; sessionid=46965647003%3Az7YghuoBKPwFlZ%3A21; rur=\"FRC\\05446965647003\\0541685791495:01f73ba34dbb92212481c4a0e3b89508e1d11dbe7972269655d07d8af19c64b145ac4ec6\"")
                 .addHeader(   "Referer", "https://www.instagram.com/")
                 .addHeader(   "Referrer-Policy","strict-origin-when-cross-origin")

                    .build();

            try (Response response = client.newCall(request).execute()) {


                String string = Objects.requireNonNull(response.body()).string();
                System.out.println("coeeeeeeeee\n");
                System.out.println(response.code());
                System.err.println(string);
                String edge_owner_to_timeline_media = string.split("edge_owner_to_timeline_media")[1];
                String shortcode = edge_owner_to_timeline_media.split("\"shortcode\":\"")[1].split("\"")[0];

                System.out.println("short code "+shortcode);
                String url = "https://www.instagram.com/graphql/query/?query_hash=bc3296d1ce80a24b1b6e40b1e72903f5&variables=%7B%22shortcode%22%3A%22" + shortcode + "%22%2C%22first%22%3A120%2C%22after%22%3A%22%7B%5C%22bifilter_token%5C%22%3A+%5C%22KDMBAgC4AP______________________________AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA%5C%22%7D%22%7D";
                System.out.println(url);

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
