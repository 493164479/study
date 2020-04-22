package com.study.mapper;

import com.study.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {

    User getUserByName(@Param("username") String username);

    void addUser(User user);
}
