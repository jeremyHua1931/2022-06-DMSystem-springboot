package com.documentationmanagement.service;
import com.documentationmanagement.model.user;

import java.sql.SQLException;

public interface userService {

    /*
      1-登陆功能
      2-注册功能

     */


    int loginService(String username, String password)  throws SQLException;

    int registerService(String userID,String userName,String userPwd, String userEmail) throws SQLException;




}
