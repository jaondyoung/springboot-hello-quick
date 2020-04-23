package cn.ly.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @RequestMapping("hello")
    @ResponseBody
    public String hello(){
        System.out.println("更新代码");
        System.out.println("dev分支添加代码");
        return "hello quick";
    }
}
