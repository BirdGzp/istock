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
* @date Date : 2020年03月30日 15:02
* @version V1.0
*/
@ApiModel(value="com-moon-manager-module-po-Article")
@Data
public class Article {
    /**
    * 自增主键
    */
    @ApiModelProperty(value="自增主键")
    private Integer id;

    /**
    * 文章id
    */
    @ApiModelProperty(value="文章id")
    private Integer articleId;

    /**
    * 文章名
    */
    @ApiModelProperty(value="文章名")
    private String articleName;

    /**
    * 目录的顺序id
    */
    @ApiModelProperty(value="目录的顺序id")
    private Integer catalogueId;

    /**
    * 目录
    */
    @ApiModelProperty(value="目录")
    private String catalogue;

    /**
    * 内容
    */
    @ApiModelProperty(value="内容")
    private String content;

    @ApiModelProperty(value="数据创建起始日期")
    private Date dataCreateTime;

    @ApiModelProperty(value="数据更新日期")
    private Date dataUpdateTime;

    @ApiModelProperty(value="数据是否删除 0 未删除， 1 已删除")
    private Byte dataIsDeleted;
}