package willbest.moneygot.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.SelectKey;
import willbest.moneygot.bean.tag;

public interface tagmapper {
    @Insert("insert  into  tag (tagname)VALUES (tagname#{tagname})")
    @SelectKey(keyProperty = "tagid",resultType =Integer.class,before = false,statement="call identity()")
    Integer  tagadd(tag tag);
    @Delete("delete  from  tag where  tagid=#{tagid}")
    void  tagdelete(Integer tagid);
}
