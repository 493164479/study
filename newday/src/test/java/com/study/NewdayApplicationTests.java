package com.study;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.SQLException;

@SpringBootTest
class NewdayApplicationTests {

    @Autowired
    DataSource dataSource;


    @Test
    void contextLoads() throws SQLException {

        Class<? extends DataSource> aClass = dataSource.getClass();
        System.out.println(aClass);
        System.out.println(dataSource.getConnection());
        dataSource.getConnection().close();
    }

}
