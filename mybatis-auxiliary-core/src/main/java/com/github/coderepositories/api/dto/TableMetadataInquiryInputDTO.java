package com.github.coderepositories.api.dto;

/**
 * 表元数据查询输入参数
 * Created by zhangguangyong on 2016/3/2.
 */
public class TableMetadataInquiryInputDTO extends DatabaseOperationInputDTO {
    /**
     * 数据库名称
     */
    private String database;

    /**
     * 表名称
     */
    private String table;

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }
}
