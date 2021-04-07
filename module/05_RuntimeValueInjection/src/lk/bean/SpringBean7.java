package lk.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class SpringBean7 implements InitializingBean {

    //Property place holders ${}
    @Value("${user.name}")
    String name;

    @Value("${user.address}")
    String address;

    @Value("${user.name2}")
    String name2;

    public SpringBean7() {
        System.out.println("Spring Bean 7 Instantiated");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(name);
        System.out.println(address);
        System.out.println(name2);
    }
}
