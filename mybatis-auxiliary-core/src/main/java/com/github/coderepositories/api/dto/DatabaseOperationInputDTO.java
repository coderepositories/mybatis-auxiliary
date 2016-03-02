package com.github.coderepositories.api.dto;

import java.sql.Connection;

/**
 * 数据库操作输入参数
 * Created by zhangguangyong on 2016/3/2.
 */
public class DatabaseOperationInputDTO {
    /**
     * 数据连接对象
     */
    private Connection connection;

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
}
