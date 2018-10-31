package willbest.moneygot.service;

import com.github.pagehelper.Page;
import org.springframework.stereotype.Service;
import willbest.moneygot.bean.mission;
import willbest.moneygot.bean.paper;
import willbest.moneygot.mapper.listmapper;
import willbest.moneygot.utils.DealPage;

import javax.annotation.Resource;
import java.util.List;

@Service
public class listservice {
    @Resource
    listmapper listmapper;
    public  Object gotshowpages(paper paper){
        if(paper.getType()!=null){
            switch (paper.getType()){
                case "mission":{
                    List<mission> missionlist=listmapper.gotallmission();
                    return new DealPage<mission>(missionlist).getList();
                }
            }
        }else {
            return null;
        }
        return  null;
    }
}
