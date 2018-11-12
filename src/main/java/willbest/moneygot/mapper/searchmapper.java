package willbest.moneygot.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import willbest.moneygot.bean.mission;

import java.util.List;
@Mapper
public interface searchmapper {
    @Select("select  * from mission where missionname=#{searchtext}")
    List<mission> findsearch(String searchtext);
}
