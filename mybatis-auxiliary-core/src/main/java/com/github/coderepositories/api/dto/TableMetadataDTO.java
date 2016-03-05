package com.github.coderepositories.api.dto;

import java.util.List;

/**
 * Created by zhangguangyong on 2016/3/5.
 */
public class TableMetadataDTO extends BaseDTO {
    /**
     * 表名称
     */
    private String tableName;

    /**
     * 表注释
     */
    private String comment;

    /**
     * 表格的字段列表
     */
    private List<ColumnMetadataDTO> columnMetadataDTOList;

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public List<ColumnMetadataDTO> getColumnMetadataDTOList() {
        return columnMetadataDTOList;
    }

    public void setColumnMetadataDTOList(List<ColumnMetadataDTO> columnMetadataDTOList) {
        this.columnMetadataDTOList = columnMetadataDTOList;
    }
}
