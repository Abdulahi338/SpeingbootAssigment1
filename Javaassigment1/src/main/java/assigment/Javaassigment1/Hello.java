package assigment.Javaassigment1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @GetMapping("/")
    public  String hel(){
        return "HEy ..............";
    }
    @GetMapping("/greet/{name}")
    public String greet(@PathVariable String name){
        return "Hello" +name;
    }
}
