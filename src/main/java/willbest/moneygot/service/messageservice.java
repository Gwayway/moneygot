package willbest.moneygot.service;

import org.springframework.stereotype.Service;
import willbest.moneygot.bean.message;
import willbest.moneygot.bean.missionmessage;
import willbest.moneygot.mapper.messagemapper;
import willbest.moneygot.mapper.missionmessagemapper;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Service
public class messageservice {
    @Resource
    messagemapper messagemapper;
    @Resource
    missionmessagemapper missionmessagemapper;
    public  String messageadd(message message,Integer missionid){
        Integer messageid=messagemapper.messageadd(message);
        missionmessage missionmessage=new missionmessage();
        missionmessage.setMessageid(missionid);
        missionmessage.setMessageid(messageid);
        missionmessagemapper.missionmessageadd(missionmessage);
        return  "1";
    }
}