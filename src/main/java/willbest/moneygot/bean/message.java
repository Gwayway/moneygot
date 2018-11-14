package willbest.moneygot.bean;
import org.springframework.stereotype.Component;
@Component
public class message {
    private Integer messageid;
    private String messagecontext;
    public String getMessagecontext() {
        return messagecontext;
    }
    public void setMessagecontext(String messagecontext) {
        this.messagecontext = messagecontext;
    }
    public Integer getMessageid() {
        return messageid;
    }
}
