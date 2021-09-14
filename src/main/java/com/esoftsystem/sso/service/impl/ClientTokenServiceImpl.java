/*
 * @(#)ClientTokenServiceImpl.java
 *
 * Copyright 2021 by esoft systems (tm).
 * All rights reserved.
 */
package com.esoftsystem.sso.service.impl;

import com.esoftsystem.sso.model.response.TokenStatusResponse;
import com.esoftsystem.sso.service.ClientTokenService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author Thanh Pham
 * @since 1.0.0
 */
@Service
public class ClientTokenServiceImpl implements ClientTokenService {

  private static final String RESET_PASSWORD_TOKEN_VALIDATION_ENDPOINT = "tokens/reset-password/validation/{tokenString}";

  @Value("${single.sign.on.service.base.url}")
  private String ssoServiceUrl;

  private final RestTemplate restTemplate;

  /**
   * Bean constructor.
   *
   * @param restTemplate the restTemplate
   */
  public ClientTokenServiceImpl(@Qualifier("singleSignOnClientRestTemplate") RestTemplate restTemplate) {
    this.restTemplate = restTemplate;
  }

  @Override
  public TokenStatusResponse validateResetPasswordToken(String tokenString) {
    return restTemplate.getForObject(ssoServiceUrl + RESET_PASSWORD_TOKEN_VALIDATION_ENDPOINT, TokenStatusResponse.class, tokenString);
  }
}
