package com.example.springboot09mybatisplus.dao;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springboot09mybatisplus.pojo.books;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Jahup
 */
@Mapper
public interface BookMapper extends BaseMapper<books> {
}
