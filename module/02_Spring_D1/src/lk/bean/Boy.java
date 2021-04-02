package lk.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Boy {

    @Autowired
    GoodGirl goodGirl;

    public Boy() {
        System.out.println("Boy Instantiated");
    }

    public void chatWithGirl(){
        goodGirl.chat();
    }
}
