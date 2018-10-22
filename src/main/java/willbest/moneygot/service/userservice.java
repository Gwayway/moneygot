package willbest.moneygot.service;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.SessionAttribute;
import willbest.moneygot.bean.user;
import willbest.moneygot.mapper.usermapper;
import javax.annotation.Resource;
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
    public  String  userlogin(user user) throws Exception{
        String username=usermapper.userexistcheck(user.getUsername());
        if(username!=null){
            user userinfo=usermapper.login(user.getUsername());
            return user.getPassword()==userinfo.getPassword()?"登录成功！":"密码错误！";
        }
        else{
            return "register";
        }
    }
}
