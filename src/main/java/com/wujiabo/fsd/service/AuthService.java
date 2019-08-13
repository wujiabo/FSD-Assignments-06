package com.wujiabo.fsd.service;

import com.wujiabo.fsd.domain.auth.ResponseUserToken;
import com.wujiabo.fsd.domain.auth.User;
import com.wujiabo.fsd.domain.auth.UserDetail;
import com.wujiabo.fsd.domain.auth.UserExt;

public interface AuthService {
    /**
     * 注册用户
     * @param userDetail
     * @return
     */
    UserDetail register(UserDetail userDetail);

    /**
     * 登陆
     * @param user
     * @return
     */
    ResponseUserToken login(User user);

    /**
     * 登出
     * @param token
     */
    void logout(String token);

    /**
     * 刷新Token
     * @param oldToken
     * @return
     */
    ResponseUserToken refresh(String oldToken);

    /**
     * 根据Token获取用户信息
     * @param token
     * @return
     */
    UserDetail getUserByToken(String token);

    /**
     * 修改密码
     * @param token
     * @param userExt
     */
    void chgPassword(String token, UserExt userExt);

    /**
     * 保持验证码对应关系
     * @param text
     * @return
     */
    String saveCaptcha(String text);
}
