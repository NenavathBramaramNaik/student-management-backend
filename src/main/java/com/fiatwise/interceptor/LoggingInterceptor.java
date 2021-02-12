package com.fiatwise.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.HandlerInterceptor;

public class LoggingInterceptor implements HandlerInterceptor {

	private static final Log LOG = LogFactory.getLog(LoggingInterceptor.class);

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception ex) {
		StringBuilder logMessage = new StringBuilder();
		logMessage.append("method: ").append(request.getMethod()).append("\t");
		logMessage.append("uri: ").append(request.getRequestURI()).append("\t");
		logMessage.append("status: ").append(response.getStatus()).append("\t");
		logMessage.append("remoteAddress: ").append(request.getRemoteAddr()).append("\t");

		if (ex != null) {
			LoggingInterceptor.LOG.error(logMessage.toString(), ex);
		} else {
			LoggingInterceptor.LOG.info(logMessage.toString());
		}
	}

}
