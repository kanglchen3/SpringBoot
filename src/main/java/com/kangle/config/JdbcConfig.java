package com.kangle.config;

import com.alibaba.druid.pool.DruidDataSource;
import jdk.nashorn.internal.ir.CallNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

@Configuration
//@PropertySource("classpath:jdbc.properties")
//@EnableConfigurationProperties(JdbcProperties.class)
public class JdbcConfig {

//    @Value("${jdbc.driver}")
//    private String driver;
//
//    @Value("${jdbc.url}")
//    private String url;
//
//    @Value("${jdbc.username}")
//    private String username;
//
//    @Value("${jdbc.password}")
//    private String password;
//
//    @Bean
//    public DataSource dataSource(){
//        DruidDataSource druid = new DruidDataSource();
//        druid.setDriverClassName(driver);
//        druid.setUrl(url);
//        druid.setUsername(username);
//        druid.setPassword(password);
//        return druid;
//    }

//    @Bean
//    public DataSource dataSource(JdbcProperties jdbcProperties){
//        DruidDataSource druid = new DruidDataSource();
//        druid.setDriverClassName(jdbcProperties.getDriverClassName());
//        druid.setUrl(jdbcProperties.getUrl());
//        druid.setUsername(jdbcProperties.getUserName());
//        druid.setPassword(jdbcProperties.getPassword());
//        return druid;
//    }

    @Bean
    @ConfigurationProperties(prefix = "jdbc")
    //能自动匹配是因为springboot自动帮你调用dataSourced的setDriverClassName，所以你的application.properties必须有driverClassName属性
    public DataSource dataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        return dataSource;
    }
}
