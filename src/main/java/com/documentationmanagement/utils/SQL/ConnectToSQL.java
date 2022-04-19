package com.documentationmanagement.utils.SQL;

import java.sql.*;

public class ConnectToSQL {
//这里是SqlConnection 类
    /*
     *java连接mysql数据库
     *1、加载驱动程序
     *2、数据库连接字符串"jdbc:mysql://localhost:3306/数据库名?"
     *3、数据库登录名
     *3、数据库登录密码
     */

    private static final String URL = "jdbc:mysql://150.158.4.187:3306/dbTest";//数据库连接字符串
    private static final String NAME = "remoteUser";//登录名
    private static final String PASSWORD = "huawei+123";//密码
    public Connection conn= null;

    public void openConn() throws SQLException {

        System.out.println("正在连接数据库......");
        //1.加载驱动
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("未能成功加载驱动程序，请检查是否导入驱动程序！");
            //添加一个println，如果加载驱动异常，检查是否添加驱动，或者添加驱动字符串是否错误
            e.printStackTrace();
        }

        try {
            conn = DriverManager.getConnection(URL, NAME, PASSWORD);
            System.out.println("SQl connection successes!");
        } catch (SQLException e) {
            System.out.println("SQl connection failed!");
            //添加一个println，如果连接失败，检查连接字符串或者登录名以及密码是否错误
            e.printStackTrace();
        }
        }

        public void closeConn() {
            //数据库打开后就要关闭
            if (conn != null) {
                try {
                    conn.close();
                    System.out.println("SQl connection disconnect!");
                    System.out.println("数据库已断开!");
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                    conn = null;
                }
            }

        }
}


