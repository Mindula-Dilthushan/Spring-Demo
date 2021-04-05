package lk.config;

import lk.bean.SpringBean3;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig2 {
    @Bean
    public SpringBean3 springBean3(){
        return new SpringBean3();
    }

}
