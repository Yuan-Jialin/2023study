import com.yuan.dao.UserDao;
import com.yuan.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTestBySpring {

    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
        UserServiceImpl userService= (UserServiceImpl) context.getBean("UserService");
        userService.getUser();


    }
}
