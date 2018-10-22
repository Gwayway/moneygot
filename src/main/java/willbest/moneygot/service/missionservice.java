package willbest.moneygot.service;
import org.springframework.stereotype.Service;
import willbest.moneygot.bean.mission;
import willbest.moneygot.bean.usermission;
import willbest.moneygot.mapper.missionmapper;
import willbest.moneygot.mapper.usermissionmapper;

import javax.annotation.Resource;

@Service
public class missionservice {
    @Resource
    missionmapper  missionmapper;
    @Resource
    usermissionmapper usermissionmapper;
    public  String  missionadd(mission mission){//缺少userid数据
        Integer userid=null;
        Integer missionid=missionmapper.missionadd(mission);
        usermission usermission=new usermission();
        usermission.setMissionid(missionid);
        usermission.setUserid(userid);
        usermissionmapper.usermissionadd(usermission);
        return "任务添加成功！";
    }

}
