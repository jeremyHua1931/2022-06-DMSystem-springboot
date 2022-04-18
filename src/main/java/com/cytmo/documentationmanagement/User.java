package com.cytmo.documentationmanagement;

import java.sql.ResultSet;
import java.sql.SQLException;

public class User {
    String userId;
    String userName;
    String userPwd;
    String userEmail;

    public int register(String i,String j,String x, String y) throws SQLException {
        this.userId=i;
        this.userName =j;
        this.userPwd=x;
        this.userEmail=y;
        SqlOp addUser= new SqlOp();
        addUser.registerUser("Insert into users values('"+i+ "','"+j+ "','"+x+ "','"+j+ "');");
        return 0;
    }

    public int login(String id,String pwd) throws SQLException {
        SqlOp queryUser= new SqlOp();
        String userpwd = queryUser.loginUser("select * from users where userid = '"+id+"';");
        if(pwd.equals(userpwd)){
            System.out.println("Login Successful\n");
            return 0;
        }else {
            System.out.println("Login Failed------IncorrectPassword\n");
            return 1;
        }
    }

}
