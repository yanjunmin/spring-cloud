package top.westyle.service.feign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import top.westyle.service.feign.service.SchedualServiceHi;

@RestController
public class HiController {
    @Autowired
    SchedualServiceHi schedualServiceHi;
    @GetMapping("/hi")
    public String sayHi(@RequestParam String name) {
        return schedualServiceHi.sayHiFromClientOne(name);
    }
}
