package com.layne.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.io.IOException;

/**
 * @author layne staley
 * @date 2020/3/16
 */
@Configuration
@ComponentScan(value = {"com.layne.config","com.layne.dao","com.layne.web.service"})
@PropertySource(value = "classpath:application.properties")
@MapperScan("com.layne.dao")
@EnableTransactionManagement
public class AppConfig {

	/**
	 * 配置dataSource
	 *
	 */
	@Bean
	public DataSource dataSource(PropertiesConfig properties) {
		DruidDataSource dataSource = new DruidDataSource();

		dataSource.setUrl(properties.getJdbcUrl());
		dataSource.setUsername(properties.getJdbcUsername());
		dataSource.setPassword(properties.getJdbcPassword());
		return dataSource;
	}


	/**
	 * 配置mybatis的SqlSessionFactoryBean
	 *
	 * @param dataSource dataSource
	 * @param propertiesConfig 配置文件类
	 * @return sqlSessionFactoryBean
	 */
	@Bean
	public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource, PropertiesConfig propertiesConfig) throws IOException {
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		//设置dataSource
		sqlSessionFactoryBean.setDataSource(dataSource);
		//设置entity使用别名
		sqlSessionFactoryBean.setTypeAliasesPackage(propertiesConfig.getMybatistypealiaspackages());
		//设置mapper xml文件位置
		PathMatchingResourcePatternResolver classPathResource = new PathMatchingResourcePatternResolver();
		sqlSessionFactoryBean.setMapperLocations(classPathResource.getResources(propertiesConfig.getMybatismapperlocations()));

		return sqlSessionFactoryBean;
	}

	/**
	 * 配置spring的声明式事务
	 *
	 * @return transactionManager
	 */

	@Bean
	public PlatformTransactionManager transactionManager(DataSource dataSource) {
		return new DataSourceTransactionManager(dataSource);
	}

}
