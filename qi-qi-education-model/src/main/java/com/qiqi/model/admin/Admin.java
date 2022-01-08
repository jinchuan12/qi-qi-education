package com.qiqi.model.admin;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.qiqi.model.base.BaseEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Author: 金川
 * @Description:
 * @Date:Created in 2022/1/8 21:13
 * @Modified By:
 */
@Data
@ApiModel(description = "管理员表")
@TableName("admin")
public class Admin extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "管理员用户名")
    @TableField("name")
    private String name;

    @ApiModelProperty(value = "管理员密码")
    @TableField("pass_word")
    private String passWord;

}
