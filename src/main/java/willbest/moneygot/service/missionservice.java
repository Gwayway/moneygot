package willbest.moneygot.service;
import org.springframework.stereotype.Service;
import willbest.moneygot.bean.mission;
import willbest.moneygot.bean.missionaccept;
import willbest.moneygot.bean.usermission;
import willbest.moneygot.mapper.missionmapper;
import willbest.moneygot.mapper.usermapper;
import willbest.moneygot.mapper.usermissionmapper;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.sql.SQLException;

@Service
public class missionservice {
    @Resource
    missionmapper  missionmapper;
    @Resource
    usermissionmapper usermissionmapper;
    @Resource
    usermapper usermapper;
    public  String  missionadd(mission mission,String username){
        missionmapper.missionadd(mission);
        Integer userid=usermapper.gotuserid(username);
        Integer missionid=mission.getMissionid();
        usermission usermission=new usermission();
        usermission.setMissionid(missionid);
        usermission.setUserid(userid);
        usermissionmapper.usermissionadd(usermission);
        return "1";
    }
    public Integer missiondelete(Integer missionid){
        Integer i=1;
        try{
            missionmapper.usermissiondelete(missionid);
            missionmapper.missiondelete(missionid);
        }catch (Exception e){
            i=0;
            throw e;
        }
        return i;
    }
    public  Integer missionupdata(mission mission){
        missionmapper.missionupdate(mission);
        return 1;
    }
    public  mission missiongot(Integer missionid){
        return missionmapper.missiongot(missionid);
    }
    public  Integer missionaccept(missionaccept missionaccept,Integer state ){
        Integer missionid=missionaccept.getMissionid();
        Integer sta=missionmapper.existmission(missionid);
        if(sta==null){
            missionmapper.missionstatechange(state,missionid);
            missionmapper.missionaccept(missionaccept);
          return 1;
        }else {
            return 2;
        }
    }
    public  Integer missionout(Integer missionid) {
        Integer i=1;
        try {
            missionmapper.missionout(missionid);
        }catch (Exception e){
            i=0;
            throw e;
        }
        return i;
    }
}
