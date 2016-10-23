package com.springintegration.sample.transformers;

import java.io.IOException;

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
	public static void main(String[] args) throws IOException {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"/META-INF/spring/si-components.xml");
	/*	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Type exit to close program.");*/
		while (true) {
			/*
			 * String input = reader.readLine(); if
			 * (input.toLowerCase().equals("exit")) { System.exit(0); }
			 */
		}

	}
}
