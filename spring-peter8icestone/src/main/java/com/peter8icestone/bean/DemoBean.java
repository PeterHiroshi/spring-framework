package com.peter8icestone.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("demoBean")
public class DemoBean {

	@Autowired
	private SimpleBean simpleBean;

	public DemoBean() {
	}

	public void print() {
		System.out.println("[DemoBean]->[print]");
		simpleBean.print();
	}
}
