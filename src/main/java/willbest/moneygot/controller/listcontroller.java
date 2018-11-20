package willbest.moneygot.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import willbest.moneygot.oop.paper;
import willbest.moneygot.oop.returnJson;
import willbest.moneygot.service.listservice;

import javax.annotation.Resource;

@RestController
public class listcontroller {
    @Resource
    listservice listservice;
    @RequestMapping("/list")
    public returnJson showlist(Integer pagenum,Integer pagesize,String types,String username,Integer id){
        paper paper=new paper();
        paper.setId(id);
        paper.setPagenum(pagenum);
        paper.setPagesize(pagesize);
        paper.setTypes(types);
        paper.setUsername(username);
        return listservice.show(paper);
    }
}
