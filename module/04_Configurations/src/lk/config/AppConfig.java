package lk.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(basePackages = "lk")
//@Import({AppConfig1.class,AppConfig2.class})//selecting a main configuration class and import other configuration to it
//@ImportResource({"clasc"}) //xml file 
public class AppConfig {

}
