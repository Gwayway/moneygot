package willbest.moneygot.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface searchmapper {
    @Select("select distinct * from mission where missionname like '%#{context}%' or misssioncontext like '%#{context}%'")
    List findsearch(String context);
}
