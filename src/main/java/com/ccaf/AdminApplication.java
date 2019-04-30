package com.ccaf;


import com.ccaf.util.SpringContextUtils;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Administrator on 2019/2/24.
 */
@SpringBootApplication
@ComponentScan(basePackages="com.*")
@MapperScan("com.ccaf.*.dao")
public class AdminApplication {

    public static void main(String[] a){
        ConfigurableApplicationContext cpntext = SpringApplication.run(AdminApplication.class, a);
        SpringContextUtils.setApplicationContext(cpntext);
    }

}
