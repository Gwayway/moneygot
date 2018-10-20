package willbest.moneygot.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;
import willbest.moneygot.bean.message;

public interface messagemapper {
    @Insert("insert  into  message (messagecontext,messagepicture) values (#{messagecontext},#{messagepicture})")
    void  messageadd(message message);
    @Update("update  message set messagecontext=#{messagecontext},messagepicture=#{messagepicture}")
    void  messageupdate(message message);
}
