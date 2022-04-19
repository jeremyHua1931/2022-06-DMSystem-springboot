package com.documentationmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class DocumentationManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(DocumentationManagementApplication.class, args);
    }

}
