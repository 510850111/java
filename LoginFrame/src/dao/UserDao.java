package dao;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import pojo.User;

/**
 *
 * @author Oscar
 */

public interface UserDao {
    /**
     * 这是用户登陆功能
     * @param username 用户名
     * @param password 密码
     * @return 陆是否成功
     */
    public abstract boolean login(String username, String password);
    
    /**
     * 这是用户注册功能
     * @param user 
     */
    public abstract void  regist(User user);
}
