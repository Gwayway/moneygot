package willbest.moneygot.mapper;
import org.apache.ibatis.annotations.*;
import willbest.moneygot.bean.message;
@Mapper
public interface messagemapper {
    @Insert("insert  into  message (messagecontext,commentername,commenttime) values (#{messagecontext},#{commentername},#{commenttime})")
    @Options(useGeneratedKeys=true, keyProperty="messageid", keyColumn="id")
    Integer  messageadd(message message);
    @Update("update  message set messagecontext=#{messagecontext} where messageid=#{messageid}")
    void  messageupdate(message message);
    @Select("select  * from  message where messageid=#{messageid}")
    message messagegot(Integer messageid);
}
