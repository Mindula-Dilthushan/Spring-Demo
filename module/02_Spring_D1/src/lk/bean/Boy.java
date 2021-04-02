package lk.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Boy implements DI{

    //    @Autowired //property injection
//    @Qualifier("girl1")
    GoodGirl girl;

    public Boy() {
        System.out.println("Boy Instantiated");
    }

//    @Autowired
//    public Boy(GoodGirl g) {
//        //constructor injection
//        System.out.println("Boy Instantiated");
//       this.girl=g;
//    }

//    @Autowired
//    public void setGirl(GoodGirl g){
//        //setter method injection
//        this.girl=g;
//    }

    @Autowired
    @Override
    public void inject(GoodGirl g) {
        //Interface through injection
        girl=g;
    }


    public void chatWithGirl() {
        girl.chat();
    }
}
