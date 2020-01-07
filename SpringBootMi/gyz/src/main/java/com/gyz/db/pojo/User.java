package com.gyz.db.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class User {

    @ApiModelProperty("用户id")
    private int id;
    @ApiModelProperty("用户名字")
    private String nickname;
    @ApiModelProperty("用户密码")
    private String password;
    @ApiModelProperty("用户性别")
    private String sex;
    @ApiModelProperty("用户头像")
    private String icon;
    @ApiModelProperty("用户token")
    private String token;

}
