package lk.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class SpringBean3 {

    @Autowired(required = false)
    public SpringBean3(@Value("C001") String id,@Value("Mindula") String name){
        System.out.println("SpringBean Three Two Parameters");
    }
    @Autowired(required = false)
    public SpringBean3(@Value("C002") String id,@Value("Dilthushan") String name,@Value("Matara") String address){
        System.out.println("SpringBean Three Three Parameters");
    }
}
