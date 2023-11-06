package com.sky.mapper;

import com.sky.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @Author lanling
 * @Date 2023/11/4 10:36
 * @PackageName:com.sky.mapper
 * @ClassName: UserMapper
 * @Description: TODO
 * @Version 1.0
 */

@Mapper
public interface UserMapper {

    /**
     * 根据openid查询用户
     *
     * @param openid
     * @return
     */
    @Select("select * from user where openid = #{openid}")
    User getByOpenid(String openid);

    /**
     * 插入数据
     *
     * @param user
     */
    void insert(User user);

    @Select("select * from user where id=#{userId}")
    User getById(Long userId);

    Integer queryAll();

    Integer queryNewCustomers(Map map);
}

