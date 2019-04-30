package com.ccaf.config;

import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

/**
 * Created by steven on 2018/10/26.
 */
@Component
@MapperScan("com.ccaf.dao")
public class MybatisConfig {

  @Bean
  public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
    SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
    sqlSessionFactoryBean.setDataSource(dataSource);
    sqlSessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath*:sql/*.xml"));
    sqlSessionFactoryBean.setTypeAliasesPackage("com.ccaf.**.domain");
    Configuration configuration = new Configuration();
    configuration.setMapUnderscoreToCamelCase(true);
    sqlSessionFactoryBean.setConfiguration(configuration);
    // sqlSessionFactoryBean.setConfigLocation(new PathMatchingResourcePatternResolver().getResource("classpath:mybatis-config.xml"));
    return sqlSessionFactoryBean.getObject();
  }

}
