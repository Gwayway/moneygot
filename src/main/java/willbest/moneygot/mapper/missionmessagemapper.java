package willbest.moneygot.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import willbest.moneygot.bean.missionmessage;
@Mapper
public interface missionmessagemapper {
    @Insert("insert  into  missionmessage (missionid,messageid) values (#{missionid},#{messageid})")
    void  missionmessageadd(missionmessage missionmessage);
    @Delete("delete  from  missionmessage where mission=#{missionid}")
    void  missionmessagedelete(Integer missionid);
}
