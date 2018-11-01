package willbest.moneygot.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import willbest.moneygot.bean.paper;
import willbest.moneygot.service.listservice;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class listcontroller {
    @Resource
    listservice listservice;
    @RequestMapping("/list")
    public List showlist(paper paper){
        return listservice.show(paper);
    }
}
