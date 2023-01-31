import org.example.service.BookServiceImpl;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

    @Test
    public void test1(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationconfig.xml");

        BookServiceImpl bookServiceImpl = classPathXmlApplicationContext.getBean("BookServiceImpl", BookServiceImpl.class);

        System.out.println(bookServiceImpl.queryAllBook().toString());

    }
}
