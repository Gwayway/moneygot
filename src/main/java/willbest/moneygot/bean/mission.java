package willbest.moneygot.bean;
import org.springframework.stereotype.Component;

import java.sql.Date;

@Component
public class mission {
    private Integer state;
    private Integer missionid;
    private  String missioncontext;
    private  Integer missionmoney;
    private String timeout;
    private  String missionname;
    private String imageurl;
    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getMissionname() {
        return missionname;
    }

    public void setMissionname(String missionname) {
        this.missionname = missionname;
    }
    public String getMissioncontext() {
        return missioncontext;
    }

    public void setMissioncontext(String missioncontext) {
        this.missioncontext = missioncontext;
    }

    public Integer getMissionmoney() {
        return missionmoney;
    }

    public void setMissionmoney(Integer missionmoney) {
        this.missionmoney = missionmoney;
    }

    public Integer getMissionid() {
        return missionid;
    }

    public void setMissionid(Integer missionid) {
        this.missionid = missionid;
    }

    public String getTimeout() {
        return timeout;
    }

    public void setTimeout(String timeout) {
        this.timeout = timeout;
    }
}
