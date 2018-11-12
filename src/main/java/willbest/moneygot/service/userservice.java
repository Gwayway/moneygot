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
    public Integer userregister(user user){
        if(usermapper.userexistcheck(user.getUsername())==null){
            try{
                usermapper.insert(user);
            }
            catch (Exception e){
                return  0 ;
            }
            return  1;
        }
        else {
            return  2;//跳转到登陆
        }
    }
    //登录
    public  Integer  userlogin(user user, HttpSession session) throws Exception{
        String username=usermapper.userexistcheck(user.getUsername());
        if(username!=null){
            session.setAttribute("username",user.getUsername());
//            System.out.print(session.getAttribute("username"));
            user userinfo=usermapper.login(user.getUsername());
            return user.getPassword().equals(userinfo.getPassword())?1:0;
        }
        else{
            return 2;//跳转到注册
        }
    }
}
