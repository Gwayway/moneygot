package willbest.moneygot.mapper;

import org.apache.ibatis.annotations.*;
import willbest.moneygot.bean.tag;

import java.util.List;

@Mapper
public interface tagmapper {
    @Insert("insert  into  tag (tagname) VALUES (#{tagname})")
    @Options(useGeneratedKeys=true, keyProperty="tagid", keyColumn="id")
    Integer  tagadd(tag tag);
    @Delete("delete  from  tag where  tagid=#{tagid}")
    void  tagdelete(Integer tagid);
}
