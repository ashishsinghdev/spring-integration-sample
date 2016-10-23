package com.springintegration.sample.channel;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @author Ashish Singh Dev
 * @version 1.0
 * @since Oct 22, 2016
 *
 */
public class Application {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"/META-INF/spring/si-components.xml");
		while (true) {

		}

	}
}
