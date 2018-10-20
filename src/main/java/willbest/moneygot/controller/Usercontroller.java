package willbest.moneygot.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import willbest.moneygot.bean.user;
import willbest.moneygot.service.userservice;
import javax.annotation.Resource;
@RestController
public class Usercontroller {
    @Resource
    userservice userservice;
    @RequestMapping("/register")
    public String register(String username, String password){
        user user=new user();
        user.setPassword(password);
        user.setUsername(username);
        return  userservice.userregister(user);
    }
    @RequestMapping("/login")
    public  String  login(String username, String password) throws Exception {
        user user=new user();
        user.setUsername(username);
        user.setPassword(password);
        return  userservice.userlogin(user);
    }
}
