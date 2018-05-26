package service;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class GetFilterImg {

    public static void uploadImg(String filePath){
    String url="https://web.everphoto.cn/api/cv/shinkai/web";

        Map<String,String> fileMap=new HashMap<String, String>();
        fileMap.put("media",filePath);
        String contentType="image/jpeg";


    }

    public static void formUpload(String strUrl, Map<String,String> fileMap,String contentType){

        String result="";
        HttpURLConnection conn=null;
        String BOUNDARY="----WebKitFormBoundary7MA4YWxkTrZu0gW";
        try {
            URL url=new URL(strUrl);
            conn=(HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
