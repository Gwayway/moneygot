package willbest.moneygot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import willbest.moneygot.service.searchservice;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class Searchcontroller {
    @Resource
    searchservice searchservice;
    @RequestMapping("/search")
    public List search(String context,Integer currpage){
        return  searchservice.findbycontext(context,currpage);
    }

}
