package org.example.dao;

import org.example.pojo.Books;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class BookMapperImpl implements BookMapper {

    private SqlSessionTemplate sqlSessionTemplate;
    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    public SqlSessionTemplate getSqlSessionTemplate() {
        return sqlSessionTemplate;
    }

    @Override
    public int addBook(Books books) {
        BookMapper mapper = sqlSessionTemplate.getMapper(BookMapper.class);
       return mapper.addBook(books);
    }

    @Override
    public int deleteBookById(int id) {
        BookMapper mapper = sqlSessionTemplate.getMapper(BookMapper.class);
        int i = mapper.deleteBookById(id);
        return i;
    }

    @Override
    public int updateBook(Books books) {
        BookMapper mapper = sqlSessionTemplate.getMapper(BookMapper.class);
        int i = mapper.updateBook(books);
        return i;
    }

    @Override
    public Books queryBookById(int id) {
        BookMapper mapper = sqlSessionTemplate.getMapper(BookMapper.class);
        return mapper.queryBookById(id);
    }

    @Override
    public List<Books> queryAllbook() {
        return sqlSessionTemplate.getMapper(BookMapper.class).queryAllbook();
    }
}
