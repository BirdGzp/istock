package com.moon.manager.module.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;


/**
* @Project: manager
* @Package com.moon.manager.module.po
* @Description: TODO
* @author : 龚志鹏
* @date Date : 2020年03月31日 19:52
* @version V1.0
*/
@ApiModel(value="com-moon-manager-module-po-Jargon")
@Data
public class Jargon {
    /**
    * 主键
    */
    @ApiModelProperty(value="主键")
    private Integer id;

    /**
    * 外键，关联到 TB_TYPE 表
    */
    @ApiModelProperty(value="外键，关联到 TB_TYPE 表")
    private Integer typeId;

    /**
    * 冗余字段 ，type 值
    */
    @ApiModelProperty(value="冗余字段 ，type 值")
    private String type;

    /**
    * 行话
    */
    @ApiModelProperty(value="行话")
    private String jargon;

    /**
    * 解释
    */
    @ApiModelProperty(value="解释")
    private String explain;

    /**
    * 创建时间
    */
    @ApiModelProperty(value="创建时间")
    private Date dataCreateTime;

    /**
    * 更新时间
    */
    @ApiModelProperty(value="更新时间")
    private Date dataUpdateTime;

    /**
    * 数据是否删除 0 未删除 1 已删除
    */
    @ApiModelProperty(value="数据是否删除 0 未删除 1 已删除")
    private Byte dataIsDeleted;
}