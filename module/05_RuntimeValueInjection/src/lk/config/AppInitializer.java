package lk.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import java.util.Properties;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        ctx.registerShutdownHook();

        //how to get system env predefined variables
//        Map<String,String> env = System.getenv();
//        for (String key : env.keySet()){
//            String value = env.get(key);
//            System.out.println(key + " : " + value);
//        }

        // hot to get properties from java
//        Properties properties = System.getProperties();
//        for (Object key : properties.keySet()){
//            Object value = properties.get(key);
//            System.out.println(key + " : " + value);
//        }
    }
}
