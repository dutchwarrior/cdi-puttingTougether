package org.speranza.model;

import java.util.Random;
import java.util.logging.Logger;

import javax.enterprise.inject.Alternative;
import javax.inject.Inject;
import javax.interceptor.Interceptors;

import org.speranza.Interfaces.INumberGenerator;
import org.speranza.annotation.ThirteenDigits;
import org.speranza.controller.LoggingInterceptor;

@Alternative
@ThirteenDigits
public class MockGenerator implements INumberGenerator{

	@Inject
	private Logger logger;
	
	@Interceptors(LoggingInterceptor.class)
	public String generateNumber() {
		String mock = "MOCK-" + Math.abs(new Random().nextInt());
		logger.info("Generated Mock : " + mock);
		return mock;
	}

}
