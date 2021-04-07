package lk.config;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "lk")
@PropertySource({"classpath:application.properties"})
@PropertySource({"classpath:application2.properties"})
public class AppConfig {
}