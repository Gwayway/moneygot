package willbest.moneygot.service;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;
import willbest.moneygot.bean.mission;
import willbest.moneygot.oop.paper;
import willbest.moneygot.mapper.listmapper;
import willbest.moneygot.mapper.missionmapper;
import willbest.moneygot.oop.returnJson;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class listservice {
    @Resource
    missionmapper missionmapper;
    @Resource
    listmapper listmapper;
    List list=new ArrayList();
    List<String> namelist=new ArrayList<>();
    int listsize=0;
    public returnJson show(paper paper){
        returnJson returnJson=new returnJson();
        String types=paper.getTypes();
        int pagenum=paper.getPagenum();
        int pagessize=paper.getPagesize();
        if(paper.getTypes()!=null){
            switch (types){
                case "mission":{
                    PageHelper.startPage(pagenum,pagessize);
                    list=listmapper.gotalldata();
                    listsize=list.size();
                    for(int i=0;i<listsize;i++){
                        mission mission=(mission)list.get(i);
                        System.out.print(mission.getMissionname());
                        namelist.add(missionmapper.getusernamebymissionid(mission.getMissionid()));
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
