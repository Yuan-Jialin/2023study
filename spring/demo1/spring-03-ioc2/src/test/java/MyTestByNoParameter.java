import com.yang.pojo.YangFan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


//通过无参数的方法构造
public class MyTestByNoParameter {
    public static void main(String[] args) {
        ApplicationContext applicationContext= new  ClassPathXmlApplicationContext("ApplicationContext.xml");
        YangFan YangFan= (com.yang.pojo.YangFan) applicationContext.getBean("YangFan");
        YangFan.showLove();

        /*
        输出
        create object by construction method without parameters
        喜欢袁佳林

        可见 spring走的是无参数的构造方法，然后通过set方法赋值
        所以set方法在spring中必不可少

        如果删除无参数的构造方法只留有参数，直接报错，可见
        <bean id="YangFan" class="com.yang.pojo.YangFan">
        <property name="height" value="160"/>
        <property name="age" value="18"/>
        <property name="boyFriendName" value="YuanJialin"/>
    </bean>
      这样的配置默认走的是无参数的构造方法
         */

    }
}
