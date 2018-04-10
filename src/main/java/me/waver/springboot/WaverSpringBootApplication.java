package me.waver.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class WaverSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(WaverSpringBootApplication.class, args);
    }

    @RequestMapping(value = "")
    public String index(){}
}
