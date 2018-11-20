package willbest.moneygot.bean;
import org.springframework.stereotype.Component;
@Component
public class message {
    private Integer messageid;
    private String messagecontext;
    private String commentername;
    private String commenttime;

    public String getCommenttime() {
        return commenttime;
    }

    public void setCommenttime(String commenttime) {
        this.commenttime = commenttime;
    }

    public void setMessageid(Integer messageid) {
        this.messageid = messageid;
    }

    public String getCommentername() {
        return commentername;
    }

    public void setCommentername(String commentername) {
        this.commentername = commentername;
    }

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
