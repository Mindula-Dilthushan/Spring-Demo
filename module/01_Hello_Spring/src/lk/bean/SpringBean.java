package lk.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.stereotype.Component;

@Component("1")
public class SpringBean implements DisposableBean {

    public SpringBean(){
        System.out.println("Spring Bean 1 Instantiated");
    }

    public void test(){
        System.out.println("Testing");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Spring Bean 1 DisposableBean");
    }
}
