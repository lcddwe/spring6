package com.chunglam.spring6.service.impl;

import com.chunglam.spring6.dao.UserDao;
import com.chunglam.spring6.dao.impl.UserDaoImpl;
import com.chunglam.spring6.service.UserService;

/**
 * @author chunglam
 * @version 1.0
 */
public class UserServiceImpl implements UserService {

    UserDao userDao = new UserDaoImpl();

    /**
     * 删除用户信息
     */
    @Override
    public void deleteUser() {
        userDao.deleteById();
    }
}
