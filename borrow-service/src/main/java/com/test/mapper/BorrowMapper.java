package com.test.mapper;

import com.test.entity.Borrow;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author qianyu
 * @title
 * @Package com.test.mapper
 * @date 2022/5/4 02:04
 */
@Mapper
public interface BorrowMapper {

    @Select("select * from db_borrow where uid = #{uid}")
    List<Borrow> getBorrowByUid(int uid);

    @Select("select * from db_borrow where bid = #{bid}")
    List<Borrow> getBorrowByBid(int bid);

    @Select("select * from db_borrow where uid = #{uid} and bid = #{bid}")
    Borrow getBorrow(int uid, int bid);
}
