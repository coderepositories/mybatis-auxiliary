package com.github.coderepositories.api.dto;

/**
 * Created by zhangguangyong on 2016/3/5.
 */
public class ColumnMetadataDTO extends BaseDTO {

    /**
     * 字段名称
     */
    private String columnName;

    /**
     * 字段类型
     */
    private String dataType;

    /**
     * 数据长度
     */
    private String dataLength;

    /**
     * 数据精度
     */
    private String dataPrecision;

    /**
     * 数据小数精度
     */
    private String dataScale;

    /**
     * 是否能为Null
     */
    private String nullable;

    /**
     * 默认长度
     */
    private String defaultLength;

    /**
     * 默认值
     */
    private String dataDefault;

    /**
     * 字段注释
     */
    private String comment;

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getDataLength() {
        return dataLength;
    }

    public void setDataLength(String dataLength) {
        this.dataLength = dataLength;
    }

    public String getDataPrecision() {
        return dataPrecision;
    }

    public void setDataPrecision(String dataPrecision) {
        this.dataPrecision = dataPrecision;
    }

    public String getDataScale() {
        return dataScale;
    }

    public void setDataScale(String dataScale) {
        this.dataScale = dataScale;
    }

    public String getNullable() {
        return nullable;
    }

    public void setNullable(String nullable) {
        this.nullable = nullable;
    }

    public String getDefaultLength() {
        return defaultLength;
    }

    public void setDefaultLength(String defaultLength) {
        this.defaultLength = defaultLength;
    }

    public String getDataDefault() {
        return dataDefault;
    }

    public void setDataDefault(String dataDefault) {
        this.dataDefault = dataDefault;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
