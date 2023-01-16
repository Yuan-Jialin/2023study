import org.example.service.UserService;
import org.example.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Proxy;

public class MyTest {





    /*
    *
    * 方式一
    *
    * */
    @Test
    public void test1(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("ApplicationContext.xml");
        UserService userService=(UserService) applicationContext.getBean("user");
        userService.add();
    }


    /*
    * 方法二
    *
    * */


    @Test
    public void test2(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
        UserService userService=(UserService) applicationContext.getBean("user");
        userService.delete();
    }
}
