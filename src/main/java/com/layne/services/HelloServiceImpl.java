package com.layne.services;

import com.layne.dao.HelloDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author layne staley
 * @date 2020/3/16
 */
@Service
public class HelloServiceImpl implements HelloService {

	@Autowired
	private HelloDao helloDao;

	public String sayHello() {
		return helloDao.getMessage();

	}
}
