package willbest.moneygot.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import willbest.moneygot.bean.user;

public interface usermapper {
    @Insert("insert  into userinfo (username, password, openid) values (#{username},#{password})")
    void   insert(user user);
    @Select("select  username from  userinfo where username=#{username}")
    String userexistcheck(String username);
    @Select("select  * from  userinfo where username=#{username}")
    user login(String username);
    @Update("update  userinfo set username=#{username},password=#{password} where userid=#{userid}")
    void  userupdate(user user);
    @Select("select  userid from  userinfo where username=#{username}")
    Integer gotuserid(String username);

}
