package com.peter8icestone.bean;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanTest {

	@Test
	public void testIoc() {
		// Spring应用上下文，官方称之为Ioc容器（错误的认识：容器就是map而已；
		// 准确来说，map是ioc容器的一个成员，叫做单例池，singletonObjects，
		// 容器是一组组件和过程的集合，包括：BeanFactory、单例池、BeanPostProcessor等以及之间的协作流程）


		/*
		 * Spring Bean生命周期
		 * 构造器执行、初始化方法执行，Bean后置处理器的before/after方法：AbstractApplicationContext#refresh#finishBeanFactoryInitialization
		 * Bean工厂后置处理器初始化、方法执行：AbstractApplicationContext#refresh#invokeBeanFactoryPostProcessors
		 * Bean后置处理器初始化：AbstractApplicationContext#refresh#registerBeanPostProcessors
		 */

		ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		TestBean testBean = classPathXmlApplicationContext.getBean(TestBean.class);
		System.out.println(testBean);
	}
}
