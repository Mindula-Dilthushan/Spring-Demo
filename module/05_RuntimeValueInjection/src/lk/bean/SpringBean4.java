package lk.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class SpringBean4 implements InitializingBean {

    //Instance Property
    @Value("Mindula Dilthushan")
    String fullName;

    public SpringBean4() {
        System.out.println("Spring Bean 4 Instantiated");
        System.out.println(fullName);///bean not initialized yet.. so this is null
    }
    //this method is called after bean is ready
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(fullName);// so this print the name
    }
}
