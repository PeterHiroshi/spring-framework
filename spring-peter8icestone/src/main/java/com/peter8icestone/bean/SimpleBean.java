package com.peter8icestone.bean;

import org.springframework.stereotype.Service;

@Service
public class SimpleBean {

	public void print() {
		System.out.println(this.getClass().getName());
	}
}
