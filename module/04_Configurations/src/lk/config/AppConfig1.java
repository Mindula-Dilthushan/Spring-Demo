package lk.config;

import lk.bean.SpringBean2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig1 {
    @Bean
    public SpringBean2 springBean2(){
        return new SpringBean2();
    }
}
