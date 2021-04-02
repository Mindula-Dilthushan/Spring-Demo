package lk.config;

import lk.bean.DBConnection;
import lk.bean.SpringBean;
import lk.bean.SpringBean2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();

        //how to run a hooking process on java
        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("System is about to shutdown");
                ctx.close();
            }
        }));
//      ctx.registerShutdownHook();

        ctx.register(AppConfig.class);
        ctx.refresh();

//      SpringBean bean = ctx.getBean(SpringBean.class);

        //Request From bean id
        //class name --> first world first letter simple

//        SpringBean springBean = (SpringBean) ctx.getBean("1");
//        System.out.println("SpringBean 1 : "+springBean);
//
//        SpringBean2 springBean2 = (SpringBean2) ctx.getBean("springBean2");
//        System.out.println("SpringBean 2 : "+springBean2);

//      ctx.close();


//==================== Bean ====================================================

//      DBConnection dbConnectionBean1 = ctx.getBean(DBConnection.class);
//      DBConnection dbConnectionBean2 = ctx.getBean(DBConnection.class);
//      System.out.println(dbConnectionBean1);
//      System.out.println(dbConnectionBean2);

//        DBConnection dBConnection1 = (DBConnection) ctx.getBean("db");
//        System.out.println("DB Connection 1 : "+dBConnection1);
//        DBConnection dBConnection2 = (DBConnection) ctx.getBean("db");
//        System.out.println("DB Connection 2 : "+dBConnection2);




    }
}
