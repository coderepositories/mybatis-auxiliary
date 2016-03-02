package com.github.coderepositories.dbinfo;

import org.apache.commons.dbutils.DbUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 数据连接信息
 * Created by Administrator on 2016/3/2.
 */
public class DBConnector {

    private String driver;

    private String url;

    private String user;

    private String password;

    /**
     * 初始化数据库连接器
     *
     * @param driver
     * @return
     */
    public static DBConnector init(String driver) {
        DbUtils.loadDriver(driver);
        DBConnector dbConnector = new DBConnector();
        dbConnector.setDriver(driver);
        return dbConnector;
    }

    /**
     * 初始化数据库连接器
     *
     * @param driver
     * @param url
     * @param user
     * @param password
     * @return
     */
    public static DBConnector init(String driver, String url, String user, String password) {
        DBConnector dbConnector = init(driver);
        dbConnector.setUrl(url);
        dbConnector.setUser(user);
        dbConnector.setPassword(password);
        return dbConnector;
    }

    /**
     * 获取数据库连接对象
     *
     * @return
     * @throws SQLException
     */
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }

    /**
     * 获取数据库连接对象
     *
     * @param url
     * @param user
     * @param password
     * @return
     * @throws SQLException
     */
    public Connection getConnection(String url, String user, String password) throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
