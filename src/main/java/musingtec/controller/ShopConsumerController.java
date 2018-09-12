package musingtec.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class ShopConsumerController {


    @Autowired
    public RestTemplate restTemplate;


    @GetMapping("/getStuList")
    public String getStuList() {
        String stu = "欢迎使用负载均衡";
        String result = this.restTemplate.getForObject("http://SERVICE-HI/test", String.class);
        return result;
    }


}
