package org.example.dao;

import org.example.pojo.Blog;

import java.util.List;
import java.util.Map;

public interface BlogMapper {

    int addBlog(Blog blog);
    List<Blog> queryBlogIF(Map map);

    int UpdateBlog(Map map);
    List<Blog>queryBlogChoose(Map map);

    List<Blog> queryBlogForeach(Map map);

}
