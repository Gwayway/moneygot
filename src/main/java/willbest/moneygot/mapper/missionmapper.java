package willbest.moneygot.mapper;

import org.apache.ibatis.annotations.*;
import willbest.moneygot.bean.mission;
import willbest.moneygot.bean.missionaccept;

import java.util.List;

@Mapper
public interface missionmapper {
    @Insert("insert  into  mission (missioncontext,missionmoney,timeout,missionname) values (#{missioncontext},#{missionmoney},#{timeout},#{missionname})")
    @Options(useGeneratedKeys=true, keyProperty="missionid", keyColumn="id")
    void missionadd(mission mission);
    @Delete("delete from mission where missionid=#{missionid}")
    void missiondelete(Integer missionid);
    @Select("select  * from  mission where  missionid=#{missionid}")
    mission missiongot(Integer missionid);
    @Update("update  mission set  missioncontext=#{missioncontext},missionmoney=#{missionmoney},timeout=#{timeout},missionname=#{missionname} where missionid=#{missionid}")
    void  missionupdate(mission mission);
    @Select("select  username from userinfo where userid=(select userid from usermission where missionid=#{missionid})")
    String getusernamebymissionid(Integer missionid);
    @Insert("insert  into  missionaccept (missionid,userid) values (#{missionid},#{userid})")
    void missionaccept(missionaccept missionaccept);
    @Select("select id from missionaccept where missionid=#{missionid}")
    Integer existmission(Integer missionid);
    @Update("update mission set state=#{state} where missionid=#{missionid}")
    void  missionstatechange(@Param("state") Integer state,@Param("missionid") Integer missionid);
    @Delete("delete from missionaccept where missionid=#{missionid}")
    void  missionout(Integer missionid);
    @Delete("delete from usermission where missionid=#{missionid}")
    void usermissiondelete(Integer missionid);
}
