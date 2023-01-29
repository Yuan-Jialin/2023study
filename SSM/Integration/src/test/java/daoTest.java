import org.example.dao.BookMapper;
import org.example.dao.BookMapperImpl;
import org.example.pojo.Books;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class daoTest {

    @Test
    public void test1(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationconfig.xml");

        BookMapperImpl bookMapper = classPathXmlApplicationContext.getBean("BookMapperImpl", BookMapperImpl.class);


        System.out.println(bookMapper.queryBookById(1));

        Books books =new Books();
        books.setBookID(2);
        books.setDetail("流浪地球2");


        bookMapper.updateBook(books);
        System.out.println(bookMapper.queryBookById(2));
    }
}
