package willbest.moneygot.bean;

import org.springframework.stereotype.Component;

@Component
public class usermission {
    private  Integer missionid;
    private  Integer userid;

    public Integer getMissionid() {
        return missionid;
    }

    public void setMissionid(Integer missionid) {
        this.missionid = missionid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }
}
