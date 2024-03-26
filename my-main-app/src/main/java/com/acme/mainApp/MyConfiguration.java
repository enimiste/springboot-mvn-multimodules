package com.acme.mainApp;

import com.acme.core.api.MyFirstServiceContract;
import com.acme.core.api.MySecondServiceContract;
import com.acme.secondlib.MySecondService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {
    @Bean
    MySecondServiceContract mySecondServiceContract(MyFirstServiceContract myFirstServiceContract){
        //We can also define beans on the app modyle instead of the lib module
        return new MySecondService(myFirstServiceContract);
    }
}
