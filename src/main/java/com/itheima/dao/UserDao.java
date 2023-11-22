package com.itheima.dao;

import com.itheima.domain.Brand;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
@Mapper
public interface UserDao {
    @Select(" select * from user where id=#{id};")
    Brand selectByID(int id);
}
