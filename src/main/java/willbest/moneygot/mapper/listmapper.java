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
}
