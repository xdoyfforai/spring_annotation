package com.layne.web.service;

import com.layne.dao.UserDao;
import com.layne.dto.UserDto;
import com.layne.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * @author layne staley
 * @date 2020/3/23
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	public List<UserDto> getUserByName(String username) {

		List<UserEntity> users = userDao.selectByUserName(username);
		List<UserDto> userDtos = new ArrayList<UserDto>();

		for (UserEntity user : users) {
			UserDto userDto = new UserDto(user);
			userDtos.add(userDto);

		}
		return userDtos;
	}

	@Transactional(rollbackFor = Exception.class)
	public void addUser(UserDto user) {
		UserEntity userEntity = new UserEntity();

		userEntity.setName(user.getName());
		userEntity.setAge(user.getAge());;
		userEntity.setGender(user.getGender());
		userEntity.setEmail(user.getEmail());

		userDao.insertOne(userEntity);
		System.out.println("insertOne.....");

//		int i = 1/0;

	}
}
