package com.peter8icestone.bean;

import org.springframework.beans.factory.InitializingBean;

public class TestBean implements InitializingBean {

	public TestBean() {
		System.out.println("TestBean constructor");
	}

	@Override
	public void afterPropertiesSet() {
		System.out.println("TestBean afterPropertiesSet");
	}
}
