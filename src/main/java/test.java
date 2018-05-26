import Bean.Message;
import com.google.gson.Gson;
import service.Util;

public class test{

    public static void main(String[] args) {

        Gson gson=new Gson();
        Message message=gson.fromJson(Util.sendPost("F:\\图片\\1.jpg").toString(),Message.class);
        System.out.println(message.getCode());
    }
}