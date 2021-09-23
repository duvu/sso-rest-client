/*
 * @(#)BaseSingleSigonClientService.java
 *
 * Copyright 2021 by esoft systems (tm).
 * All rights reserved.
 */
package com.esoftsystem.sso.service.impl.base;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

/**
 * @author Vinh Nguyen
 * @since 1.0.0
 */
public class BaseSingleSignOnClientService {

  private static final String SPACE = " ";

  /**
   * Make SSO Request entity with Authorization header.
   *
   * @param tokenType     Bearer
   * @param token         the token
   * @param requestObject the request object
   * @return the request entity
   */
  protected HttpEntity<Object> getAuthenticatedRequestEntity(String tokenType, String token, Object requestObject) {
    return getAuthenticatedRequestEntity(tokenType + SPACE + token, requestObject);
  }

  /**
   * Make SSO Request entity with Authorization header.
   *
   * @param authenticationHeader the authentication header.
   * @param requestObject        the request object
   * @return the request entity
   */
  protected HttpEntity<Object> getAuthenticatedRequestEntity(String authenticationHeader, Object requestObject) {
    HttpHeaders headers = new HttpHeaders();
    headers.set(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE);
    headers.set(HttpHeaders.AUTHORIZATION, authenticationHeader);
    return new HttpEntity<>(requestObject, headers);
  }

  /**
   * Get parameterized response type for list.
   *
   * @param <T> the class response type
   * @return the ParameterizedTypeReference list
   */
  protected <T> ParameterizedTypeReference<List<T>> getListParameterizedResponseType() {
    return new ParameterizedTypeReference<>() {
    };
  }
}
