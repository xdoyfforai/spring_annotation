package com.layne.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author layne staley
 * @date 2020/3/16
 */
@ComponentScan("com.layne.web.controller")
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {
	public void configureViewResolvers(ViewResolverRegistry registry) {
		registry.jsp("/WEB-INF/views/",".jsp");
	}
}
