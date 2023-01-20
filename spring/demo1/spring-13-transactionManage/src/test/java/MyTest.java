import org.example.dao.UserMapper;
import org.example.pojo.User;
import org.junit.Test;
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
}
