package com.springintegration.sample.filter;

import java.io.File;

import org.springframework.integration.core.MessageSelector;
import org.springframework.messaging.Message;
/**
 * 
 * @author Ashish Singh Dev
 * @version 1.0
 * @since Oct 22, 2016
 *
 */
public class FileSelector implements MessageSelector {
	@Override
	public boolean accept(Message<?> message) {
		if (message.getPayload() instanceof File && ((File) message.getPayload()).getName().startsWith("msg")) {
			return false;
		}
		return true;
	}
}
