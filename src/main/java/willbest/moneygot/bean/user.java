package willbest.moneygot.bean;

import org.springframework.stereotype.Component;

@Component
public class user {
    private  Integer userid;
    private  String username;
    private  String password;
    public Integer getUserid() {
        return userid;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
