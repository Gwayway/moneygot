package willbest.moneygot.mapper;

import org.apache.ibatis.annotations.*;
import willbest.moneygot.bean.mission;
@Mapper
public interface missionmapper {
    @Insert("insert  into  mission (missioncontext,missionmoney,timeout,missionname) values (#{missioncontext},#{missionmoney},#{timeout},#{missionname})")
    @SelectKey(keyProperty = "missionid",resultType =Integer.class,before = false,statement="call identity()")
    Integer missionadd(mission mission);
    @Delete("delete  from  mission where missionid=#{missionid}")
    void missiondelete(Integer missionid);
    @Select("select  * from  mission where  missionid#{missionid}")
    mission missiongot(Integer missionid);
    @Update("update  mission set  missioncontext=#{missioncontext},missionmoney=#{missionmoney},timeout=#{timeout},missionname=#{missionname} where missionid=#{missionid}")
    void  missionupdate(mission mission);
    @Select("select  username from userinfo where userid=(select userid from usermission where missionid=(select missionid from mission where missionname=#{missionname}))")
    String getusernamebymissionname(String missionname);
}
