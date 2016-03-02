package com.github.coderepositories.api;

import com.github.coderepositories.api.dto.DatabaseTablesInquiryInputDTO;
import com.github.coderepositories.api.dto.DatabaseTablesInquiryOutputDTO;
import com.github.coderepositories.api.dto.TableMetadataInquiryInputDTO;
import com.github.coderepositories.api.dto.TableMetadataInquiryOutputDTO;

/**
 * 数据库信息接口
 * Created by zhangguangyong on 2016/3/2.
 */
public interface DatabaseInfoApi {

    /**
     * 查询数据库所有表
     * @param inputDTO
     * @return
     */
    DatabaseTablesInquiryOutputDTO databaseTablesInquiry(DatabaseTablesInquiryInputDTO inputDTO);

    TableMetadataInquiryOutputDTO tableMetadataInquiry(TableMetadataInquiryInputDTO inputDTO);
    
}
