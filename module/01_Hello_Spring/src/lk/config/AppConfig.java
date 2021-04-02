package lk.config;

import lk.bean.DBConnection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "lk")
public class AppConfig {

    //Another way of specifying a lk.bean to the container
    //generate lk.bean id from lk.bean method name
    //we can change id as we want by passing a value to @Bean annotation
//    @Bean("db")
    public DBConnection dbConnection(){
        return new DBConnection();
    }
}
