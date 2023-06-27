package com.llt.factory;

import com.llt.service.UserService;

/**
 * @author llt
 */
public class UserServiceFactory {

    /*
    * 使用静态工厂创建
    * */
    private final static UserService userServiceStaticFactory = new UserService();

    public static UserService creteStaticFactoryInstance() {
        return userServiceStaticFactory;
    }

    /*
    * 使用工厂创建
    * */

    private final static UserService userServiceFactory = new UserService();

    public UserService createFactoryInstance() {
        return userServiceStaticFactory;
    }

}
