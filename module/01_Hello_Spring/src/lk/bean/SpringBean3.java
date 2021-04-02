package lk.bean;

import org.springframework.stereotype.Component;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;


@Component
public class SpringBean3 implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {

    public SpringBean3(){
        System.out.println("Spring Bean 3 Instantiated");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Spring Bean 3 BeanNameAware");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Spring Bean 3 BeanFactoryAware");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Spring Bean 3 ApplicationContextAware");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Spring Bean 3 InitializingBean");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Spring Bean 3 DisposableBean");
    }
}
