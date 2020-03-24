package com.layne.entity;

import lombok.Data;

/**
 * @author layne staley
 * @date 2020/3/17
 */
@Data
public class UserEntity {
	private Integer id;
	private String name;
	private Integer age;
	private String gender;
	private String email;
}
