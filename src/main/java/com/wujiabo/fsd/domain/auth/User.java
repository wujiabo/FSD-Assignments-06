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
    @ApiModelProperty(value = "验证码key", required = false)
    @Size(min=6, max=20)
    private String captchaKey;
    @ApiModelProperty(value = "验证码value", required = false)
    @Size(min=4, max=20)
    private String captchaValue;

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

    public String getCaptchaKey() {
        return captchaKey;
    }

    public void setCaptchaKey(String captchaKey) {
        this.captchaKey = captchaKey;
    }

    public String getCaptchaValue() {
        return captchaValue;
    }

    public void setCaptchaValue(String captchaValue) {
        this.captchaValue = captchaValue;
    }
}
