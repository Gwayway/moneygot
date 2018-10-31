package willbest.moneygot.bean;

import org.springframework.stereotype.Component;

@Component
public class usertag {
    private  Integer userid;
    private  Integer tagid;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getTagid() {
        return tagid;
    }

    public void setTagid(Integer tagid) {
        this.tagid = tagid;
    }
}
