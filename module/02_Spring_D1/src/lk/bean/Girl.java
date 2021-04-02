package lk.bean;

import org.springframework.stereotype.Component;

@Component
public class Girl implements GoodGirl{

    public Girl() {
        System.out.println("Girl Instantiated");
    }

    @Override
    public void chat() {
        System.out.println("Hello Boy");
    }
}
