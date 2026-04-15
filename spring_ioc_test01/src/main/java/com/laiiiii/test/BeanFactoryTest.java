package com.laiiiii.test;

import com.laiiiii.service.UserService;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class BeanFactoryTest {

    /**
     * 测试Spring BeanFactory核心功能
     * 演示如何手动创建IOC容器、加载Bean定义并获取Bean实例
     */
    public static void main(String[] args) {
        // 创建工厂对象
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 创建一个读取器（xml文件）
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);

        // 读取配置文件给工厂
        reader.loadBeanDefinitions("beans.xml");

        // 根据id获取Bean实例对象
        UserService userService = (UserService) beanFactory.getBean("userService");
        System.out.println(userService);
    }

}
