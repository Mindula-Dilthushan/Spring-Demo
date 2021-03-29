package lk.bean;

import org.springframework.stereotype.Component;

@Component
public class SpringBean {
    public SpringBean(){
        System.out.println("Spring Bean Instantiated");
    }

    public void test(){
        System.out.println("Testing");
    }
}
