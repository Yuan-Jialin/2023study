import org.apache.ibatis.session.SqlSession;
import org.example.dao.UserMapper;
import org.example.pojo.User;
import org.example.utils.MybatisUtils;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyTest {


    @Test
    public void testGetUserById(){
        SqlSession sqlSession=MybatisUtils.getSqlSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        System.out.println(userMapper.getUserById(1).toString());

        sqlSession.close();

    }


}
