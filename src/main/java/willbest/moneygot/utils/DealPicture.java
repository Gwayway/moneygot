package willbest.moneygot.utils;

import java.io.*;
import java.sql.Blob;
//处理图片
public class DealPicture {
    //to输入流
    public InputStream ToInputStream(String uri) throws FileNotFoundException {
        return  new FileInputStream(uri);
    }
    //还原成图片
    public OutputStream ToPicture(Blob picture) throws Exception {
        InputStream inputStream=picture.getBinaryStream();
        OutputStream outputStream=new FileOutputStream("messagepicture.png");
        byte[] buffer=new  byte[1024];
        int len=0;
        while ((len = inputStream.read(buffer))!= -1){
            outputStream.write(buffer,0,len);
        }
        return outputStream;
    }
    }


