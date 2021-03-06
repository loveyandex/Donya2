package god.me.donya;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    @Test
    public void addition_isCorrect() {

        String s = "{\"seo_category_infos\":[[\"Beauty\",\"beauty\"],[\"Dance & Performance\",\"dance_and_performance\"]," +
                "[\"Fitness\",\"fitness\"],[\"Food & Drink\",\"food_and_drink\"],[\"Home & Garden\",\"home_and_garden\"],[\"Mus" +
                "ic\",\"music\"],[\"Visual Arts\",\"visual_arts\"]],\"logging_page_id\":\"profilePage_563688419\",\"show_suggested_profiles\":false,\"show" +
                "_follow_dialog\":false,\"graphql\":{\"user\":{\"biography\":\"Taste Morocco\",\"blocked_by_viewer\":false,\"restricted_by_viewer\":false,\"cou" +
                "ntry_block\":false,\"external_url\":\"http://mina.co/\",\"external_url_linkshimmed\":\"https://l.instagram.com/?u=http%3A%2F%2Fmina.co%2F&e=ATN4Mi3ZEyknWI39290r_dG" +
                "oHqZe-pb7e6K9wgZTgyOEf5rQrVAljvdzhHJjg8Kq4pNUoP9Txcajm871w8P7tQ0&s=1\",\"edge_followed_by\":{\"count\":63464},\"fbid\":\"17841401212578807\",\"followed_by_viewer\":false" +
                ",\"edge_follow\":{\"count\":1334},\"follows_viewer\":false,\"full_name\":\"Mina\",\"has_ar_effects\":false,\"has_clips\":false,\"has_guides\":false,\"has_channel\":fals" +
                "e,\"has_blocked_viewer\":false,\"highlight_reel_count\":8,\"has_requested_viewer\":false,\"hide_like_and_view_counts\":false,\"id\":\"563688419\",\"is_business_account\"" +
                ":true,\"is_professional_account\":true,\"is_embeds_disabled\":false,\"is_joined_recently\":false,\"business_address_json\":null,\"business_contact_method\":\"CALL\",\"bu" +
                "siness_email\":null,\"business_phone_number\":null,\"business_category_name\":\"Food & Personal Goods\",\"overall_category_name\":null,\"category_enum\":\"BRAND\",\"cate" +
                "gory_name\":\"Brand\",\"is_private\":false,\"is_verified\":false,\"edge_mutual_followed_by\":{\"count\":0,\"edges\":[]},\"profile_pic_url\":\"https://scontent-prg1-1.cd" +
                "ninstagram.com/v/t51.2885-19/s150x150/79120241_742774332799437_3280080504073748480_n.jpg?_nc_ht=scontent-prg1-1.cdninstagram.com&_nc_cat=109&_nc_ohc=zGXYlJMtXYkAX8cw4Qw&t" +
                "n=4FTC1P17Gmc-Aroo&edm=ABfd0MgBAAAA&ccb=7-4&oh=00_AT9tDJdJwW-7Uji_zII4Jaa3MAC7rd5379zrjfh3vBsa5Q&oe=61FEBB9A&_nc_sid=7bff83\",\"profile_pic_url_hd\":\"https://scontent-pr" +
                "g1-1.cdninstagram.com/v/t51.2885-19/s320x320/79120241_742774332799437_3280080504073748480_n.jpg?_nc_ht=scontent-prg1-1.cdninstagram.com&_nc_cat=109&_nc_ohc=zGXYlJMtXYkAX8c" +
                "w4Qw&tn=4FTC1P17Gmc-Aroo&edm=ABfd0MgBAAAA&ccb=7-4&oh=00_AT-eoioz_qTxrB2QAainJKRA00fdKQxIjudMIdnWyDgzlw&oe=61FE96EA&_nc_sid=7bff83\",\"requested_by_viewer\":false,\"should" +
                "_show_category\":true,\"should_show_public_contacts\":true,\"username\":\"mina\",\"connected_fb_page\":null,\"pronouns\":[],\"edge_felix_video_timeline\":{\"count\":3,\"page_info\"" +
                ":{\"has_next_page\":false,\"end_cursor\":\"\"},\"edges\":[{\"node\":{\"__typename\":\"GraphVideo\",\"id\":\"1879869379959019875\",\"shortcode\":\"BoWoz24l1lj\",\"dimensions\":{\"" +
                "height\":750,\"width\":750},\"display_url\":\"https://scontent-prg1-1.cdninstagram.com/v/t51.2885-15/e15/41806776_336843686875487_8465232375856389434_n.jpg?_nc_ht=scontent-prg1-1." +
                "cdninstagram.com&_nc_cat=111&_nc_ohc=g4vbHpEE6VkAX9Nkfmk&edm=ABfd0MgBAAAA&ccb=7-4&oh=00_AT9iiknD-wF7r-tqPU-u6RGcBqGRl-7qEFmwfnk0KnDTNA&oe=61FAB9D9&_nc_sid=7bff83\",\"edge_media_to_" +
                "tagged_user\":{\"edges\":[{\"node\":{\"user\":{\"full_name\":\"Whole Foods Market\",\"followed_by_viewer\":false,\"id\":\"9144270\",\"is_verified\":true,\"profile_pic_url\":\"https" +
                "://scontent-prg1-1.cdninstagram.com/v/t51.2885-19/s150x150/40117077_681120765598567_2189043559737327616_n.jpg?_nc_ht=scontent-prg1-1.cdninstagram.com&_nc_cat=107&_nc_ohc=eZ9PYJmG" +
                "QHkAX9FOjHk&tn=4FTC1P17Gmc-Aroo&edm=ABfd0MgBAAAA&ccb=7-4&oh=00_AT8GmrnDnM7WjBJ0RAIf4Ax3Z7aKQmKkdHS6i03JHDKUiA&oe=61FEB5F4&_nc_sid=7bff83\",\"username\":\"wholefoods\"},\"x\":0.06535" +
                "94807,\"y\":0.0163398702}},{\"node\":{\"user\":{\"full_name\":\"Mina\",\"followed_by_viewer\":false,\"id\":\"563688419\",\"is_verified\":false,\"profile_pic_url\":\"https://scontent" +
                "-prg1-1.cdninstagram.com/v/t51.2885-19/s150x150/79120241_742774332799437_3280080504073748480_n.jpg?_nc_ht=scontent-prg1-1.cdninstagram.com&_nc_cat=109&_nc_ohc=zGXYlJMtXYkAX8cw4Qw&t" +
                "n=4FTC1P17Gmc-Aroo&edm=ABfd0MgBAAAA&ccb=7-4&oh=00_AT9tDJdJwW-7Uji_zII4Jaa3MAC7rd5379zrjfh3vBsa5Q&oe=61FEBB9A&_nc_sid=7bff83\",\"username\":\"mina\"},\"x\":0.8826666474,\"y\":0.1560" +
                "000032}}]},\"fact_check_overall_rating\":null,\"fact_check_information\":null,\"gating_info\":null,\"sharing_friction_info\":{\"should_have_sharing_friction\":false,\"bloks" +
                "_app_url\":null},\"media_overlay_info\":null,\"media_preview\":\"ACoqz8bT8xA55z6c5/T+lXi0rwBDhYmPynHzFc5GfTP0yaW4WNdgX5nPLew/pUrLvQISdvXA9qyXkaE9pCAnmHqTge2P6mrPl7NzE5B5OO" +
                "1RWsiIu1jjByM9KtyKHXb2b0PUfX0qrdeor9Dlrv8AeAsTyp2nPJburewI44rO59DXXXFisnzA7WA28DjH09uxqp/ZyDjk0bBuKyrsZ2ONo6fy/OssXcsg2x/KB1buTVi9csjei8Aep7n8M4H4mqUbYQAVMVu31G30AySrzvJ+tX7LU2Q7H6dx" +
                "/Uf4VnOaibgbvQ1oSdPcagqHCAuOpPQewHv6/lWeZbknPmque3HHt+FVt2QDVsRrjoKxlJrYuKT3IiuY9rdwc/j1/WspW28H8DV+4JEZx7VXRQU5FaolkOc9wKCd2FXp/nn8f5UwjFWIximItKvTPTP8qvZX1rPiJzjtTq5pas2Wx//Z\"" +
                ",\"owner\":{\"id\":\"563688419\",\"username\":\"mina\"},\"is_video\":true,\"has_upcoming_event\":false,\"accessibility_caption\":null,\"dash_info\":{\"is_dash_eligible\":fals" +
                "e,\"video_dash_manifest\":null,\"number_of_qualities\":0},\"has_audio\":true,\"tracking_token\":\"eyJ2ZXJzaW9uIjo1LCJwYXlsb2FkIjp7ImlzX2FuYWx5dGljc190cmFja2VkIjp0cnVlLCJ1dWlk" +
                "IjoiN2ZlYjUyZmZmYmRhNGVjMzk3NWFjMjFiM2Y2ZmQ2ZmUxODc5ODY5Mzc5OTU5MDE5ODc1Iiwic2VydmVyX3Rva2VuIjoiMTY0MzY1MDc3MzY1M3wxODc5ODY5Mzc5OTU5MDE5ODc1fDM4MDgxNDMyMTE3fDg3MjYxN2NiNmE1N" +
                "zE4Y2U5NzI0Njk2YjZkYzQ0OWVmMThhNjdlZDI2MDM0OGUzMDM4Yzk2ZjkyYjRjYmZkZjQifSwic2lnbmF0dXJlIjoiIn0=\",\"video_url\":\"https://scontent-prg1-1.cdninstagram.com/v/t50.2886-16/4171" +
                "8239_285527625389491_7104858023092452039_n.mp4?efg=eyJ2ZW5jb2RlX3RhZyI6InZ0c192b2RfdXJsZ2VuLjY0MC5mZWVkLiIsInFlX2dyb3VwcyI6IltcImlnX3dlYl9kZWxpdmVyeV92dHNfb3RmXCJdIn0&_nc_ht=scontent-prg1-1.cdninstagram.com&_nc_cat=107&_nc_ohc=YFcGiMz19M4AX-ZKLd2&tn=4FTC1P17Gmc-Aroo&edm=ABfd0MgBAAAA&vs=17906646346246728_393197315&_nc_vs=HBksFQAYJEdOX1JmQUt6VmFfVXJ3TUJBTWQ2QXBhNmhwbGlia1lMQUFBRhUAAsgBABUAGCRHQXRCaHdKTkpVYWE2YVlBQUV2d0tZNlZDVTFSYmtZTEFBQUYVAgLIAQAoABgAGwGIB3VzZV9vaWwBMBUAACa4i6P0yv3xAhUCKAJDMywXQCIFHrhR64UYFGRhc2hfYmFzZWxpbmVfNjQwX3YxEQB16gcA&_nc_rid=7feb530b43&ccb=7-4&oe=61FA4D3A&oh=00_AT-HEOIzSk3LMmz_Ngj1XNW6Q3HGjnwlNLnaysXGG_42cA&_nc_sid=7bff83\",\"video_view_count\":8356,\"edge_media_to_caption\":{\"edges\":[]},\"edge_media_to_comment\":{\"count\":17},\"comments_disabled\":false,\"taken_at_timestamp\":1538317969,\"edge_liked_by\":{\"count\":173},\"edge_media_preview_like\":{\"count\":249},\"location\":null,\"thumbnail_src\":\"https://scontent-prg1-1.cdninstagram.com/v/t51.2885-15/e15/s640x640/41806776_336843686875487_8465232375856389434_n.jpg?_nc_ht=scontent-prg1-1.cdninstagram.com&_nc_cat=111&_nc_ohc=g4vbHpEE6VkAX9Nkfmk&edm=ABfd0MgBAAAA&ccb=7-4&oh=00_AT_t6XBfaGXASvXfPmJMA1CR5TwVbCBslyAFHvKz6uatgw&oe=61FA6F27&_nc_sid=7bff83\",\"thumbnail_resources\":[{\"src\":\"https://scontent-prg1-1.cdninstagram.com/v/t51.2885-15/e15/s150x150/41806776_336843686875487_8465232375856389434_n.jpg?_nc_ht=scontent-prg1-1.cdninstagram.com&_nc_cat=111&_nc_ohc=g4vbHpEE6VkAX9Nkfmk&edm=ABfd0MgBAAAA&ccb=7-4&oh=00_AT8QRtK4LCcU8Bfe5bWo3fF6Y7lra38cOHJNnZ8onN3pEw&oe=61FAB4FA&_nc_sid=7bff83\",\"config_width\":150,\"config_height\":150},{\"src\":\"https://scontent-prg1-1.cdninstagram.com/v/t51.2885-15/e15/s240x240/41806776_336843686875487_8465232375856389434_n.jpg?_nc_ht=scontent-prg1-1.cdninstagram.com&_nc_cat=111&_nc_ohc=g4vbHpEE6VkAX9Nkfmk&edm=ABfd0MgBAAAA&ccb=7-4&oh=00_AT_H0na5BD8D_VWGEcNXwOmTilnxW6s0YVndiCcYGvEyNA&oe=61FAAFB4&_nc_sid=7bff83\",\"config_width\":240,\"config_height\":240},{\"src\":\"https://scontent-prg1-1.cdninstagram.com/v/t51.2885-15/e15/s320x320/41806776_336843686875487_8465232375856389434_n.jpg?_nc_ht=scontent-prg1-1.cdninstagram.com&_nc_cat=111&_nc_ohc=g4vbHpEE6VkAX9Nkfmk&edm=ABfd0MgBAAAA&ccb=7-4&oh=00_AT-Aou4raBBdV8kvB7YRlz8sLJvV_RoEUTa20NLvwIGxbQ&oe=61FA3E4A&_nc_sid=7bff83\",\"config_width\":320,\"config_height\":320},{\"src\":\"https://scontent-prg1-1.cdninstagram.com/v/t51.2885-15/e15/s480x480/41806776_336843686875487_8465232375856389434_n.jpg?_nc_ht=scontent-prg1-1.cdninstagram.com&_nc_cat=111&_nc_ohc=g4vbHpEE6VkAX9Nkfmk&edm=ABfd0MgBAAAA&ccb=7-4&oh=00_AT-mt1TWuhYjMUWyYQjR5v3reJYFZouTKjhwWnMg1W7hrA&oe=61FA2714&_nc_sid=7bff83\",\"config_width\":480,\"config_height\":480},{\"src\":\"https://scontent-prg1-1.cdninstagram.com/v/t51.2885-15/e15/s640x640/41806776_336843686875487_8465232375856389434_n.jpg?_nc_ht=scontent-prg1-1.cdninstagram.com&_nc_cat=111&_nc_ohc=g4vbHpEE6VkAX9Nkfmk&edm=ABfd0MgBAAAA&ccb=7-4&oh=00_AT_t6XBfaGXASvXfPmJMA1CR5TwVbCBslyAFHvKz6uatgw&oe=61FA6F27&_nc_sid=7bff83\",\"config_width\":640,\"config_height\":640}],\"felix_profile_grid_crop\":null,\"coauthor_producers\":[],\"encoding_status\":null,\"is_published\":true,\"product_type\":\"feed\",\"title\":null,\"video_duration\":8.96}},{\"node\":{\"__typename\":\"GraphVideo\",\"id\":\"1816101080830240695\",\"shortcode\":\"Bk0Fk-XFue3\",\"dimensions\":{\"height\":937,\"width\":750},\"display_url\":\"https://scontent-prg1-1.cdninstagram.com/v/t51.2885-15/e15/35999627_2207300752847693_1832692515484991488_n.jpg?_nc_ht=scontent-prg1-1.cdninstagram.com&_nc_cat=105&_nc_ohc=SY54TGb4_4YAX_TxBOQ&tn=4FTC1P17Gmc-Aroo&edm=ABfd0MgBAAAA&ccb=7-4&oh=00_AT-3J39T2SSJ0BGNqdlv35U8fwLQGMpYSsMoCNmoMeIekQ&oe=61FA2C5A&_nc_sid=7bff83\",\"edge_media_to_tagged_user\":{\"edges\":[]},\"fact_check_overall_rating\":null,\"fact_check_information\":null,\"gating_info\":null,\"sharing_friction_info\":{\"should_have_sharing_friction\":false,\"bloks_app_url\":null},\"media_overlay_info\":null,\"media_preview\":\"ACEqecVGOtS44pAtADWFGKCOaV+nFAEOKKXmigCfpTx0pppwBPA5oAjJyalI4pgHOex71KRQBFtPpRU2KKAK5akeYxjgZJ4/xpKim6UnqgCOUkHIxtOBz65qwJKz4OjfUfyNWV60LRWAueZRUNFMD//Z\",\"owner\":{\"id\":\"563688419\",\"username\":\"mina\"},\"is_video\":true,\"has_upcoming_event\":false,\"accessibility_caption\":null,\"dash_info\":{\"is_dash_eligible\":false,\"video_dash_manifest\":null,\"number_of_qualities\":0},\"has_audio\":true,\"tracking_token\":\"eyJ2ZXJzaW9uIjo1LCJwYXlsb2FkIjp7ImlzX2FuYWx5dGljc190cmFja2VkIjp0cnVlLCJ1dWlkIjoiN2ZlYjUyZmZmYmRhNGVjMzk3NWFjMjFiM2Y2ZmQ2ZmUxODE2MTAxMDgwODMwMjQwNjk1Iiwic2VydmVyX3Rva2VuIjoiMTY0MzY1MDc3MzY1NHwxODE2MTAxMDgwODMwMjQwNjk1fDM4MDgxNDMyMTE3fDExNTBiNmM3NGI4ODI1ODdhOWQ4NDQzNzA3YTM1YzI2MDAxNDY5NWNhYWI5NTAyM2Y5NDhjYWUxMzY0ZmZhODIifSwic2lnbmF0dXJlIjoiIn0=\",\"video_url\":\"https://scontent-prg1-1.cdninstagram.com/v/t50.2886-16/35585399_279409065940902_121062093944457599_n.mp4?efg=eyJ2ZW5jb2RlX3RhZyI6InZ0c192b2RfdXJsZ2VuLjY0MC5mZWVkLiIsInFlX2dyb3VwcyI6IltcImlnX3dlYl9kZWxpdmVyeV92dHNfb3RmXCJdIn0&_nc_ht=scontent-prg1-1.cdninstagram.com&_nc_cat=106&_nc_ohc=aPSissxO68UAX-hz8cl&edm=ABfd0MgBAAAA&vs=17931894037185713_1376646612&_nc_vs=HBksFQAYJEdIZjlIZ0ttVngtX0h2NEFBSDhKVTBGVkdhNEJia1lMQUFBRhUAAsgBABUAGCRHSnp0TFFKb1N0Q1lDVGdGQU81VzdaRXR0NDhtYmtZTEFBQUYVAgLIAQAoABgAGwGIB3VzZV9vaWwBMBUAACaIi5n3qsmXARUCKAJDMywXQB1cKPXCj1wYFGRhc2hfYmFzZWxpbmVfNjQwX3YxEQB16gcA&_nc_rid=7feb5983d8&ccb=7-4&oe=61FAB160&oh=00_AT9GLu-oG2zHAV8D6NkvcNiJoxVNs8_YsXfxXaKc6Kob3g&_nc_sid=7bff83\"," +

                "";


        s = ".\\n.\\n#videography #londonvideography #editorialvideography #editorialcontent #editorial #editorialphoto #videomaker #videographer #blog #fblogger #fashionblog #fashionblogger #fashioninspo #editorialfashion #contentcreator #londonblogger #wiwt #viral #love #stylist #whattowear #streetstyle #londonstreetstyle #parisstreetstyle #streetstylephotography #streetstyleinspo #viralvideo\"}}]},\"edge_media_to_comment\":{\"count\":15254},\"comments_disabled\":false,\"taken_at_timestamp\":1596987468,\"edge_liked_by\":{\"count\":276354},\"edge_media_preview_like\":{\"count\":276354},\"location\":null,\"thumbnail_src\":\"https://scontent-prg1-1.cdninstagram.com/v/t51.2885-15/sh0.08/e35/c0.90.720.720a/s640x640/117190591_691834371545565_6363393465044971908_n.jpg?_nc_ht=scontent-prg1-1.cdninstagram.com&_nc_cat=109&_nc_ohc=NarXwdRG7Y4AX-528Tb&edm=ABfd0MgBAAAA&ccb=7-4&oh=00_AT-6TLPq_KOSKVUbmJrmXwxLUkaeKU5dB_9CUAefNPC2og&oe=61FAA5CC&_nc_sid=7bff83\",\"thumbnail_resources\":[{\"src\":\"https://scontent-prg1-1.cdninstagram.com/v/t51.2885-15/e35/c0.90.720.720a/s150x150/117190591_691834371545565_6363393465044971908_n.jpg?_nc_ht=scontent-prg1-1.cdninstagram.com&_nc_cat=109&_nc_ohc=NarXwdRG7Y4AX-528Tb&edm=ABfd0MgBAAAA&ccb=7-4&oh=00_AT-OwUYZIalOROs7vckRO9eWdnkHbit0u_tc5LBE8L_XLQ&oe=61FA2CC0&_nc_sid=7bff83\",\"config_width\":150,\"config_height\":150},{\"src\":\"https://scontent-prg1-1.cdninstagram.com/v/t51.2885-15/e35/c0.90.720.720a/s240x240/117190591_691834371545565_6363393465044971908_n.jpg?_nc_ht=scontent-prg1-1.cdninstagram.com&_nc_cat=109&_nc_ohc=NarXwdRG7Y4AX-528Tb&edm=ABfd0MgBAAAA&ccb=7-4&oh=00_AT-5cruVjs_Ce28CLPJE8jYcts4OwubOzJrYDEMR3Wv3gA&oe=61FA66BA&_nc_sid=7bff83\",\"config_width\":240,\"config_height\":240},{\"src\":\"https://scontent-prg1-1.cdninstagram.com/v/t51.2885-15/e35/c0.90.720.720a/s320x320/117190591_691834371545565_6363393465044971908_n.jpg?_nc_ht=scontent-prg1-1.cdninstagram.com&_nc_cat=109&_nc_ohc=NarXwdRG7Y4AX-528Tb&edm=ABfd0MgBAAAA&ccb=7-4&oh=00_AT-lCiA_p_yD3A4_5dQeQ2I9J8iD9EzIYNquCxHeBWCT9g&oe=61FA8E48&_nc_sid=7bff83\",\"config_width\":320,\"config_height\":320},{\"src\":\"https://scontent-prg1-1.cdninstagram.com/v/t51.2885-15/e35/c0.90.720.720a/s480x480/117190591_691834371545565_6363393465044971908_n.jpg?_nc_ht=scontent-prg1-1.cdninstagram.com&_nc_cat=109&_nc_ohc=NarXwdRG7Y4AX-528Tb&edm=ABfd0MgBAAAA&ccb=7-4&oh=00_AT8p4A3hXWoIF3e74KYv92xL2_7mywB9yHvak-2exTKvmw&oe=61FA2741&_nc_sid=7bff83\",\"config_width\":480,\"config_height\":480},{\"src\":\"https://scontent-prg1-1.cdninstagram.com/v/t51.2885-15/sh0.08/e35/c0.90.720.720a/s640x640/117190591_691834371545565_6363393465044971908_n.jpg?_nc_ht=scontent-prg1-1.cdninstagram.com&_nc_cat=109&_nc_ohc=NarXwdRG7Y4AX-528Tb&edm=ABfd0MgBAAAA&ccb=7-4&oh=00_AT-6TLPq_KOSKVUbmJrmXwxLUkaeKU5dB_9CUAefNPC2og&oe=61FAA5CC&_nc_sid=7bff83\",\"config_width\":640,\"config_height\":640}],\"felix_profile_grid_crop\":null,\"coauthor_producers\":[],\"encoding_status\":null,\"is_published\":true,\"product_type\":\"feed\",\"title\":\"\",\"video_duration\":56.033}}]},\"edge_owner_to_timeline_media\":{\"count\":509,\"page_info\":{\"has_next_page\":true,\"end_cursor\":\"QVFEVnJ3NzRMcUl3d1RLeUNVWXFTWEpHX2xzUUJmNU51d1A5S3pOdlZfWk9MN1p4NTV6OGZLSzlDaVBnLVQ1ci1QM3pGUHR5b1N0YUZtcTcxWk9GWlpfMQ==\"},\"edges\":[{\"node\":{\"__typename\":\"GraphImage\",\"id\":\"2762718838266852456\",\"shortcode\":\"CZXJiVZLPRo\",\"dimensions\":{\"height\":1338,\"width\":1080},\"display_url\":\"https://scontent-prg1-1.cdninstagram.com/v/t51.2885-15/e35/p1080x1080/273018924_323450233037638_7358979966872115683_n.jpg?_nc_ht=scontent-prg1-1.cdninstagram.com&_nc_cat=1&_nc_ohc=ulxI0zgTt3EAX8Nah-d&edm=ABfd0MgBAAAA&ccb=7-4&oh=00_AT-SQ3WD1aVSox514dO2xXHMbdTCk3Fxsz67cCzxiAvTKA&oe=61FE4438&_nc_sid=7bff83\",\"edge_media_to_tagged_user\":{\"edges\":[{\"node\":{\"user\":{\"full_name\":\"Artam\",\"followed_by_viewer\":false,\"id\":\"45239570013\",\"is_verified\":false,\"profile_pic_url\":\"https://scontent-prg1-1.cdninstagram.com/v/t51.2885-19/s150x150/266746604_3010943789166270_8056349198124583504_n.jpg?_nc_ht=scontent-prg1-1.cdninstagram.com&_nc_cat=1&_nc_ohc=CaOF7czYdFgAX-IZ9eF&edm=ABfd0MgBAAAA&ccb=7-4&oh=00_AT_ilyRrqwvxSFWLoZPAIVs30unanqQarMwWzson8JplcA&oe=61FE2369&_nc_sid=7bff83\",\"username\":\"artam\"},\"x\":0.7211837769,\"y\":0.6269470286}}]},\"fact_check_overall_rating\":null,\"fact_check_information\":null,\"gating_info\":null,\"sharing_friction_info\":{\"should_have_sharing_friction\":false,\"bloks_app_url\":null},\"media_overlay_info\":null,\"media_preview\":\"ACIqq3lxIG8vHl56+vXH5fSrMECxq4Y5yOc9Mc1mzSBjnO4+p5rWW4LryCVYEA4+v+eak0GpIqDEe0/T/D8alXa2NowMgdc/59PwqrHGFc5wTjt6k9PrxVxMHGMAbj04qGik9SQ4oqjJPhyPQn+dFHKPmLkIjYkFUQd+Bz+lUlTZKUBHlJls57t0H1HTH41qWR+QHuSax9XnzIYl/hOW9zjj8hVmWwt3JJGdo4PXPqDUFrcHcfMJ6d6mm3SoqnLSpxwMkjAIz+eM0Fw4C3C+Ww4BI2D6k4JJ/wBnpTDZlF/mYnPUk0UhcjjOffnn3oo1DQ6WzheMDdx1/wA4qvJp4aQyyBss2cKQcDt9enOOfatVjzVW/OFBHBGP5ilsNassxRxqMxgDI6jv9TVa/P7soVLBuB0wCenfOfoKsIAHOPT+tMk5nQHkBWP4+v196YuupgjSZ8dvxNFdPRTF8j//2Q==\",\"owner\":{\"id\":\"373148161\",\"username\":\"donya\"},\"is_video\":false,\"has_upcoming_event\":false,\"acc";


        String edge_owner_to_timeline_media = s.split("edge_owner_to_timeline_media")[1];
        String shortcode = edge_owner_to_timeline_media.split("\"shortcode\":\"")[1].split("\"")[0];


        String mediaid = "2880799220627330897";


        System.out.println("media id code " + mediaid);

        Request request2 = new Request.Builder()

                .url("https://i.instagram.com/api/v1/media/" + mediaid + "/comments/?can_support_threading=false")

                .addHeader("accept", "*/*")
                .addHeader("accept-language", "en-US,en;q=0.9")
                .addHeader("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102\"")
                .addHeader("sec-ch-ua-mobile", "?0")
                .addHeader("sec-ch-ua-platform", "\"Windows\"")
                .addHeader("sec-fetch-dest", "empty")
                .addHeader("sec-fetch-mode", "no-cors")
                .addHeader("sec-fetch-site", "same-site")

                .addHeader("user-agent", "user-agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.0.0 Safari/537.36")
                .addHeader("x-asbd-id", "198387")
                .addHeader("x-csrftoken", "2y9aPvn5uajcxsoce6dj0BFrDlIhZ2Os")
                .addHeader("x-ig-app-id", "936619743392459")
                .addHeader("x-ig-www-claim", "hmac.AR2a0s-zR6Hdr23fE_Vi87zvcuSrHFY-d8M4qLMQoFBGCR-I")
                .addHeader("cookie", "mid=Ys-a7gALAAFccH9dgywSNklzj3b5; ig_did=BF468BE1-101F-4637-810C-E48720DC72EE; csrftoken=tYlcavtQkoZOa5V760VUQtAbPhkK0A7q; ds_user_id=46965647003; sessionid=46965647003:OV4MxOECCmGrZz:18:AYe3UUHyAzTQVeSAXDFxPq7AIwrRW6ekGLT8-cXJnw; dpr=2.5; datr=np3PYiSMCPtzBMdH1w0HnESj; shbid=\"18799\\05446965647003\\0541689569741:01f73c2eed2b16bacb44f6b23e0fef56e36c6be533580d2f05df09f4ead85fd5a99a2530\"; shbts=\"1658033741\\05446965647003\\0541689569741:01f7687cfbc52770e03e6e20720b946d72afb23490faede4cfeaa5b258b8914f0e897e87\"; rur=\"RVA\\05446965647003\\0541689594278:01f7adf85801951fec08f2af079198d3073db25cf25ca989332169e91fa6474869b07c8b\"")
                .addHeader("Referer", "https://www.instagram.com/")
                .addHeader("Referrer-Policy", "strict-origin-when-cross-origin")
.build();


        OkHttpClient client = new OkHttpClient();

        try (Response response2 = client.newCall(request2).execute()) {

            String string = response2.body().string();
            System.out.println(string);

            JSONObject jsonObject = new JSONObject(string);
              String ss="";

            JSONArray comments = (JSONArray) jsonObject.get("comments");
            for (int i = 0; i < comments.length(); i++) {
                JSONObject commentJSONObject = comments.getJSONObject(i);
                String text = commentJSONObject.getString("text");
                long created_at = commentJSONObject.getLong("created_at");
                String username = commentJSONObject.getJSONObject("user").getString("username");
                System.out.println();
                ss += "https://instagram.com/" + username + " " + text.substring(0, Math.min(50, text.length() - 1)) + "\n\n";


            }

        } catch (IOException | JSONException e) {

        }


        assertEquals(4, 2 + 2);
    }
}