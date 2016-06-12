package org.speranza.producer;

import java.util.logging.Logger;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

public class LoggingProducer {

	@Produces
	public Logger getLogger(InjectionPoint ip) {
		return Logger.getLogger(ip.getMember().getDeclaringClass().getName());
	}
}
