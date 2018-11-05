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
    public String messageadd(Integer missionid, String messagecontext){
        if(missionid!=null){
            message message=new message();
            message.setMessagecontext(messagecontext);
            return  messageservice.messageadd(message,missionid);
        }
        return "0";
    }
}
