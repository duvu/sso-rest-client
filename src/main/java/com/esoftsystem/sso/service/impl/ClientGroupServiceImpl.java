/*
 * @(#)ClientGroupServiceImpl.java
 *
 * Copyright 2021 by esoft systems (tm).
 * All rights reserved.
 */
package com.esoftsystem.sso.service.impl;

import java.util.List;

import com.esoftsystem.sso.model.GroupDto;
import com.esoftsystem.sso.service.ClientGroupService;
import com.esoftsystem.sso.service.impl.base.BaseSingleSignOnClientService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

/**
 * @author Thanh Pham
 * @since 1.0.0
 */
@Service
public class ClientGroupServiceImpl extends BaseSingleSignOnClientService implements ClientGroupService {

  private static final String GROUPS_FILTER_ENDPOINT = "groups/filters/roles";
  private static final String ROLE_NAME_REQUEST_PARAM = "roleName";

  @Value("${single.sign.on.service.base.url}")
  private String ssoServiceUrl;

  private final RestTemplate restTemplate;

  /**
   * Bean constructor.
   *
   * @param restTemplate the restTemplate
   */
  public ClientGroupServiceImpl(@Qualifier("singleSignOnClientRestTemplate") RestTemplate restTemplate) {
    this.restTemplate = restTemplate;
  }

  @Override
  public List<GroupDto> loadAllGroupsContainRole(String tokenType, String accessToken, String roleName) {
    UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(ssoServiceUrl + GROUPS_FILTER_ENDPOINT)
                                                       .queryParam(ROLE_NAME_REQUEST_PARAM, roleName);
    HttpEntity<Object> requestEntity = getAuthenticatedRequestEntity(tokenType, accessToken, null);
    ParameterizedTypeReference<List<GroupDto>> listResponseType = getListParameterizedResponseType();
    return restTemplate.exchange(builder.toUriString(), HttpMethod.GET, requestEntity, listResponseType).getBody();
  }

}
