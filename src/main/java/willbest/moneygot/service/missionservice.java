package willbest.moneygot.service;
import org.springframework.stereotype.Service;
import willbest.moneygot.bean.mission;
import willbest.moneygot.mapper.messagemapper;
import willbest.moneygot.mapper.missionmapper;

import javax.annotation.Resource;

@Service
public class missionservice {
    @Resource
    missionmapper  missionmapper;
    @Resource
    messagemapper messagemapper;
    public  void  missionadd(mission mission){

    }
}
