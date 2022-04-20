package com.documentationmanagement.test.SQLTest;

import com.documentationmanagement.utils.SQL.ConnectToSQL;

import java.sql.SQLException;

public class TestSQLConnection {


    public static void main(String[] args) throws SQLException{

        testSQLConnection();

    }

    public static void testSQLConnection(){

        ConnectToSQL sqlConn = new ConnectToSQL();
        try {
            sqlConn.openConn();
            sqlConn.closeConn();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
