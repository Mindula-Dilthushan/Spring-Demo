package lk.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.stereotype.Component;

//@Component
public class SpringBean2 implements DisposableBean {

    public SpringBean2(){
        System.out.println("Spring Bean 2 Instantiated");
    }

    public void test2(){
        System.out.println("Testing 2");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Spring Bean 2 DisposableBean");
    }
}
