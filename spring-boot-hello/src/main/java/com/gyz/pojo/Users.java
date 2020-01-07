package com.gyz.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("用户实体类")
public class Users {

   @ApiModelProperty("用户名")
   public String user_name;
   @ApiModelProperty("用户头像")
   public String user_icon;


}
