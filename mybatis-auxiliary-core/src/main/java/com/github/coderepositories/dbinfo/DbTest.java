package com.github.coderepositories.dbinfo;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by Administrator on 2016/3/2.
 */
public class DbTest {

    static final String DRIVER_CLASS = "com.mysql.jdbc.Driver";
    static final String URL = "jdbc:mysql://10.1.1.92:3306/tmsdb_dev?useUnicode=true&amp;characterEncoding=UTF-8&allowMultiQueries=true";
    static final String USER = "tmsdev";
    static final String PASSWORD = "tmsdev";
    
    public static void main(String[] args) throws SQLException {
        DBConnector dbConnector = DBConnector.init(DRIVER_CLASS);
        Connection connection = dbConnector.getConnection(URL, USER, PASSWORD);
        System.out.println(connection);
    }
}
