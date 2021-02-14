package com.peter8icestone.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

public class TestBean implements InitializingBean {

	private SimpleBean simpleBean;

	public SimpleBean getSimpleBean() {
		return simpleBean;
	}

	public void setSimpleBean(SimpleBean simpleBean) {
		this.simpleBean = simpleBean;
	}

	public TestBean() {
		System.out.println("TestBean constructor");
	}

	@Override
	public void afterPropertiesSet() {
		System.out.println("TestBean afterPropertiesSet");
	}
}
