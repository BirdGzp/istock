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
* @date Date : 2020年03月31日 19:51
* @version V1.0
*/
@ApiModel(value="com-moon-manager-module-po-Type")
@Data
public class Type {
    /**
    * 自增主键
    */
    @ApiModelProperty(value="自增主键")
    private Integer id;

    /**
    * 类型
    */
    @ApiModelProperty(value="类型")
    private String type;

    /**
    * 数据创建时间
    */
    @ApiModelProperty(value="数据创建时间")
    private Date dataCreateTime;

    /**
    * 数据更新时间
    */
    @ApiModelProperty(value="数据更新时间")
    private Date dataUpdateTime;

    /**
    * 数据是否删除 0 未删除,1 已删除
    */
    @ApiModelProperty(value="数据是否删除 0 未删除,1 已删除")
    private Byte dataIsDeleted;
}