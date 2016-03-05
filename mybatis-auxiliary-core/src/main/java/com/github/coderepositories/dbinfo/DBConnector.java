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

    private Connection connection;

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
        if(null != connection && !connection.isClosed()){
            return connection;
        }
        this.connection = DriverManager.getConnection(url, user, password);
        return connection;
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

    /**
     * 验证是否是Mysql数据库
     * @return
     * @throws SQLException
     */
    public boolean isMysql() throws SQLException {
        return connection.getMetaData().getDatabaseProductName().equals(MYSQL_PRODUCT_NAME);
    }

    /**
     * 验证是否是Oracle数据库
     * @return
     * @throws SQLException
     */
    public boolean isOracle() throws SQLException {
        return connection.getMetaData().getDatabaseProductName().equals(ORACLE_PRODUCT_NAME);
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


    private static final String MYSQL_PRODUCT_NAME = "MySQL";

    private static final String ORACLE_PRODUCT_NAME = "Oracle";
}
