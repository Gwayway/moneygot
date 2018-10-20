package willbest.moneygot.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import willbest.moneygot.bean.usermission;

public interface usermissionmapper {
    @Insert("inner  into  usermission (userid,missionid) values (#{userid},#{missionid})")
    void  usermissionadd(usermission usermission);
    @Delete("DELETE  from  usermission where  missionid=#{missionid}")
    void  usermissiondelete(usermission usermission);
}
