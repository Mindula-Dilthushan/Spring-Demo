package lk.config;

import lk.bean.Boy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("System is about to shutdown");
                ctx.close();
            }
        }));
        ctx.register(AppConfig.class);
        ctx.refresh();

        Boy boy = ctx.getBean(Boy.class);
        boy.chatWithGirl();
    }
}
