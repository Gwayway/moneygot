package willbest.moneygot.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import willbest.moneygot.bean.message;
import willbest.moneygot.bean.mission;
import willbest.moneygot.bean.tag;

import java.util.List;
@Mapper
public interface listmapper {
    @Select("select * from mission where state=1 ")
    List<mission> gotallmissiondata();
    @Select("select * from message where messageid in (select messageid from missionmessage where missionid=#{missionid})")
    List<message> gotallmessagedata(Integer missionid);
    @Select("select * from mission where missionid in (select missionid from usermission where userid=#{userid})")
    List<mission> ownmission(Integer userid);
    @Select("select * from mission where missionid in (select missionid from missionaccept where userid=#{userid})")
    List<mission> gotmission(Integer userid);
    @Select("select * from tag where tagid in(select tagid from usertag where userid=(select userid from userinfo where username=#{username}))")
    List<tag> gottagbyusername(String username);
}
