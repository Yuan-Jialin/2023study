import org.apache.ibatis.session.SqlSession;
import org.example.dao.BlogMapper;
import org.example.pojo.Blog;
import org.example.utils.IDutils;
import org.example.utils.MybatisUtils;
import org.junit.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Mytest {

    @Test
    public void testInsert(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        mapper.addBlog(new Blog(IDutils.getId(),"python","Wang", new Date(),200));
    }
    @Test
    public void Test1(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Map<String,String>v= new HashMap();
        v.put("author","jahup");
        System.out.println(mapper.queryBlogIF(v).toString());
    }
}
