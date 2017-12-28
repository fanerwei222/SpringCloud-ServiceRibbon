package com.ulyne.consumer.controller;

import com.ulyne.consumer.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * hello 控制器
 * Created by fanwei_last on 2017/12/28.
 */
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    /**
     * hi api
     * @param name
     * @return
     */
    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name){
        return helloService.hiService(name);
    }
}
