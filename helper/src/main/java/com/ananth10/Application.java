package com.ananth10;

import com.ananth10.pojo.DataBase;
import com.ananth10.services.service1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx =  SpringApplication.run(Application.class, args);
		DataBase db = (DataBase)ctx.getBean(DataBase.class);

        System.out.println(db.getName());
        System.out.println(db.getPassword());
	}
}
