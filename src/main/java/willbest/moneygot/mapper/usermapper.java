package willbest.moneygot.mapper;

import org.apache.ibatis.annotations.Insert;

public interface usermapper {
    @Insert("insert  into userinfo (username, password, openid) values (#{username},#{password},#{openid})")
    void insert();
}
