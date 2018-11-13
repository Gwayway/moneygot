package willbest.moneygot.service;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;
import willbest.moneygot.bean.mission;
import willbest.moneygot.bean.paper;
import willbest.moneygot.mapper.listmapper;
import willbest.moneygot.mapper.missionmapper;
import willbest.moneygot.oop.returnJson;

import javax.annotation.Resource;
import java.util.List;

@Service
public class listservice {
    @Resource
    missionmapper missionmapper;
    @Resource
    listmapper listmapper;
    List list=null;
    List<String> namelist=null;
    int listsize=0;
    public returnJson show(paper paper){
        returnJson returnJson=null;
        String type=paper.getType();
        int pagenum=paper.getPagenum();
        int pagessize=paper.getPagesize();
        if(paper.getType()!=null){
            switch (type){
                case "mission":{
                    PageHelper.startPage(pagenum,pagessize);
                    list=listmapper.gotalldata(type);
                    listsize=list.size();
                    for(int i=0;i<listsize;i++){
                        mission mission=(mission)list.get(i);
                        namelist.add(missionmapper.getusernamebymissionname(mission.getMissionname()));
                    }
                    returnJson.setObject(list);
                    returnJson.setObjiect2(namelist);
                    returnJson.setNum(1);
                    return  returnJson;
                }
            }
        }
        return null;
    }
}
