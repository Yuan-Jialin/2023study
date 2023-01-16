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
    public void test1(){
       SqlSession sqlSession=MybatisUtils.getSqlSession();

       UserMapper userDao = sqlSession.getMapper(UserMapper.class);
       List<User> userList=userDao.getUserList();

       for(User user:userList)
           System.out.println(user);


       sqlSession.close();




    }

    @Test
    public void addUser2(){
        SqlSession sqlSession=MybatisUtils.getSqlSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        Map<String, Object>map=new HashMap<>();
        map.put("userid",5);
        map.put("username","网络");
        map.put("userpwd","12337721");
        userMapper.addUser2(map);
        sqlSession.commit();
        sqlSession.close();


    }
    @Test
    public void testGetUserById(){
        SqlSession sqlSession=MybatisUtils.getSqlSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        System.out.println(userMapper.getUserById(1).toString());

        sqlSession.close();

    }
    @Test
    public void TestInsert(){
        SqlSession sqlSession=MybatisUtils.getSqlSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        System.out.println(userMapper.addUser(new User(1,"袁佳林","13308565099")));

        //增删改需要提交事务
        sqlSession.commit();

        sqlSession.close();

    }

    @Test
    public void Update(){
        SqlSession sqlSession=MybatisUtils.getSqlSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        userMapper.updateUser(new User(2,"李隆闰","123555"));

        sqlSession.commit();
        sqlSession.close();

    }

    @Test
    public void delete(){
        SqlSession sqlSession=MybatisUtils.getSqlSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        userMapper.deleteById(1);
        sqlSession.commit();;
        sqlSession.close();
    }

    @Test
    public void TestGetUserByLike()
    {
        SqlSession sqlSession=MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userByLike = mapper.getUserByLike("网");
        for (User user : userByLike) {
            System.out.println(user);
        }
    }

}
