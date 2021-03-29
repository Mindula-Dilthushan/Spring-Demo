package lk.bean;

import org.springframework.stereotype.Component;

@Component
public class SpringBean2 {
    public SpringBean2(){
        System.out.println("Spring Bean 2 Instantiated");
    }

    public void test2(){
        System.out.println("Testing 2");
    }
}
