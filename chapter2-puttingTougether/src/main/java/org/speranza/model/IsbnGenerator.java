package org.speranza.model;

import java.util.Random;
import java.util.logging.Logger;

import javax.inject.Inject;
import javax.interceptor.Interceptors;

import org.speranza.Interfaces.INumberGenerator;
import org.speranza.annotation.EightDigits;
import org.speranza.controller.LoggingInterceptor;

@EightDigits
public class IsbnGenerator implements INumberGenerator{

	@Inject
	private Logger logger;
	
	@Interceptors(LoggingInterceptor.class)
	public String generateNumber() {
		logger.info("isbn generate");
		return "8-" + new Random().nextInt();
	}

}
