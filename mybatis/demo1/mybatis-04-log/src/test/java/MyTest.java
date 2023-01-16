import org.apache.ibatis.session.SqlSession;
import org.example.dao.UserMapper;
import org.example.utils.MybatisUtils;
import org.junit.Test;

public class MyTest {


    @Test
    public void testGetUserById(){
        SqlSession sqlSession=MybatisUtils.getSqlSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        System.out.println(userMapper.getUserById(1).toString());

        sqlSession.close();

    }


}
