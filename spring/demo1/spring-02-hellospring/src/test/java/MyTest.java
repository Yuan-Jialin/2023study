import com.yuan.pojo.YangFan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    public static void main(String[] args) {
        //获取spring的上下文对象
        ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
        //我们的对象现在都在spring中管理了，我们要用他，直接从spring里拿
        YangFan yangFan=(YangFan) context.getBean("hello");
        //YangFan对象由spring 调用set创建


        System.out.println(yangFan.toString());

    }
}
