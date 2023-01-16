import org.apache.ibatis.session.SqlSession;
import org.example.dao.UserMapper;
import org.example.pojo.User;
import org.example.utils.MybatisUtils;
import org.junit.Test;

import java.util.List;

public class MyTest {

    @Test
    public void test1(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        String s = mapper.selectUserById(3).toString();
        System.out.println(s);
        sqlSession.close();
    }

    @Test
    public void test2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> yjl = mapper.getUsersByNameAndId(1, "袁佳林");
        for (User user : yjl) {
            System.out.println(user);
        }
        sqlSession.close();
    }
    @Test
    public void test3(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        userMapper.insertUser(new User(5,"jjjj","12331222"));
        sqlSession.commit();
        sqlSession.close();

    }
    @Test
    public void test4(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.update(new User(3,"蒲海芳","6666"));
        sqlSession.close();

    }

    @Test
    public void test5(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.delete(5);
    }

}
