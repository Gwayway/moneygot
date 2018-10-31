package willbest.moneygot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;


@SpringBootApplication
public class MoneygotApplication {

    public static void main(String[] args) {
        SpringApplication.run(MoneygotApplication.class, args);
    }
}
