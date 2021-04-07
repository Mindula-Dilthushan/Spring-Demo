package lk.bean;

import com.sun.prism.PixelFormat;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.swing.*;
import javax.xml.bind.DatatypeConverter;

//@Component
public class SpringBean1 {

//    public SpringBean1() {
//        System.out.println("Spring Bean One Default Constructor");
//    }

    public SpringBean1(@Value("C001") String id,@Value("Mindula") String name){
        System.out.println("Spring Bean One");
        System.out.println(id+" "+name);
    }
}
