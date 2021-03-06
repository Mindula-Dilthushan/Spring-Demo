package lk.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class DBConnection implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {

    public DBConnection() {
        System.out.println("DB Connection Instantiated");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("DB Connection BeanNameAware");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("DB Connection BeanFactoryAware");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("DB Connection ApplicationContextAware");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("DB Connection InitializingBean");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DB Connection DisposableBean");

    }
}
