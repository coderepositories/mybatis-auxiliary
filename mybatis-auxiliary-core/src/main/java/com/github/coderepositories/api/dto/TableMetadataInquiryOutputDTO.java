package com.github.coderepositories.api.dto;

/**
 * 表元数据查询输出参数
 * Created by zhangguangyong on 2016/3/2.
 */
public class TableMetadataInquiryOutputDTO {

    /**
     * 表元信息
     */
    private TableMetadataDTO tableMetadataDTO;

    public TableMetadataDTO getTableMetadataDTO() {
        return tableMetadataDTO;
    }

    public void setTableMetadataDTO(TableMetadataDTO tableMetadataDTO) {
        this.tableMetadataDTO = tableMetadataDTO;
    }
}
