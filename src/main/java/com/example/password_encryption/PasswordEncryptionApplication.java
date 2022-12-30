package com.example.password_encryption;

import org.jasypt.encryption.StringEncryptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class PasswordEncryptionApplication implements CommandLineRunner {
    @Autowired
    private ApplicationContext appCtx;

    @Autowired
    private StringEncryptor codeSheepEncryptorBean;


    public static void main(String[] args) {
        SpringApplication.run(PasswordEncryptionApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//
//        Environment environment = appCtx.getBean(Environment.class);
//        System.out.println("environment:" + environment);
//
//        // 首先获取配置文件里的原始明文信息
//        String mssqlOriginPswd = environment.getProperty("spring.datasource.password");
//
//
//        // 加密
//        String mysqlEncryptedPswd = encrypt(mssqlOriginPswd);
//
//        // 打印加密前后的结果对比
//        System.out.println("MsSQL原始明文密碼為：" + mssqlOriginPswd);
//        System.out.println("====================================");
//        System.out.println("MsSQL原始明文密碼加密結果：" + mysqlEncryptedPswd);
//        System.out.println("MsSQL原始明文密碼加密結果在解密：" + decrypt(mysqlEncryptedPswd));
//

        /**
         * 作者：CodeSheep
         *         链接：https://juejin.cn/post/6844904137423847438
         *         来源：稀土掘金
         *         著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
         */

    }
//
//    private String encrypt(String originPassord) {
//        return codeSheepEncryptorBean.encrypt(originPassord);
//    }
//
//    private String decrypt(String encryptedPassword) {
//        return codeSheepEncryptorBean.decrypt(encryptedPassword);
//    }

}
