package com.roshan.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = DynamicTest2.PACKAGE, sqlSessionFactoryRef = "dynamicTest2SqlSessionFactory")
public class DynamicTest2 {
    static final String PACKAGE = "com.roshan.dao.dynamicTest2";
    private static final String MAPPER_LOCAL = "classpath:mapper/dynamicTest2/*.xml";

    @ConfigurationProperties("spring.datasource.hikari.dynamic-test2")
    @Bean(name = "dynamicTest2DataSource")
    public DataSource dynamicTest2DataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "dynamicTest2SqlSessionFactory")
    public SqlSessionFactory dynamicTest2SqlSessionFactory(@Qualifier("dynamicTest2DataSource") DataSource dataSource) throws Exception {
        final SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
        sessionFactoryBean.setDataSource(dataSource);
        sessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(MAPPER_LOCAL));
        return sessionFactoryBean.getObject();
    }

//    @Bean(name = "baseTransactionManager")
//    public DataSourceTransactionManager baseTransactionManager() {
//        return new DataSourceTransactionManager(dynamicTest2DataSource());
//    }
//    @Bean("test1SqlSessionTemplate")
//    @Primary
//    public SqlSessionTemplate test1sqlsessiontemplate(@Qualifier("test1SqlSessionFactory") SqlSessionFactory sessionfactory) {
//        return new SqlSessionTemplate(sessionfactory);
//    }
}
