package com.chunglam.spring6.dao.impl;

import com.chunglam.spring6.dao.UserDao;

/**
 * @author chunglam
 * @version 1.0
 */
public class UserDaoImpl implements UserDao {
    /**
     * 持久层
     * 根据id删除用户信息
     */
    @Override
    public void deleteById() {
        System.out.println("正在删除用户信息");
    }
}
