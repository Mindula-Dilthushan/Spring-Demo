package lk.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        //register all configurations to the context
        ctx.register(AppConfig.class);
//        ctx.register(AppConfig1.class);
//        ctx.register(AppConfig2.class);
        ctx.refresh();
        ctx.registerShutdownHook();
    }
}
