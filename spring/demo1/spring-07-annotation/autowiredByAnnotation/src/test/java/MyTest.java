import com.yuan.pojo.Lovers;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test1(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
        Lovers lovers=applicationContext.getBean("lovers",Lovers.class);
        lovers.getYuanJialin().showLove();
    }
}
