package willbest.moneygot.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import willbest.moneygot.bean.usertag;
@Mapper
public interface usertagmapper {
    @Insert("insert  into  usertag (userid,tagid) values (userid=#{userid},tagid=#{tagid})")
    void  usertagadd(usertag usertag);
    @Delete("delete  from  usertag where userid=#{userid}")
    void usertagdelete(Integer userid);
}
