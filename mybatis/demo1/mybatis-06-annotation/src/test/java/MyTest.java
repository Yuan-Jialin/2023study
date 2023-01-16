import org.apache.ibatis.session.SqlSession;
import org.example.dao.UserMapper;
import org.example.utils.MybatisUtils;
import org.junit.Test;

public class MyTest {

    @Test
    public void test1(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        String s = mapper.selectUserById(1).toString();
        System.out.println(s);
        sqlSession.close();
    }

}
