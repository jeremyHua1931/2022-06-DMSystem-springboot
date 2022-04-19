package com.documentationmanagement.utils.SQL;

import com.documentationmanagement.utils.SQL.ConnectToSQL;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SqlOption {
    ConnectToSQL sqlConn = new ConnectToSQL();
    Connection conn =null;
    public SqlOption() throws SQLException {
        sqlConn.openConn();
        conn = sqlConn.conn;

    }

    public String loginUser(String SqlCMD) throws SQLException {
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(SqlCMD);
        String result = null;
        while (rs.next()) {result= rs.getString("userpwd");}
//        while (rs.next()) {
//            // 通过字段检索
//            int id = rs.getInt("userid");
//            String name = rs.getString("username");
//            String url = rs.getString("userpwd");
//
//            // 输出数据
//            System.out.print("ID: " + id);
//            System.out.print(" name: " + name);
//            System.out.print(" pwd: " + url);
//            System.out.print("\n");
//        }
        stmt.close();
        rs.close();
        System.out.println("password is "+result);
        return result;
    }

    public void registerUser(String SqlCMD) throws SQLException {
        Statement stmt = conn.createStatement();
        try{
            stmt.execute(SqlCMD);
        }
        catch (SQLException e){
            System.out.println("Register failed, userid already existed");
        }
//        while (rs.next()) {
//            // 通过字段检索
//            int id = rs.getInt("userid");
//            String name = rs.getString("username");
//            String url = rs.getString("userpwd");
//
//            // 输出数据
//            System.out.print("ID: " + id);
//            System.out.print(" name: " + name);
//            System.out.print(" pwd: " + url);
//            System.out.print("\n");
//        }
        stmt.close();
    }

    public void ExecSqlOp(String SqlCMD) throws SQLException {
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(SqlCMD);
//        while (rs.next()) {
//            // 通过字段检索
//            int id = rs.getInt("userid");
//            String name = rs.getString("username");
//            String url = rs.getString("userpwd");
//
//            // 输出数据
//            System.out.print("ID: " + id);
//            System.out.print(" name: " + name);
//            System.out.print(" pwd: " + url);
//            System.out.print("\n");
//        }
        stmt.close();
        rs.close();
    }
}
