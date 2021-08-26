/*
 * @(#)ClientAuthenticationServiceImpl.java
 *
 * Copyright 2021 by esoft systems (tm).
 * All rights reserved.
 */
package com.esoftsystem.sso.service.impl;

import com.esoftsystem.sso.model.AuthorizationDto;
import com.esoftsystem.sso.model.request.AuthenticationRequest;
import com.esoftsystem.sso.service.ClientAuthenticationService;
import com.esoftsystem.sso.service.impl.base.BaseSingleSignOnClientService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author Vinh Nguyen
 * @since 1.0.0
 */
@Slf4j
@Service
public class ClientAuthenticationServiceImpl extends BaseSingleSignOnClientService implements ClientAuthenticationService {

  private static final String AUTHENTICATE_ENDPOINT = "authentication";
  private static final String REFRESH_TOKEN_ENDPOINT = "authentication/tokens/refresh";
  private static final String VALIDATION_TOKEN_ENDPOINT = "authentication/tokens/validation";

  @Value("${single.sign.on.service.base.url}")
  private String ssoServiceUrl;
  private final RestTemplate restTemplate;

  /**
   * Bean constructor.
   *
   * @param restTemplate the restTemplate
   */
  public ClientAuthenticationServiceImpl(@Qualifier("singleSignOnClientRestTemplate") RestTemplate restTemplate) {
    this.restTemplate = restTemplate;
  }

  @Override
  public AuthorizationDto authenticate(AuthenticationRequest authenticationRequest) {
    return restTemplate.postForObject(ssoServiceUrl + AUTHENTICATE_ENDPOINT, authenticationRequest, AuthorizationDto.class);
  }

  @Override
  public AuthorizationDto refreshToken(String tokenType, String refreshToken) {
    HttpEntity<Object> requestEntity = getAuthenticatedRequestEntity(tokenType, refreshToken, null);
    return restTemplate.exchange(ssoServiceUrl + REFRESH_TOKEN_ENDPOINT, HttpMethod.GET, requestEntity, AuthorizationDto.class).getBody();
  }

  @Override
  public void logout(String tokenType, String accessToken) {
    HttpEntity<Object> requestEntity = getAuthenticatedRequestEntity(tokenType, accessToken, null);
    restTemplate.exchange(ssoServiceUrl + AUTHENTICATE_ENDPOINT, HttpMethod.DELETE, requestEntity, Void.class);
  }

  @Override
  public AuthorizationDto validateToken(String tokenType, String accessToken) {
    HttpEntity<Object> requestEntity = getAuthenticatedRequestEntity(tokenType, accessToken, null);
    return restTemplate.exchange(ssoServiceUrl + VALIDATION_TOKEN_ENDPOINT, HttpMethod.GET, requestEntity, AuthorizationDto.class).getBody();
  }
}