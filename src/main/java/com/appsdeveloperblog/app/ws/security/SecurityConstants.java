package com.appsdeveloperblog.app.ws.security;

import com.appsdeveloperblog.app.ws.SpringApplicationContext;

public class SecurityConstants {

	// Token validation duration
	public static final long EXPIRATION_TIME = 864000000;
	
	// Will be in the HTTP Headr's requests.
	public static final String TOKEN_PREFIX = "Bearer ";
	public static final String HEADER_STRING = "Authorization";
	
	// The public sign up URL
	public static final String SIGN_UP_URL = "/users";
	
	// Used in the encryption of the Token.
	public static String getTokenSecret() {
		AppProperties appProperties = (AppProperties) SpringApplicationContext.getBean("appProperties");
		return appProperties.getTokenSecret();
	}
}
