package willbest.moneygot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import willbest.moneygot.bean.tag;
import willbest.moneygot.service.tagservice;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@RestController
public class tagcontroller {
    @Resource
    tagservice tagservice;
    @RequestMapping("/tagadd")
    public  String tagadd(String tagname, HttpSession session){
        tag tag=new tag();
        tag.setTagname(tagname);
        return tagservice.tagadd(tag,session);
    }
    @RequestMapping("/tagdelete")
    public  String tagdelete(Integer tagid){
        return  tagservice.tagdelete(tagid);
    }
}
