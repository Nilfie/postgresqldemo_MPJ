package com.nxy.postgresqldemo.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.nxy.postgresqldemo.entity.User;
import com.nxy.postgresqldemo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Nilfie
 * @version 1.0
 * @date 2023/5/29 10:34
 */
@Service
public class UserService {
    @Resource
    private UserMapper userMapper;

    public List<User> getUserByAccount() {

        List<User> userList = userMapper.selectList(null);
        return userList;
    }
}
