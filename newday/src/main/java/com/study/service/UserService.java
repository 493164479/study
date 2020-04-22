package com.study.service;

import com.study.mapper.UserMapper;
import com.study.pojo.User;
import com.study.utils.MD5;
import com.study.utils.UUIDUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    //登录
    public boolean login(User user){
        String username = user.getUsername();
        String password = user.getPassword();
        String md5Password = MD5.MD5(password);
        User userByName = userMapper.getUserByName(username);
        if(userByName==null){
            return false;
        }else {
            boolean b = userByName.getPassword().equals(md5Password);
            if(b==true){
                return true;
            }else {
                return false;
            }
        }
    }


    public boolean register(User user){
        String username = user.getUsername();


        if(userMapper.getUserByName(username)==null){
            user.setId(UUIDUtils.getUUID());
            user.setPassword(MD5.MD5(user.getPassword()));
            userMapper.addUser(user);
            return true;
        }else {
            return false;
        }

    }
}
