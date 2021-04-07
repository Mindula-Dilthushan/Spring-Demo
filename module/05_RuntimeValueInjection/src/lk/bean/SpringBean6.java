package lk.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class SpringBean6 implements InitializingBean {

    //Property place holders ${}
    //Java Property
    @Value("${user.country}")
    String user;

    @Value("${os.name}")
    String os;

    public SpringBean6() {
        System.out.println("Spring Bean 6 Instantiated");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(user);
        System.out.println(os);
    }
}
