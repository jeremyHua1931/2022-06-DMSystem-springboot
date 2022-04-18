package com.cytmo.documentationmanagement;

import java.sql.SQLException;

public class DocStorageManager {
    public static void main(String... args) throws SQLException {
        User test = new User();
        test.login("0","123789Aa");
        test.login("1","1");
        test.register("1","test_user","123789","test@example.com");
        test.login("1","1");
    }
}
