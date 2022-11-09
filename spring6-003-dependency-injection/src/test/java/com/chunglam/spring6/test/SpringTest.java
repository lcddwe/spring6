package com.chunglam.spring6.test;


import com.chunglam.spring6.bean.SimpleValueType;
import com.chunglam.spring6.bean.User;
import com.chunglam.spring6.util.JdbcDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author chunglam
 * @version 1.0
 */
public class SpringTest {

    /**
     * 测试简单类型注入
     * */
    @Test
    public void testSimpleTypeSet() {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = applicationContext.getBean("userBean", User.class);
        System.out.println(user);
    }

    @Test
    public void testAllSimpleType(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        SimpleValueType simpleType = applicationContext.getBean("simpleType", SimpleValueType.class);
        System.out.println(simpleType);
    }

    /**
     * 测试util命名空间的复用
     * */
    @Test
    public void utilTest() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        JdbcDataSource jdbcDataSource = applicationContext.getBean("myDataSource", JdbcDataSource.class);
        System.out.println(jdbcDataSource);
    }
}
