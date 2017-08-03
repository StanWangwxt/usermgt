package com.bhfae.usermgt.service.impl;

import com.bhfae.usermgt.dao.UserMapper;
import com.bhfae.usermgt.pojo.User;
import com.bhfae.usermgt.pojo.UserExample;
import com.bhfae.usermgt.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("iUserService")
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    public Boolean insertUser(String username, String password) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        return userMapper.insert(user) == 1;
    }

    public User getUser(String username, String password) {
        UserExample userExample = new UserExample();
        userExample.createCriteria()
                .andUsernameEqualTo(username)
                .andPasswordEqualTo(password);
        List<User> userList = userMapper.selectByExample(userExample);
        if (userList == null || userList.size() == 0) {
            return null;
        }
        return userList.get(0);
    }
}
