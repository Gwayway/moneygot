package willbest.moneygot.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import willbest.moneygot.bean.usermission;
@Mapper
public interface usermissionmapper {
    @Insert("inner  into  usermission (userid,missionid) values (#{userid},#{missionid})")
    void  usermissionadd(usermission usermission);
    @Delete("delete  from  usermission where  missionid=#{missionid}")
    void  usermissiondelete(Integer missionid);
}
