package com.layne.dao;

import org.springframework.stereotype.Repository;

/**
 * @author layne staley
 * @date 2020/3/16
 */
@Repository
public class HelloDaoImpl implements HelloDao {
	public String getMessage() {
		return "hello";
	}
}
