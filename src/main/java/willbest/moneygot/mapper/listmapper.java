package willbest.moneygot.mapper;

import org.apache.ibatis.annotations.Select;
import willbest.moneygot.bean.mission;
import java.util.List;
public interface listmapper {
    @Select("select * from mission")
    List<mission> gotallmission();
}
