package lk.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class SpringBean8 implements InitializingBean {

    @Autowired
    Environment env;

    public SpringBean8() {
        System.out.println("Spring Bean 8 Instantiated");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        //System.getEnv()
        String user = env.getProperty("USERNAME");
        System.out.println(user);

        //System.getProperty
        String osName = env.getProperty("os.name");
        System.out.println(osName);

        //Resource Bundle();
        String name = env.getProperty("user.fname");
        System.out.println(name);

        //System.getProperty();
        //If we enter a invalid property key it returns a null
        String address = env.getProperty("user.address");
        System.out.println(address);

        //if we enter a invalid property key it returns a exceptions
//        String userAddress = env.getRequiredProperty("user.addess"); //Invalid Key
//        System.out.println(userAddress);

    }
}
