package willbest.moneygot.service;

import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;
import willbest.moneygot.bean.mission;
import willbest.moneygot.mapper.missionmapper;
import willbest.moneygot.mapper.searchmapper;
import willbest.moneygot.oop.returnJson;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class searchservice {
    @Resource
    searchmapper searchmapper;
    @Resource
    missionmapper missionmapper;
    public returnJson findbycontext(String context, Integer currpage){
        List<String> namelist=new ArrayList<>();
        String searchtext=context;
        PageHelper.startPage(currpage,10);
        List list=searchmapper.findsearch(searchtext);
        returnJson json=new returnJson();
        if(list.isEmpty()) {
            json.setNum(2);
        }else {
            json.setNum(1);
            for(int i=0;i<list.size();i++){
                mission mission=(mission) list.get(i);
                namelist.add(missionmapper.getusernamebymissionname(mission.getMissionname()));
            }
            json.setObjiect2(namelist);
        }
        json.setObject(list);
        return json;
    }

}
