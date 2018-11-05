package willbest.moneygot.service;

import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;
import willbest.moneygot.mapper.searchmapper;

import javax.annotation.Resource;
import java.util.List;

@Service
public class searchservice {
    @Resource
    searchmapper searchmapper;
    public List findbycontext(String context,Integer currpage){
        PageHelper.startPage(currpage,10);
        List list=searchmapper.findsearch(context);
        return list;
    }
}
