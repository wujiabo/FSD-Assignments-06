package com.wujiabo.fsd.mapper;

import com.wujiabo.fsd.domain.auth.Role;
import com.wujiabo.fsd.domain.auth.UserDetail;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface AuthMapper {

    @Select("SELECT id, name as username, password from sys_user where name = #{name}")
    UserDetail findByUsername(@Param("name") String name);

    @Insert("insert into sys_user (name, password) VALUES (#{username}, #{password})")
    void insert(UserDetail userDetail);

    @Insert("insert into sys_user_role (user_id, role_id) VALUES (#{userId}, #{roleId})")
    int insertRole(@Param("userId") long userId, @Param("roleId") long roleId);

    @Select("select id, name, nameZh from sys_role where id = #{roleId}")
    Role findRoleById(@Param("roleId") long roleId);

    @Select("select a.* from sys_role a , sys_user_role b where a.id=b.role_id and b.user_id=#{userId}")
    Role findRoleByUserId(@Param("userId") long userId);
}
