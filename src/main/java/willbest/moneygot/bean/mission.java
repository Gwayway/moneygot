package willbest.moneygot.bean;
import java.util.Date;
public class mission {
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

    public Date getTimeout() {
        return timeout;
    }
    public void setTimeout(Date timeout) {
        this.timeout = timeout;
    }
}