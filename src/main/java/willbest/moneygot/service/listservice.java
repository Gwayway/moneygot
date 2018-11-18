package willbest.moneygot.service;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;
import willbest.moneygot.bean.mission;
import willbest.moneygot.mapper.usermapper;
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
    usermapper usermapper;
    @Resource
    missionmapper missionmapper;
    @Resource
    listmapper listmapper;
    public returnJson show(paper paper){
        List<String> namelist=new ArrayList<>();
        List<mission> list=new ArrayList<>();
        returnJson returnJson=new returnJson();
        String types=paper.getTypes();
        int pagenum=paper.getPagenum();
        int pagessize=paper.getPagesize();
        String username=paper.getUsername();
        if(paper.getTypes()!=null){
            switch (types){
                case "mission":{
                    PageHelper.startPage(pagenum,pagessize);
                    list=listmapper.gotallmissiondata();
                }break;
                case "ownmission":{
                    Integer userid=usermapper.gotuserid(username);
                    PageHelper.startPage(pagenum,pagessize);
                    list=listmapper.ownmission(userid);
                }break;
                case "gotmission":{
                    Integer userid=usermapper.gotuserid(username);
                    PageHelper.startPage(pagenum,pagessize);
                    list=listmapper.gotmission(userid);
                }
            }
        }
        for(int i=0;i<list.size();i++){
            mission mission=(mission)list.get(i);
            namelist.add(missionmapper.getusernamebymissionid(mission.getMissionid()));
        }
        returnJson.setObject2(namelist);
        returnJson.setObject(list);
        returnJson.setNum(1);
        return returnJson;
    }
}
