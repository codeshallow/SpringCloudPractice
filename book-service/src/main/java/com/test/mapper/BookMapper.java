package com.test.mapper;

import com.test.entity.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author qianyu
 * @title
 * @Package com.test.mapper
 * @date 2022/5/4 01:37
 */
@Mapper
public interface BookMapper {
    @Select("select * from db_book where bid = #{bid}")
    Book getBookById(int bid);
}
