import org.apache.ibatis.session.SqlSession;
import org.example.dao.BlogMapper;
import org.example.pojo.Blog;
import org.example.utils.IDutils;
import org.example.utils.MybatisUtils;
import org.junit.Test;

import java.util.*;

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

    @Test
    public void Test2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Map<String,String>v=new HashMap<>();
        v.put("author","jahup");
        System.out.println(mapper.queryBlogChoose(v));
    }

    @Test
    public void TestUpdate(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Map<String,String>v=new HashMap<>();

        v.put("name","C++");
        v.put("author","yangfan");
        mapper.UpdateBlog(v);
        sqlSession.close();
    }

    @Test
    public void TestForEach(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        ArrayList<Integer> ids = new ArrayList<>();
        for(int i=1;i<=3;i++)
            ids.add(i);
        HashMap v=new HashMap();
        v.put("ids",ids);
        List<Blog>blogs=mapper.queryBlogForeach(v);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
        sqlSession.close();
    }
}
