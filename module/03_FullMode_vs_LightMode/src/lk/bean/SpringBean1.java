package lk.bean;

import org.springframework.context.annotation.Bean;

public class SpringBean1 {
    public SpringBean1() {
        System.out.println("Spring Bean 1 Instantiated");
    }
    //Light Mode
//    if we define a bean method inside a another bean its light mode
//    @Bean
//    public SpringBean2 springBean2() {
//        return new SpringBean2();
//    }

    //Light Mode
    //Not satisfying inter-bean dependency invocation
    @Bean
    public SpringBean2 springBean2(){
        //Inter-bean Dependency Invocation
        SpringBean3 springBean1 = springBean3();
        SpringBean3 springBean2 = springBean3();
        System.out.println(springBean1);
        System.out.println(springBean2);
        return new SpringBean2();
    }

    @Bean
    public SpringBean3 springBean3(){
        return new SpringBean3();
    }
}
