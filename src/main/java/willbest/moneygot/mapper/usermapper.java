package willbest.moneygot.mapper;

import org.apache.ibatis.annotations.Insert;

public interface usermapper {
    @Insert()
    void insert();
}
