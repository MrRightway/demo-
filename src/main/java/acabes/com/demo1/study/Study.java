package acabes.com.demo1.study;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Hi")
public class Study {
    @GetMapping("/Hai")
    public String add(){

        return "Hello world";

    }
    
}
