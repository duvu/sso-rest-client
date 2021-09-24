/*
 * @(#)ClientCompanyServiceImpl.java
 *
 * Copyright 2021 by esoft systems (tm).
 * All rights reserved.
 */
package com.esoftsystem.sso.service.impl;

import java.util.List;

import com.esoftsystem.sso.model.CompanyDto;
import com.esoftsystem.sso.service.ClientCompanyService;
import com.esoftsystem.sso.service.impl.base.BaseSingleSignOnClientService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author Thanh Pham
 * @since 1.0.0
 */
@Service
public class ClientCompanyServiceImpl extends BaseSingleSignOnClientService implements ClientCompanyService {

  private static final String LOAD_COMPANIES_ENDPOINT = "companies";

  @Value("${single.sign.on.service.base.url}")
  private String ssoServiceUrl;

  private final RestTemplate restTemplate;

  /**
   * Bean constructor.
   *
   * @param restTemplate the restTemplate
   */
  public ClientCompanyServiceImpl(@Qualifier("singleSignOnClientRestTemplate") RestTemplate restTemplate) {
    this.restTemplate = restTemplate;
  }

  @Override
  public List<CompanyDto> loadAllAvailableCompanies(String tokenType, String accessToken) {
    HttpEntity<Object> requestEntity = getAuthenticatedRequestEntity(tokenType, accessToken, null);
    ParameterizedTypeReference<List<CompanyDto>> listResponseType = getListParameterizedResponseType();
    return restTemplate.exchange(ssoServiceUrl + LOAD_COMPANIES_ENDPOINT, HttpMethod.GET, requestEntity, listResponseType).getBody();
  }
}
