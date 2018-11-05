package willbest.moneygot.mapper;
import org.apache.ibatis.annotations.*;
import willbest.moneygot.bean.message;
@Mapper
public interface messagemapper {
    @Insert("insert  into  message (messagecontext) values (#{messagecontext})")
    @SelectKey(keyProperty = "messageid",resultType =Integer.class,before = false,statement="call identity()")
    Integer  messageadd(message message);
    @Update("update  message set messagecontext=#{messagecontext} where messageid=#{messageid}")
    void  messageupdate(message message);
    @Select("select  * from  message where messageid=#{messageid}")
    message messagegot(Integer messageid);
}
