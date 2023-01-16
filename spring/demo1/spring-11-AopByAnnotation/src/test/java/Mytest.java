import org.example.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {

    @Test
    public void test(){
        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("beans.xml");

        UserService userService= (UserService) applicationContext.getBean("user");
        userService.delete();

    }
}
