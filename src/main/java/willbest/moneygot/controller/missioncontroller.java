package willbest.moneygot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import willbest.moneygot.bean.mission;

@RestController
public class missioncontroller {
    @RequestMapping("/missionadd")
    public  String missinadd(mission mission){

    }
}
