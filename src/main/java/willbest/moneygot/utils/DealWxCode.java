package willbest.moneygot.utils;

import com.alibaba.fastjson.JSON;
import com.google.gson.Gson;
import jdk.nashorn.internal.runtime.JSONFunctions;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

//处理微信小程序的code，解析json,获得openid和session_key
public class DealWxCode {
    private final  String appid="wx1f87197260f1645f";
    private  final  String appsc="fbee47efadf204d241e7d3a876eaca71";
    private String code;
    public DealWxCode(String code){
        this.code=code;
    }
    public  String gotopenid() throws Exception{
        String temp="https://api.weixin.qq.com/sns/jscode2session?appid="+appid+
                "&secret="+appsc+"&js_code="+ code +"&grant_type=authorization_code";
        URL url=new URL(temp);
        HttpURLConnection connection=(HttpURLConnection)url.openConnection();
        connection.connect();
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(connection.getInputStream(),"UTF-8"));
        String line=null;
        StringBuilder stringBuilder=new StringBuilder();
        while ((line=bufferedReader.readLine())!=null){
            stringBuilder.append(line);
        }
        bufferedReader.close();
        connection.disconnect();
        //解析json,获得openid
        Map map=(Map)JSON.parse(stringBuilder.toString());
        return (String)map.get("openid");
    }
}
