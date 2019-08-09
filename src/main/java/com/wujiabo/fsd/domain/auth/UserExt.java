package com.wujiabo.fsd.domain.auth;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Size;

public class UserExt extends User {
    @ApiModelProperty(value = "新密码", required = true)
    @Size(min=6, max=20)
    private String newPassword;

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }
}
