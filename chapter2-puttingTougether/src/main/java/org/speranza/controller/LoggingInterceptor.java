package org.speranza.controller;

import java.util.logging.Logger;

import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

public class LoggingInterceptor {

	@Inject
	private Logger logger;
	
	@AroundInvoke
	public Object logMethod(InvocationContext ic) {
		logger.entering(ic.getTarget().getClass().getName(), ic.getMethod().getName());
		try {
			return ic.proceed();
		} catch (Exception e) {
		} finally {
			logger.exiting(ic.getTarget().getClass().getName(), ic.getMethod().getName());
		}
		return null;
	}
}
