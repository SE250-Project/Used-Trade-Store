package com.se250.store;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.SQLException;

@SpringBootTest
class StoreApplicationTests {

    @Autowired
    private DataSource dataSource;

    @Test
    void contextLoads() {
    }


/*
 * @description:测试数据库连接
 * 连接池：
 * HikariProxyConnection@724128993 wrapping com.mysql.cj.jdbc.ConnectionImpl@58d6e55a
 * @author: Ivan Mao
 * @date: 2022/10/13 下午5:04
 * @param: []
 * @return: void
 **/
    @Test
    public void getConnection() throws SQLException {
        System.out.println(dataSource.getConnection());
    }
}
