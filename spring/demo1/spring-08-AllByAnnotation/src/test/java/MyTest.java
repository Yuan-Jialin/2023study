import com.yuan.config.MyConfig;
import com.yuan.pojo.User;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {

    @Test
    public void test1(){

        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(MyConfig.class);
        User user=context.getBean("getUser",User.class);//name用配置类里面的方法名
        System.out.println(user.getName());

    }
}
