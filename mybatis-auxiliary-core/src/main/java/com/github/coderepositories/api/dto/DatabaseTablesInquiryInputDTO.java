package com.github.coderepositories.api.dto;

/**
 * 数据库表查询输入参数
 * Created by zhangguangyong on 2016/3/2.
 */
public class DatabaseTablesInquiryInputDTO  extends DatabaseOperationInputDTO {

    /**
     * 数据库名称
    */
    private String database;

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }
}
