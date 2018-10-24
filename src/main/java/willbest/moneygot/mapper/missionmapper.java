package willbest.moneygot.mapper;

import org.apache.ibatis.annotations.*;
import willbest.moneygot.bean.mission;

public interface missionmapper {
    @Insert("insert  into  mission (missioncontext,missionmoney,timeout) values (#{missioncontext},#{missionmoney},#{timeout})")
    @SelectKey(keyProperty = "missionid",resultType =Integer.class,before = false,statement="call identity()")
    Integer missionadd(mission mission);
    @Delete("delete  from  mission where missionid=#{missionid}")
    void missiondelete(Integer missionid);
    @Select("select  * from  mission where  missionid#{missionid}")
    mission missiongot(Integer missionid);
    @Update("update  mission set  missioncontext=#{missioncontext},missionmoney=#{missionmoney},timeout=#{timeout} where missionid=#{missionid}")
    void  missionupdate(mission mission);
}
