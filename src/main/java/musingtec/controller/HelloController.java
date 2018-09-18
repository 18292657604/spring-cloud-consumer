package musingtec.controller;

import musingtec.service.HelloService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by LSY on 2018/8/29.
 */
@RestController
public class HelloController {


    private HelloService helloService;

    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @RequestMapping("/test")
    public String test() {
        //返回结果
        String result = helloService.hello();

        return result;
    }
}
