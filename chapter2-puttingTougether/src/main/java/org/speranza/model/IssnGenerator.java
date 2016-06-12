package org.speranza.model;

import java.util.Random;
import java.util.logging.Logger;

import javax.inject.Inject;
import javax.interceptor.Interceptors;

import org.speranza.Interfaces.INumberGenerator;
import org.speranza.annotation.Loggable;
import org.speranza.annotation.ThirteenDigits;
import org.speranza.controller.LoggingInterceptor;

@ThirteenDigits
public class IssnGenerator implements INumberGenerator{

	@Inject
	private Logger logger;
	
	@Interceptors(LoggingInterceptor.class)
	public String generateNumber() {
		logger.info("issn generate");
		return "13-" + new Random().nextInt();
	}

}
