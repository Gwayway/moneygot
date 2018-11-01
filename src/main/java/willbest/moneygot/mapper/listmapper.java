package willbest.moneygot.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import willbest.moneygot.bean.mission;
import java.util.List;
@Mapper
public interface listmapper {
    @Select("select * from #{type}")
    List gotalldata(String type);
}
