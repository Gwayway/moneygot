package willbest.moneygot.service;
import org.springframework.stereotype.Service;
import willbest.moneygot.bean.mission;
import willbest.moneygot.bean.usermission;
import willbest.moneygot.mapper.missionmapper;
import willbest.moneygot.mapper.usermapper;
import willbest.moneygot.mapper.usermissionmapper;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Service
public class missionservice {
    @Resource
    missionmapper  missionmapper;
    @Resource
    usermissionmapper usermissionmapper;
    @Resource
    usermapper usermapper;
    public  String  missionadd(mission mission, HttpSession session){
        Integer userid=usermapper.gotuserid((String) session.getAttribute("username"));
        Integer missionid=missionmapper.missionadd(mission);
        usermission usermission=new usermission();
        usermission.setMissionid(missionid);
        usermission.setUserid(userid);
        usermissionmapper.usermissionadd(usermission);
        return "1";
    }
    public String missiondelete(Integer missionid){
        usermissionmapper.usermissiondelete(missionid);
        return "删除了任务以及相关评论！";
    }
    public  String missionupdata(mission mission){
        missionmapper.missionupdate(mission);
        return "更新成功！";
    }
    public  mission missiongot(Integer missionid){
        return missionmapper.missiongot(missionid);
    }
}
