package com.layne.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author layne staley
 * @date 2020/3/16
 */
@ComponentScan(value = {"com.layne.dao","com.layne.services"})
public class AppConfig {

}
