package willbest.moneygot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import willbest.moneygot.bean.mission;
import willbest.moneygot.bean.missionaccept;
import willbest.moneygot.mapper.usermapper;
import willbest.moneygot.service.missionservice;
import javax.annotation.Resource;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

@RestController
public class missioncontroller {
    @Resource
    usermapper usermapper;
    @Resource
    missionservice missionservice;
    @RequestMapping("/missionadd")
    public  String missinadd(String missioncontext, Integer missionmoney, String timeout, String username, String missionname,String imageurl) {
        mission mission=new mission();
        mission.setImageurl(imageurl);
        mission.setMissioncontext(missioncontext);
        mission.setMissionmoney(missionmoney);
        mission.setTimeout(timeout);
        mission.setMissionname(missionname);
        return  missionservice.missionadd(mission,username);
    }
    @RequestMapping("/missiondelete")
    public  Integer missiondelete(Integer missionid){
       return missionservice.missiondelete(missionid);
    }
    @RequestMapping("/missionupdate")
    public  Integer missionupdate(String missioncontext, Integer missionmoney, String timeout, String missionname,Integer missionid,String imageurl){
        mission mission=new mission();
        mission.setImageurl(imageurl);
        mission.setMissionid(missionid);
        mission.setTimeout(timeout);
        mission.setMissionmoney(missionmoney);
        mission.setMissioncontext(missioncontext);
        mission.setMissionname(missionname);
       return missionservice.missionupdata(mission);
    }
    @RequestMapping("/missiongot")
    public mission getmission(Integer missionid){
        return missionservice.missiongot(missionid);
    }
    @RequestMapping("/missionaccept")
    public  Integer missionaccept(String username,Integer missionid,Integer state){
        if(username!=null&&missionid!=null){
            Integer userid= usermapper.gotuserid(username);
            missionaccept missionaccept=new missionaccept();
            missionaccept.setMissionid(missionid);
            missionaccept.setUserid(userid);
            return missionservice.missionaccept(missionaccept,state);
        }else {
            return 0;
        }
    }
    @RequestMapping("/missionout")
    public Integer missionout(Integer missionid,String username){
        return missionservice.missionout(missionid);
    }
}
