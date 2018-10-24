package willbest.moneygot.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttribute;
import willbest.moneygot.bean.user;
import willbest.moneygot.service.userservice;
import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@RestController
public class usercontroller {
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
    public  String  login(String username, String password, HttpSession session) throws Exception {
        user user=new user();
        user.setUsername(username);
        user.setPassword(password);
        return  userservice.userlogin(user,session);
    }
}
