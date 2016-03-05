package com.github.coderepositories.dbinfo;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by Administrator on 2016/3/2.
 */
public class DbTest {

    // String ip = "10.1.1.92";
    private static String ip = "192.168.1.12";


    private static void testMysql() throws SQLException {
        DBConnector dbConnector = DBConnector.init("com.mysql.jdbc.Driver");
        Connection conn = dbConnector.getConnection("jdbc:mysql://"+ip+":3306/tmsdb_dev?useUnicode=true&amp;characterEncoding=UTF-8&allowMultiQueries=true", "tmsdev", "tmsdev");
        String productName = conn.getMetaData().getDatabaseProductName();
        System.out.println(productName);
    }

    private static void testOracle() throws SQLException {
        DBConnector dbConnector = DBConnector.init("oracle.jdbc.driver.OracleDriver");
        Connection conn = dbConnector.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:orcl", "scott", "tiger");
        String productName = conn.getMetaData().getDatabaseProductName();
        System.out.println(productName);
    }

    public static void main(String[] args) throws SQLException {

        testMysql();
        testOracle();
    }
}
