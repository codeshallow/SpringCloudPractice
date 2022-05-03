package com.test.mapper;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import com.test.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author qianyu
 * @title
 * @Package com.test.mapper
 * @date 2022/5/4 01:16
 */
@Mapper
public interface UserMapper {

    @Select("select * from db_user where uid = #{uid}")
    User getUserById(int uid);  // 根据id查询用户
}
