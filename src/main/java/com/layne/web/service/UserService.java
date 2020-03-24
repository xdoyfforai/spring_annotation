package com.layne.web.service;

import com.layne.dto.UserDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author layne staley
 * @date 2020/3/22
 */
public interface UserService {

	List<UserDto> getUserByName(@Param("username") String username);

	void addUser(UserDto user);
}
