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
* @date Date : 2020年04月03日 21:52
* @version V1.0
*/
@ApiModel(value="com-moon-manager-module-po-March")
@Data
public class March {
    /**
    * 自增主键
    */
    @ApiModelProperty(value="自增主键")
    private Integer id;

    /**
    * 简介
    */
    @ApiModelProperty(value="简介")
    private String brief;

    /**
    * 事件项
    */
    @ApiModelProperty(value="事件项")
    private String things;

    /**
    * 周期
    */
    @ApiModelProperty(value="周期")
    private String circle;

    /**
    * 下一次提醒时间
    */
    @ApiModelProperty(value="下一次提醒时间")
    private Date nextTime;

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