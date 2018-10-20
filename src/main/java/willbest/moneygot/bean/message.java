package willbest.moneygot.bean;
import java.sql.Blob;
public class message {
    private String messagecontext;
    private Blob messagepiture;

    public String getMessagecontext() {
        return messagecontext;
    }

    public void setMessagecontext(String messagecontext) {
        this.messagecontext = messagecontext;
    }

    public Blob getMessagepiture() {
        return messagepiture;
    }

    public void setMessagepiture(Blob messagepiture) {
        this.messagepiture = messagepiture;
    }
}
