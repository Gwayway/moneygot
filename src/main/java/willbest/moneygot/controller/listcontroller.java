package willbest.moneygot.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import willbest.moneygot.bean.paper;
import willbest.moneygot.service.listservice;

import javax.annotation.Resource;

@RestController
@ResponseBody
public class listcontroller {
    @Resource
    listservice listservice;
    @RequestMapping("/list")
    public Object gotmissionpage(paper paper){//前端返回一个paper对象
        return listservice.gotshowpages(paper);
    }
}
