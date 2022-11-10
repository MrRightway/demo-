package acabes.com.demo1.study;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloworld {

    @GetMapping("/hello")
    public  String getHello(){

        return "Hello Guys Hope Your doing good";
    }
}
