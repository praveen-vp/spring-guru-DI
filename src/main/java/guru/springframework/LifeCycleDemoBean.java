package guru.springframework;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * 
 * @author praveen-vp
 * 11-Jul-2018
 *
 */
@Component
public class LifeCycleDemoBean
		implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {

	public LifeCycleDemoBean() {
		System.out.println("##<><>##I'm in LifeCycleDemoBean constructor");
	}

	public void beforeInit() {
		System.out.println("##<><>## Before init method calle by bean post processor");
	}

	public void afterInit() {
		System.out.println("##<><>## After init method calle by bean post processor");
	}

	@PostConstruct
	public void postConstruct() {
		System.out.println("##<><>##Post construct annotated method has been called.");
	}

	@PreDestroy
	public void preDestroy() {
		System.out.println("##<><>##PreDestroy annotated method has been called.");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("##<><>##in LifeCycleDemoBean constructor");

	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("##<><>##bean factory has been set");

	}

	@Override
	public void setBeanName(String name) {
		System.out.println("##<><>##bean name is : " + name);

	}

	@Override
	public void destroy() throws Exception {
		System.out.println("##<><>##in LifeCycleDemoBean destroyed");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("##<><>## LifeCycleDemoBean has properties set.");

	}

}
