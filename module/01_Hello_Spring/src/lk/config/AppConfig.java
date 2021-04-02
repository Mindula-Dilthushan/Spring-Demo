package lk.config;

import lk.bean.DBConnection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "lk")
public class AppConfig {

    @Bean
    public DBConnection dbConnection(){
        return new DBConnection();
    }
}
