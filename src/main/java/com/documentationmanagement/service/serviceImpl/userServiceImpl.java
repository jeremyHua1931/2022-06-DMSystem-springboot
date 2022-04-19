package com.documentationmanagement.service.serviceImpl;

import com.documentationmanagement.utils.SQL.SqlOption;
import com.documentationmanagement.model.user;
import com.documentationmanagement.service.userService;
import java.sql.SQLException;

public class userServiceImpl implements userService{

    @Override
    public int loginService(String userID, String password)   throws SQLException{

        SqlOption queryUser= new SqlOption();
        String userPassword = queryUser.loginUser("select * from users where userid = '"+userID+"';");
        if(password.equals(userPassword)){
            System.out.println("Login Successful\n");
            return 0;
        }else {
            System.out.println("Login Failed--IncorrectPassword\n");
            return 1;
        }
    }

    @Override
    public int registerService(String userID,String userName,String userPwd, String userEmail)  throws SQLException{

        user user=new user();

        user.setUserId(userID);
        user.setUserName(userName);
        user.setUserPwd(userPwd);
        user.setUserEmail(userEmail);

        SqlOption addUser= new SqlOption();
        addUser.registerUser("Insert into users values('"+userID+ "','"+userName+ "','"+userPwd+ "','"+userEmail+ "');");
        return 0;
    }
}
