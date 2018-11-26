package com.ananth10.services;

import com.ananth10.pojo.DataBase;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

//add these 2 annotations
@Configuration
@PropertySource("classpath:database.properties")
public class service1 {


    @Value("${ananth.name}")
    public String name;

    @Value("${ananth.password}")
    public String password;

    @Bean
    public DataBase getDetails(){
        DataBase db = new DataBase();
        db.setName(name);
        db.setPassword(password);
        return db;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer property(){
        return new PropertySourcesPlaceholderConfigurer();
    }


}
