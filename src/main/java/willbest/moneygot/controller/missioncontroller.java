package willbest.moneygot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import willbest.moneygot.bean.mission;
import willbest.moneygot.service.missionservice;
import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Date;
@RestController
public class missioncontroller {
    @Resource
    missionservice missionservice;
    @RequestMapping("/missionadd")
    public  String missinadd(String missioncontext, Integer missionmoney, Date timeout, HttpSession session){
        mission mission=new mission();
        mission.setMissioncontext(missioncontext);
        mission.setMissionmoney(missionmoney);
        mission.setTimeout(timeout);
        return  missionservice.missionadd(mission,session);//
    }
    @RequestMapping("/missiondelete")
    public  String missiondelete(Integer missionid){
       return missionservice.missiondelete(missionid);
    }
    @RequestMapping("/missionupdate")
    public  String missionupdate(String missioncontext, Integer missionmoney, Date timeout){
        mission mission=new mission();
        mission.setTimeout(timeout);
        mission.setMissionmoney(missionmoney);
        mission.setMissioncontext(missioncontext);
       return missionservice.missionupdata(mission);
    }
}
