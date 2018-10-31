package willbest.moneygot.bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.sql.Blob;
@Component
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
