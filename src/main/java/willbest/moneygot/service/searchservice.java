package willbest.moneygot.service;

import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;
import willbest.moneygot.mapper.searchmapper;
import willbest.moneygot.oop.returnJson;

import javax.annotation.Resource;
import java.util.List;

@Service
public class searchservice {
    @Resource
    searchmapper searchmapper;
    public returnJson findbycontext(String context, Integer currpage){
        String searchtext=context;
        PageHelper.startPage(currpage,10);
        List list=searchmapper.findsearch(searchtext);
        returnJson json=new returnJson();
        if(list.isEmpty()) {
            json.setNum(2);
        }else {
            json.setNum(1);
        }
        json.setObject(list);
        return json;
    }

}
