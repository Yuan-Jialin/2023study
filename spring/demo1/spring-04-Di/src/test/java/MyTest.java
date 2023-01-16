import com.yuan.pojo.YangFan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    public static void main(String[] args) {

        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("ApplicationContext.xml");

        YangFan yangFan= (YangFan) applicationContext.getBean("yangfan");

        System.out.println(yangFan.toString());
    }

}
