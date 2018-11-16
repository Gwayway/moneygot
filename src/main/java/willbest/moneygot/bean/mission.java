package willbest.moneygot.bean;
import org.springframework.stereotype.Component;

import java.sql.Date;

@Component
public class mission {
    private Integer missionid;
    private  String missioncontext;
    private  Integer missionmoney;
    private Date timeout;
    private  String missionname;
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

    public Date getTimeout() {
        return timeout;
    }

    public void setTimeout(Date timeout) {
        this.timeout = timeout;
    }
}
