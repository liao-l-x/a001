package com.example.demo.shiro;

import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/*
    Shiro 配置类
    @author llx
 */
@Configuration
public class shiroConfig {


    /*
    创建DefaultWebSecurityManager
     */
   /* public DefaultWebSecurityManager getDefaultWebSecurityManager(){

    }*/
    /*
    * 创建realm
    */
    @Bean
    public UserRealm getRealm(){
        return new UserRealm();
    }
}
