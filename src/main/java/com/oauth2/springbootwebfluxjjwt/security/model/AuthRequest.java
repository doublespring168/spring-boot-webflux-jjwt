package com.oauth2.springbootwebfluxjjwt.security.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 *
 * @author abc
 */
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class  AuthRequest {
	
	private String username;
	
	private String password;

}
