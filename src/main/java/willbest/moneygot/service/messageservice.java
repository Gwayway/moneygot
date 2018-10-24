package willbest.moneygot.service;

import org.springframework.stereotype.Service;
import willbest.moneygot.bean.message;
import willbest.moneygot.bean.missionmessage;
import willbest.moneygot.mapper.messagemapper;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Service
public class messageservice {
    @Resource
    messagemapper messagemapper;
    @Resource
    missionmessage missionmessage;
    public  String messageadd(message message, HttpSession session){//还差misisonid,未添加到mm表
        messagemapper.messageadd(message);
        return  "评论成功！";
    }
}