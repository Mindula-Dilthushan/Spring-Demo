package lk.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class SpringBean5 implements InitializingBean {
    //Property place holders ${}
    @Value("${USERNAME}")
    String user;

    public SpringBean5() {
        System.out.println("Spring Bean 5 Instantiated");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(user);
    }
}
