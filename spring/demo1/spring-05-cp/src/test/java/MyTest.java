import com.yuan.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
        User user=  applicationContext.getBean("user",User.class);
        System.out.println(user.toString());
    }
    @Test
    public void Testc(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
        User user=  applicationContext.getBean("user1",User.class);
        System.out.println(user);

    }
}
