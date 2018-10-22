package willbest.moneygot.service;
import org.springframework.stereotype.Service;
import willbest.moneygot.bean.mission;
import willbest.moneygot.bean.usermission;
import willbest.moneygot.mapper.missionmapper;

import javax.annotation.Resource;

@Service
public class missionservice {
    @Resource
    missionmapper  missionmapper;
    @Resource
    usermission usermission;
    public  String  missionadd(mission mission){//缺少userid数据
        missionmapper.missionadd(mission);
        return "任务添加成功！";
    }
}
