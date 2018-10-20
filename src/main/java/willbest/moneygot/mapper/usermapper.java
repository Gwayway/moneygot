package willbest.moneygot.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import willbest.moneygot.bean.user;

public interface usermapper {
    @Insert("insert  into userinfo (username, password, openid) values (#{username},#{password})")
    void   insert(user user);
    @Select("select  username from  userinfo where username=#{username}")
    String userexistcheck(String username);
    @Select("select  * from  userinfo where username=#{username}")
    user login(String username);

}
