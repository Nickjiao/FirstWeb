package com.mucfc.dao;  
  
import com.mucfc.model.User;  
/** 
 * DAO�ӿڲ� 
 * @author linbingwen 
 * @time 2015.5.15 
 */  
public interface UserDao {  
    /** 
     * �����û�ID��ѯ�û���Ϣ 
     * @param id 
     * @return 
     */  
    public User findUserById(int id);  
}  