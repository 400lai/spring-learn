package com.laiiiii.test;

import com.laiiiii.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextTest {
    /**
     * 测试Spring ApplicationContext应用上下文功能
     * 演示如何使用高级IOC容器加载配置并获取Bean实例
     */
    public static void main(String[] args) {
        // 创建ApplicationContext容器，自动加载classpath下的配置文件并完成Bean实例化与依赖注入
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 从容器中获取userService Bean实例
        UserService userService = (UserService) applicationContext.getBean("userService");
        System.out.println(userService);
    }
}
