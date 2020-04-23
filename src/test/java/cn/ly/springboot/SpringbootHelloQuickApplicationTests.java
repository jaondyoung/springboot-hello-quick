package cn.ly.springboot;

import cn.ly.springboot.entity.Person;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class SpringbootHelloQuickApplicationTests {
    private Logger logger = LoggerFactory.getLogger(SpringbootHelloQuickApplicationTests.class);

    @Autowired
    Person person;

    @Autowired
    ApplicationContext ioc;

    @Test
    public void testHelloService(){
        System.out.println(ioc.containsBean("helloService2"));
    }

    @Test
    void contextLoads() {
        System.out.println(person);
    }

    @Test
    public void testLog(){

        // spring整合所有日志
        logger.trace("trace 日志");
        logger.debug("debug 日志");
        logger.info("info 日志");
        logger.warn("warn 日志");
        logger.error("error 日志");
    }

}
