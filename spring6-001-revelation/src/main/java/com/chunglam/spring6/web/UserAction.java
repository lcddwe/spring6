package com.chunglam.spring6.web;

import com.chunglam.spring6.service.UserService;
import com.chunglam.spring6.service.impl.UserServiceImpl;

/**
 * 表示层
 * @author chunglam
 * @version 1.0
 */
public class UserAction {
    UserService userService = new UserServiceImpl();

    public void deleteRequest() {
        userService.deleteUser();
    }
}
