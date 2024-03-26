package com.acme.mainApp;

import com.acme.core.api.MyFirstServiceContract;
import com.acme.core.api.MySecondServiceContract;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(scanBasePackages = "com.acme")
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

    @Bean
    CommandLineRunner test(MyFirstServiceContract myFirstServiceContract,
                           MySecondServiceContract mySecondServiceContract,
                           @Value("com.acme.my-config") String myConfig){
        return args -> {
            System.out.println("Hello from main app");
            System.out.println(myFirstServiceContract.returnSomeResult());
            System.out.println(mySecondServiceContract.returnSomeResult());
            System.out.printf("My config from application.properties : %s%n", myConfig);
        };
    }
}
