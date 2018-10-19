package willbest.moneygot.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import willbest.moneygot.utils.DealWxCode;

@RestController
public class Logincontroller {
    @RequestMapping("/hi")
    public void  got(String code) throws Exception {
        String a=new DealWxCode(code).gotopenid();
        System.out.print(a);
    }
}
