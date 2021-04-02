package lk.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Girl implements GoodGirl{

    public Girl() {
        System.out.println("Girl 1 Instantiated");
    }

    @Override
    public void chat() {
        System.out.println("Girl 1 : Hello There... How are you..?");
    }
}
