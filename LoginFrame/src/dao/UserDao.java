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
     * �����û���½����
     * @param username �û���
     * @param password ����
     * @return ½�Ƿ�ɹ�
     */
    public abstract boolean login(String username, String password);
    
    /**
     * �����û�ע�Ṧ��
     * @param user 
     */
    public abstract void  regist(User user);
}
