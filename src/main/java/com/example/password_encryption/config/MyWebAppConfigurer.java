package com.example.password_encryption.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class MyWebAppConfigurer implements EnvironmentAware {
    private static final Logger logger = LoggerFactory.getLogger(MyWebAppConfigurer.class);

//    private RelaxedPropertyResolver propertyResolver;

    @Value("${spring.datasource.url}")
    private String myUrl;

    @Value("${JASYPT_ENCRYPTOR_PASSWORD}")
    private String javaHome;

    /**
     * 这个方法只是测试实现EnvironmentAware接口，读取环境变量的方法。
     */
    @Override
    public void setEnvironment(Environment env) {
//        logger.info("javaHome:{}", env.getProperty("JAVA_HOME"));
//        logger.info("javaHome:{}",javaHome);
        logger.info(myUrl);
        logger.info("javaHome!!:{}", javaHome);
        String str = env.getProperty("spring.datasource.url");
        logger.info(str);
//        propertyResolver = new RelaxedPropertyResolver(env, "spring.datasource.");
//        String url = propertyResolver.getProperty("url");
//        logger.info(url);
    }
}

