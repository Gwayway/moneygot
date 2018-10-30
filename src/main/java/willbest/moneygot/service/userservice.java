package willbest.moneygot.service;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.SessionAttribute;
import willbest.moneygot.bean.user;
import willbest.moneygot.mapper.usermapper;
import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Service
public class userservice {
    @Resource
    usermapper usermapper;
    //注册
    public String userregister(user user ){
        if(usermapper.userexistcheck(user.getUsername())==null){
            try{
                usermapper.insert(user);
            }
            catch (Exception e){
                return  "注册插入数据失败!";
            }
            return  "注册成功！";
        }
        else {
            return  "login";
        }
    }
    //登录
    public  String  userlogin(user user, HttpSession session) throws Exception{
        String username=usermapper.userexistcheck(user.getUsername());
        if(username!=null){
            session.setAttribute("username",user.getUsername());
            user userinfo=usermapper.login(user.getUsername());
            return user.getPassword()==userinfo.getPassword()?"1":"2";
        }
        else{
            return "register";
        }
    }
}
