package lk.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SpringBean2 implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public SpringBean2() {
        System.out.println("Spring Bean 2 Instantiated");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Spring Bean 2 Bean Name Aware");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Spring Bean 2 Bean Factory Aware");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Spring Bean 2 Bean Application Context Aware");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Spring Bean 2 Initializing Bean  Aware");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Spring Bean 2 Disposable Bean Aware");
    }
}