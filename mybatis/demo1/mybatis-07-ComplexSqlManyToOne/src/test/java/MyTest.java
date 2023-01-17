import org.apache.ibatis.session.SqlSession;
import org.example.dao.StudentMapper;
import org.example.dao.TeacherMapper;
import org.example.pojo.Student;
import org.example.utils.MybatisUtils;
import org.junit.Test;

public class MyTest {

    @Test
    public void TestEn(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        System.out.println(mapper.getTeacherById(1).toString());
    }
    @Test
    public void Test1(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        for (Student student : mapper.getAllStudent()) {
            System.out.println(student);
        }
    }
    @Test
    public void Test2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        for (Student student : mapper.getAllStudent2()) {
            System.out.println(student);
        }
    }
}
