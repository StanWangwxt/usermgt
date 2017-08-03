package com.bhfae.usermgt.service;

import com.bhfae.usermgt.pojo.User;

public interface IUserService {

    Boolean insertUser(String username, String password);

    User getUser(String username, String password);

}
