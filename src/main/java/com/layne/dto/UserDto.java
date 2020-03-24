package com.layne.dto;

import com.layne.entity.UserEntity;
import lombok.Data;

/**
 * @author layne staley
 * @date 2020/3/23
 */
@Data
public class UserDto {
	private Integer id;
	private String name;
	private Integer age;
	private String gender;
	private String email;

	public UserDto() {
	}

	public UserDto(String name, Integer age, String gender, String email) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.email = email;
	}

	public UserDto(UserEntity userEntity) {

		this.id = userEntity.getId();
		this.name = userEntity.getName();
		this.age = userEntity.getAge();
		this.gender = userEntity.getGender();
		this.email = userEntity.getEmail();

	}
}
