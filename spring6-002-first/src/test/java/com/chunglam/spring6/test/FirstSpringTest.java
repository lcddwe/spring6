package com.chunglam.spring6.test;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author chunglam
 * @version 1.0
 */
public class FirstSpringTest {
    @Test
    public void testFirstSpringCode() {
        //ClassPathXmlApplicationContext是ApplicationContext接口的一个实现类，是专门从类路径当中加载spring配置文件的一个spring上下文对象
        //这行代码只要运行，就相当于启动了spring容器，解析spring的配置文件，实例化所有的bean对象，并存放到spring容器当中
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Object userBean = applicationContext.getBean("userBean");
        System.out.println(userBean);
        Object userDao = applicationContext.getBean("userDao");
        System.out.println(userDao);
        System.out.println("你好啊");
    }

    @Test
    public void test() {
        new ClassPathXmlApplicationContext("applicationContext.xml");
        //如何使用log4j2去记录日志信息
        //第一步:创建日志记录器对象，获取要记录的 类 的日志， 参数是要记录的 类的类型
        Logger logger = LoggerFactory.getLogger(FirstSpringTest.class);
        //根据不同的级别来输出日志信息
        logger.info("我是一条日志消息");
        logger.debug("我是一条调试信息");
        logger.error("我是一条错误信息");
        System.out.println("你好，希儿");
        System.out.println("测试分支的合并");
        System.out.println("你好,布洛尼亚");
        System.out.println("测试分支的冲突的手动合并");
        System.out.println("merge test");
        System.out.print("hello eden");
    }
}
