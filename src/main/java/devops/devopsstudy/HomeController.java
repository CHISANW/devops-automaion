package devops.devopsstudy;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HomeController {

    @GetMapping("/")
    public String test(){
        log.info("웹훅 테스트");
        return "hello jenkins Docker Study";
    }
}
