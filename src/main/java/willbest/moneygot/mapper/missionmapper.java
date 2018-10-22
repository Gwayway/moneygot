package willbest.moneygot.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import willbest.moneygot.bean.mission;

public interface missionmapper {
    @Insert("insert  into  mission (missioncontext,missionmoney,timeout) values (#{missioncontext},#{missionmoney},#{timeout})")
    void missionadd(mission mission);
    @Delete("delete  from  mission where missionid=#{missionid}")
    void missiondelete(String missionid);
    @Select("select  * from  mission where  missionid#{missionid}")
    mission missiongot(Integer missionid);
    @Update("update  mission set  missioncontext=#{missioncontext},missionmoney=#{missionmoney},timeout=#{timeout}")
    void  missionipdate(Integer missionid);
}
