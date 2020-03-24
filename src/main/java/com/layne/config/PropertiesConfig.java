package com.layne.config;

import lombok.Data;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author layne staley
 * @date 2020/3/24
 */
@Component
@PropertySource("classpath:application.properties")
@Getter
public class PropertiesConfig {

	@Value("${jdbc_url}")
	private String jdbcUrl;

	@Value("${jdbc_user}")
	private String jdbcUsername;


	@Value("${jdbc_password}")
	private String jdbcPassword;

	@Value("${mybatis_typealias_packages}")
	private String mybatistypealiaspackages;

	@Value("${mybatis_mapper_locations}")
	private String mybatismapperlocations;
}
