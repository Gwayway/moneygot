package willbest.moneygot.service;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;
import willbest.moneygot.bean.paper;
import willbest.moneygot.mapper.listmapper;

import javax.annotation.Resource;
import java.util.List;

@Service
public class listservice {
    @Resource
    listmapper listmapper;
    public List show(paper paper){
        String type=paper.getType();
        int pagenum=paper.getPagenum();
        int pagessize=paper.getPagesize();
        if(paper.getType()!=null){
            switch (type){
                case "mission":{
                    PageHelper.startPage(pagenum,pagessize);
                    return listmapper.gotalldata(type);
                }
                case "message":{
                    PageHelper.startPage(pagenum,pagessize);
                    return listmapper.gotalldata(type);
                }
            }
        }
        return null;
    }
}
