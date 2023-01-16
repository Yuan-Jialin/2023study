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
        Map<String,Integer>map =new HashMap<>();
        map.put("StartIndex",0);
        map.put("PageSize",2);

        List<User> userByLimit = userMapper.getUserByLimit(map);

        for (User user : userByLimit) {
            System.out.println(user);
        }
        sqlSession.close();



    }


}
