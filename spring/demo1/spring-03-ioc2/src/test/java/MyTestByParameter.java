import com.yang.pojo.Love;
import com.yang.pojo.YuanJialin;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTestByParameter {

    public static void main(String[] args) {
        ApplicationContext applicationContext= new  ClassPathXmlApplicationContext("ApplicationContext.xml");
        YuanJialin yuanJialin= (YuanJialin) applicationContext.getBean("YuanJialin");
        //YuanJialin yuanJialin1=(YuanJialin)applicationContext.getBean("YuanJialin2");
        //Love love=(Love) applicationContext.getBean("Love");


        }
}
