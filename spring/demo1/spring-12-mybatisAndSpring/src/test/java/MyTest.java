import org.example.dao.UserMapper;
import org.example.dao.UserMapperImpl;
import org.example.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test1(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");

       UserMapper userMapperImpl = classPathXmlApplicationContext.getBean("userMapperImpl", UserMapper.class);
        for (User user : userMapperImpl.getUserList()) {
            System.out.println(user);
        }
    }
    /*
    * java.lang.NoClassDefFoundError: org/springframework/core/metrics/ApplicationStart
    * 这个异常是 spring-jdbc hespring-webmvc的版本不一样导致的
    * */

    @Test
    public void test2(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        UserMapper userMapperImpl = classPathXmlApplicationContext.getBean("userMapperImpl2", UserMapper.class);
        for (User user : userMapperImpl.getUserList()) {
            System.out.println(user);
        }
    }

}
