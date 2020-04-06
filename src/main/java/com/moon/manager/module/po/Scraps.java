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
* @date Date : 2020年04月03日 22:12
* @version V1.0
*/
@ApiModel(value="com-moon-manager-module-po-Scraps")
@Data
public class Scraps {
    /**
    * 自增主键 
    */
    @ApiModelProperty(value="自增主键 ")
    private Integer id;

    /**
    * 碎话
    */
    @ApiModelProperty(value="碎话")
    private String scraps;

    /**
    * 状态
    */
    @ApiModelProperty(value="状态")
    private String status;

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
    * 数据是否删除
    */
    @ApiModelProperty(value="数据是否删除")
    private Byte dataIsDeleted;
}