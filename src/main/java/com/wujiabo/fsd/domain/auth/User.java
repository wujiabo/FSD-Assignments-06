package com.wujiabo.fsd.domain.auth;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Size;

public class User {
    @ApiModelProperty(value = "用户名", required = true)
    @Size(min=3, max=20)
    private String name;
    @ApiModelProperty(value = "密码", required = true)
    @Size(min=6, max=20)
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
