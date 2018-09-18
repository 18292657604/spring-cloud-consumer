package musingtec.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by angel on 2018/9/18.
 */
@FeignClient(value = "service-hi")
public interface HelloService {

    @GetMapping("/test")
    public String hello();
}
