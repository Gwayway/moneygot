package willbest.moneygot.bean;

import org.springframework.stereotype.Component;

@Component
public class tag {
    private  Integer tagid;
    private  String tagname;
    public String getTagname() {
        return tagname;
    }

    public void setTagname(String tagname) {
        this.tagname = tagname;
    }

    public Integer getTagid() {
        return tagid;
    }
}
