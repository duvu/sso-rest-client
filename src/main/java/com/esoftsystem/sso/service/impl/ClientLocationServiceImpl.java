/*
 * @(#)ClientLocationServiceImpl.java
 *
 * Copyright 2021 by esoft systems (tm).
 * All rights reserved.
 */
package com.esoftsystem.sso.service.impl;

import java.util.List;

import com.esoftsystem.sso.model.LocationDto;
import com.esoftsystem.sso.service.ClientLocationService;
import com.esoftsystem.sso.service.impl.base.BaseSingleSignOnClientService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;

/**
 * @author Thanh Pham
 * @since 1.0.0
 */
public class ClientLocationServiceImpl extends BaseSingleSignOnClientService implements ClientLocationService {

  private static final String LOAD_LOCATIONS_ENDPOINT = "locations";

  @Value("${single.sign.on.service.base.url}")
  private String ssoServiceUrl;

  private final RestTemplate restTemplate;

  /**
   * Bean constructor.
   *
   * @param restTemplate the restTemplate
   */
  public ClientLocationServiceImpl(@Qualifier("singleSignOnClientRestTemplate") RestTemplate restTemplate) {
    this.restTemplate = restTemplate;
  }

  @Override
  public List<LocationDto> loadAllAvailableLocations(String tokenType, String accessToken) {
    HttpEntity<Object> requestEntity = getAuthenticatedRequestEntity(tokenType, accessToken, null);
    ParameterizedTypeReference<List<LocationDto>> listResponseType = getListParameterizedResponseType();
    return restTemplate.exchange(ssoServiceUrl + LOAD_LOCATIONS_ENDPOINT, HttpMethod.GET, requestEntity, listResponseType).getBody();
  }
}
