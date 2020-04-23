package cn.ly.springboot.config;

import cn.ly.springboot.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 代替以前的配置文件
 */
@Configuration
public class MyConfig {


    @Bean
    public HelloService helloService(){
        return new HelloService();
    }

    @Bean
    public HelloService helloService2(){
        return new HelloService();
    }
}
