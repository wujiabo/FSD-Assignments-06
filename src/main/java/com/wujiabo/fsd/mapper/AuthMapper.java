package com.wujiabo.fsd.mapper;

import com.wujiabo.fsd.domain.auth.Role;
import com.wujiabo.fsd.domain.auth.UserDetail;
import org.apache.ibatis.annotations.*;

@Mapper
public interface AuthMapper {

    @Select("SELECT id, name as username, password from sys_user where name = #{name}")
    UserDetail findByUsername(@Param("name") String name);

    @Insert("insert into sys_user (name, password) VALUES (#{username}, #{password})")
    @Options(useGeneratedKeys=true, keyProperty="id", keyColumn="id")
    void insert(UserDetail userDetail);

    @Insert("insert into sys_user_role (user_id, role_id) VALUES (#{userId}, #{roleId})")
    int insertRole(@Param("userId") long userId, @Param("roleId") long roleId);

    @Select("select id, name, nameZh from sys_role where id = #{roleId}")
    Role findRoleById(@Param("roleId") long roleId);

    @Select("select a.* from sys_role a , sys_user_role b where a.id=b.role_id and b.user_id=#{userId}")
    Role findRoleByUserId(@Param("userId") long userId);

    @Update("update sys_user set password=#{password} where name = #{username}")
    void updatePassword(UserDetail userDetail);

    @Insert("insert into sys_captcha (captcha_key, captcha_value) VALUES (#{captchaKey}, #{captchaValue})")
    void insertCaptcha(@Param("captchaKey")String captchaKey, @Param("captchaValue")String captchaValue);

    @Select("SELECT captcha_value from sys_captcha where captcha_key = #{captchaKey}")
    String findCaptchaValue(@Param("captchaKey") String captchaKey);

    @Delete("delete from sys_captcha where captcha_key = #{captchaKey}")
    void deleteCaptcha(String captchaKey);
}
