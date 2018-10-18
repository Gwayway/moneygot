package willbest.moneygot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class aa {
    @RequestMapping("/hi")
    public  String got(  String name){
        System.out.print(name);
        return  "阿华田！";
    }
}
