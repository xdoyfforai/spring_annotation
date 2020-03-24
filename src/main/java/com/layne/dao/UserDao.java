package com.layne.dao;

import com.layne.entity.UserEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author layne staley
 * @date 2020/3/22
 */
@Mapper
public interface UserDao {

	List<UserEntity> selectByUserName(@Param("username") String username);

	@Insert("INSERT INTO tbl_user(user_name, user_age, user_gender, user_email) VALUES(#{user.name},#{user.age},#{user.gender},#{user.email})")
	void insertOne(@Param("user") UserEntity user);

}
