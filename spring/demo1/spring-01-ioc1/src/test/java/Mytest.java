import com.yuan.dao.UserDaoMysqlImpl;
import com.yuan.service.UserServiceImpl;

public class Mytest {


    public static void main(String[] args) {
        UserServiceImpl userService=new UserServiceImpl();

        userService.setUserDao(new UserDaoMysqlImpl());
        userService.getUser();
    }
}

