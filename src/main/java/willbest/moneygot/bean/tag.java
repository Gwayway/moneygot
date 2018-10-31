package willbest.moneygot.bean;

import org.springframework.stereotype.Component;

@Component
public class tag {
    private  String tagname;

    public String getTagname() {
        return tagname;
    }

    public void setTagname(String tagname) {
        this.tagname = tagname;
    }
}
