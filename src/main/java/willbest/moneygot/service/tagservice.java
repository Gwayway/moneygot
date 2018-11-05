package willbest.moneygot.service;

import org.springframework.stereotype.Service;
import willbest.moneygot.bean.tag;
import willbest.moneygot.bean.usertag;
import willbest.moneygot.mapper.tagmapper;
import willbest.moneygot.mapper.usermapper;
import willbest.moneygot.mapper.usertagmapper;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Service
public class tagservice {
    @Resource
    tagmapper tagmapper;
    @Resource
    usermapper usermapper;
    @Resource
    usertagmapper usertagmapper;
    public  String tagadd(tag tag, HttpSession session){
        Integer tagid=tagmapper.tagadd(tag);
        Integer userid=usermapper.gotuserid((String)session.getAttribute("username"));
        usertag usertag=new usertag();

        
        usertag.setTagid(tagid);
        usertag.setUserid(userid);
        usertagmapper.usertagadd(usertag);
        return  "1";
    }
    public  String tagdelete(Integer tagid){
        usertagmapper.usertagdelete(tagid);
        return  "标签删除成功！";
    }
}
