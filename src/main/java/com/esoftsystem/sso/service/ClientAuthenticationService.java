/*
 * @(#)ClientAuthenticationService.java
 *
 * Copyright 2021 by esoft systems (tm).
 * All rights reserved.
 */
package com.esoftsystem.sso.service;

import com.esoftsystem.sso.model.AuthorizationDto;
import com.esoftsystem.sso.model.request.AuthenticationRequest;

/**
 * @author Vinh Nguyen
 * @since 1.0.0
 */
public interface ClientAuthenticationService {

  /**
   * Authenticate user.
   *
   * @param authenticationRequest request data, username, password, and other information.
   * @return AuthorizationDto data.
   */
  AuthorizationDto authenticate(AuthenticationRequest authenticationRequest);

  /**
   * Refresh user's token.
   *
   * @param tokenType    token type, mostly: 'Bearer'
   * @param refreshToken the refresh token
   * @return AuthorizationDto data.
   */
  AuthorizationDto refreshToken(String tokenType, String refreshToken);

  /**
   * Refresh user's token.
   *
   * @param tokenType   token type, mostly: 'Bearer'
   * @param accessToken the access token
   */
  void logout(String tokenType, String accessToken);

  /**
   * Validate user token.
   *
   * @param tokenType   token type, mostly: 'Bearer'
   * @param accessToken the access token
   * @return AuthorizationDto data.
   */
  AuthorizationDto validateToken(String tokenType, String accessToken);

  /**
   * Validate user token.
   *
   * @param authenticationHeader the authentication header.
   * @return AuthorizationDto data.
   */
  AuthorizationDto validateToken(String authenticationHeader);
}
