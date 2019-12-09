package com.roshan.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = DynamicTest1.PACKAGE, sqlSessionFactoryRef = "dynamicTest1SqlSessionFactory")
public class DynamicTest1 {
    static final String PACKAGE = "com.roshan.dao.dynamicTest1";
    private static final String MAPPER_LOCAL = "classpath:mapper/dynamicTest1/*.xml";

    @Primary
    @ConfigurationProperties("spring.datasource.hikari.dynamic-test1")
    @Bean(name = "dynamicTest1DataSource")
    public DataSource dynamicTest1DataSource() {
        return DataSourceBuilder.create().build();
    }

    @Primary
    @Bean(name = "dynamicTest1SqlSessionFactory")
    public SqlSessionFactory dynamicTest1SqlSessionFactory(@Qualifier("dynamicTest1DataSource") DataSource dataSource) throws Exception {
        final SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
        sessionFactoryBean.setDataSource(dataSource);
        sessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(MAPPER_LOCAL));
        return sessionFactoryBean.getObject();
    }

//    @Bean(name = "baseTransactionManager")
//    public DataSourceTransactionManager baseTransactionManager() {
//        return new DataSourceTransactionManager(dynamicTest1DataSource());
//    }
//    @Bean("test1SqlSessionTemplate")
//    @Primary
//    public SqlSessionTemplate test1sqlsessiontemplate(@Qualifier("test1SqlSessionFactory") SqlSessionFactory sessionfactory) {
//        return new SqlSessionTemplate(sessionfactory);
//    }
}
