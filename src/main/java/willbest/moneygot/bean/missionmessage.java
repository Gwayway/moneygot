package willbest.moneygot.bean;

import org.springframework.stereotype.Component;

@Component
public class missionmessage {
    private  Integer missionid;
    private  Integer messageid;

    public Integer getMissionid() {
        return missionid;
    }

    public void setMissionid(Integer missionid) {
        this.missionid = missionid;
    }

    public Integer getMessageid() {
        return messageid;
    }

    public void setMessageid(Integer messageid) {
        this.messageid = messageid;
    }
}
