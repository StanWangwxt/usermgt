package com.bhfae.usermgt.controller;

import com.bhfae.usermgt.pojo.User;
import com.bhfae.usermgt.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("manage/user")
public class UserManageController {

    @Autowired
    private IUserService iUserService;

    @RequestMapping(value = "insert.do", method = RequestMethod.POST)
    @ResponseBody
    public Boolean insertUser(String username, String password) {
        return iUserService.insertUser(username, password);
    }
//
//    @RequestMapping(value = "get.do/{username}", method = RequestMethod.GET)
//    @ResponseBody
//    public User getUser(@PathVariable String username, String password) {
//        return iUserService.getUser(username, password);
//    }

    @RequestMapping(value = "get.do")
    @ResponseBody
    public User getUser() {
        return iUserService.getUser("1", "1");
    }
}
