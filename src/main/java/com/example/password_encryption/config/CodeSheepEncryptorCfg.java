//package com.example.password_encryption.config;
//
//import jakarta.persistence.EntityManager;
//import org.jasypt.encryption.StringEncryptor;
//import org.jasypt.encryption.pbe.PooledPBEStringEncryptor;
//import org.jasypt.encryption.pbe.config.SimpleStringPBEConfig;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class CodeSheepEncryptorCfg {
//    @Value("${server.port}")
//    private String javaHome;
//
//    //    @Autowired
////    private EntityManager em;
//    @Bean(name = "codeSheepEncryptorBean")
//    public StringEncryptor codeSheepStringEncryptor() {
////        System.out.println("javaHome:" + javaHome);
//        String javaHome = System.getenv("JAVA_HOME");
//        System.out.println("javaHome1:" + javaHome);
//        System.out.println("javaHome2:" + System.getProperty("JAVA_HOME"));
//        System.out.println("javaHome3:" + System.getenv("CLASS_PATH"));
//
//
//        PooledPBEStringEncryptor encryptor = new PooledPBEStringEncryptor();
//
//        SimpleStringPBEConfig config = new SimpleStringPBEConfig();
//        config.setPassword("CodeSheep");
//        config.setAlgorithm("PBEWITHHMACSHA512ANDAES_256");
//        config.setKeyObtentionIterations("1000");
//        config.setPoolSize("1");
//        config.setProviderName("SunJCE");
//        config.setSaltGeneratorClassName("org.jasypt.salt.RandomSaltGenerator");
//        config.setIvGeneratorClassName("org.jasypt.iv.RandomIvGenerator");
//        config.setStringOutputType("base64");
//        encryptor.setConfig(config);
////        System.out.println("javaHome:" + javaHome);
//
//        return encryptor;
//    }
//}
