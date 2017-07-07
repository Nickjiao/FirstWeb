package com.mucfc.dao;  
  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Component;  
import  com.mucfc.mapper.UserMapper;  
import com.mucfc.model.User;  
/** 
 * DAO µœ÷≤„ 
 * @author linbingwen 
 * @time 2015.5.15 
 */  
@Component  
public class UserDaoImpl implements UserDao{  
    @Autowired  
    private UserMapper userMapper;  
     
    public User findUserById(int id) {  
        User user = userMapper.selectUserById(id);  
         return user;   
    }  
      
}  