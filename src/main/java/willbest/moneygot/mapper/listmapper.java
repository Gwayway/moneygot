package willbest.moneygot.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import willbest.moneygot.bean.message;
import willbest.moneygot.bean.mission;
import java.util.List;
@Mapper
public interface listmapper {
    @Select("select * from mission ")
    List<mission> gotallmissiondata();
    @Select("select * from message")
    List<message> gotallmessagedata();
    @Select("select * from mission where missionid in (select missionid from usermission where userid=#{userid})")
    List<mission> ownmission(Integer userid);
    @Select("select * from mission where missionid in (select missionid from missionaccept where userid=#{userid})")
    List<mission> gotmission(Integer userid);
}
