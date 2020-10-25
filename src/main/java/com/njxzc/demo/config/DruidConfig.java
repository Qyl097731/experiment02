package com.njxzc.demo.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * projectName:  experiment02
 * packageName: com.njxzc.demo.config
 * date: 2020-10-25 17:37
 * copyright(c) 2020 南晓18卓工 邱依良
 */
@Configuration
public class DruidConfig {

    @ConfigurationProperties(prefix = "spring.datasource.druid")
    @Bean
    public DataSource druid(){
        return new DruidDataSource();
    }


    /*
    配置Druid的监控
    配置一个管理后台的Servlet
    */

    @Bean
    public ServletRegistrationBean statViewServlet(){
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(new StatViewServlet(), "/druid/*");
        Map<String,String> initParams = new HashMap<>();
        initParams.put("loginUsername","admin");
        initParams.put("loginPassword","123456");
        initParams.put("allow","");
        initParams.put("deny","192.168.137.1");
        registrationBean.setInitParameters(initParams);
        return registrationBean;
    }

    @Bean
    public FilterRegistrationBean webStatFilter(){
        FilterRegistrationBean bean = new FilterRegistrationBean();
        bean.setFilter(new WebStatFilter());
        Map<String,String> initParam = new HashMap<>();
        initParam.put("exclusions","*.js,*.css,/druid/*");
        bean.setInitParameters(initParam);
        bean.setUrlPatterns(Arrays.asList("/*"));
        return bean;
    }

}