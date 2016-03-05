package com.github.coderepositories.api.dto;

import java.util.List;

/**
 * 数据库表查询输出参数
 * Created by zhangguangyong on 2016/3/2.
 */
public class DatabaseTablesInquiryOutputDTO {

    private List<TableMetadataDTO> tableMetadataDTOList;

    public List<TableMetadataDTO> getTableMetadataDTOList() {
        return tableMetadataDTOList;
    }

    public void setTableMetadataDTOList(List<TableMetadataDTO> tableMetadataDTOList) {
        this.tableMetadataDTOList = tableMetadataDTOList;
    }
}
