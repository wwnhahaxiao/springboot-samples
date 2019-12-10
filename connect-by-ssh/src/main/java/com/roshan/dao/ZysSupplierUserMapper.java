package com.roshan.dao;


import com.roshan.model.ZysSupplierUser;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

public interface ZysSupplierUserMapper {

//    @Select("select user_id,user_name from zys_supplier_user where user_id = #{id}")
//    @Results({
//            @Result(property = "userId", column = "user_id"),
//            @Result(property = "userName", column = "user_name")
//    })
    ZysSupplierUser getById(String id);
}