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

    @Test
    public void test(){
        int n=9;
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=i;
        array(a);
    }

    public void array(int a[]){
        System.out.println(a[2]);
    }
}
