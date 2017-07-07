package com.mucfc.dao;  
  
import com.mucfc.model.User;  
/** 
 * DAO接口层 
 * @author linbingwen 
 * @time 2015.5.15 
 */  
public interface UserDao {  
    /** 
     * 根据用户ID查询用户信息 
     * @param id 
     * @return 
     */  
    public User findUserById(int id);  
}  