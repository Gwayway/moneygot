package willbest.moneygot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import willbest.moneygot.bean.message;
import willbest.moneygot.service.messageservice;

import javax.annotation.Resource;
import java.net.URL;

@RestController
public class messagecontroller {
    @Resource
    messageservice messageservice;
    @RequestMapping("/messageadd")
    public String messageadd(Integer missionid, String messagecontext,String commentername,String commenttime){
            message message=new message();
            message.setCommenttime(commenttime);
            message.setMessagecontext(messagecontext);
            message.setCommentername(commentername);
            return  messageservice.messageadd(message,missionid);
    }
}
