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
    public  String missinadd(String missioncontext, Integer missionmoney, Date timeout, String username, String missionname) {

        System.out.print(timeout);
        mission mission=new mission();
        mission.setMissioncontext(missioncontext);
        mission.setMissionmoney(missionmoney);
        mission.setTimeout(timeout);
        mission.setMissionname(missionname);
        return  missionservice.missionadd(mission,username);
    }
    @RequestMapping("/missiondelete")
    public  String missiondelete(Integer missionid){
       return missionservice.missiondelete(missionid);
    }
    @RequestMapping("/missionupdate")
    public  String missionupdate(String missioncontext, Integer missionmoney, Date timeout, String missionname){
        mission mission=new mission();
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
    public  Integer missionaccept(String username,Integer missionid){
        if(username!=null&&missionid!=null){
            Integer userid= usermapper.gotuserid(username);
            missionaccept missionaccept=new missionaccept();
            missionaccept.setMissionid(missionid);
            missionaccept.setUserid(userid);
            return missionservice.missionaccept(missionaccept);
        }else {
            return 0;
        }
    }
}
