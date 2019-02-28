package top.westyle.service.feign.service.impl;

import org.springframework.stereotype.Component;
import top.westyle.service.feign.service.SchedualServiceHi;
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry " + name;
    }
}
