package lk.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBean2 {
    public SpringBean2(@Value("C001") String id,@Value("Kasun,Dasun,Mindula") String names[]) {
        System.out.println("Parameterised Constructor");
        for (String name : names){
            System.out.println(id+" "+name);
        }
    }
}
