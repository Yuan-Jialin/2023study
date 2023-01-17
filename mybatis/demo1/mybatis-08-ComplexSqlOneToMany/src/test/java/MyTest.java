import org.apache.ibatis.session.SqlSession;
import org.example.dao.TeacherMapper;
import org.example.pojo.Teacher;
import org.example.utils.MybatisUtils;
import org.junit.Test;

public class MyTest {

    @Test
    public void Test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        System.out.println(mapper.getTeacherById(1).toString());
    }

    @Test
    public void Test2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        System.out.println(mapper.getTeacherById2(1).toString());
    }
}
