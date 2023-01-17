import org.apache.ibatis.session.SqlSession;
import org.example.dao.TeacherMapper;
import org.example.utils.MybatisUtils;
import org.junit.Test;

public class MyTest {

    @Test
    public void TestEn(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        System.out.println(mapper.getTeacherById(1).toString());
    }
}
