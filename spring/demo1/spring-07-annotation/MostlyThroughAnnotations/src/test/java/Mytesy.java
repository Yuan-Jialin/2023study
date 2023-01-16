import com.yuan.pojo.YangFan;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytesy {

    @Test
    public void test1(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
        YangFan yangFan=applicationContext.getBean("yangfan",YangFan.class);
        System.out.println(yangFan.age);
    }
}
