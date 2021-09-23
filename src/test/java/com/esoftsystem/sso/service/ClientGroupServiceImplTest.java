/*
 * @(#)ClientGroupServiceImplTest.java
 *
 * Copyright 2021 by esoft systems (tm).
 * All rights reserved.
 */
package com.esoftsystem.sso.service;

import java.util.List;

import com.esoftsystem.sso.model.GroupDto;
import com.esoftsystem.sso.model.LocationDto;
import com.esoftsystem.sso.service.base.BaseServiceImplTest;
import com.esoftsystem.sso.service.impl.ClientGroupServiceImpl;
import com.esoftsystem.sso.service.impl.ClientLocationServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.util.ReflectionTestUtils;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;

/**
 * @author Thanh Pham
 * @since 1.0.0
 */
@RunWith(MockitoJUnitRunner.class)
public class ClientGroupServiceImplTest extends BaseServiceImplTest {

  private static final String GROUPS_FILTER_ENDPOINT = "groups/filters/roles";
  private static final String ROLE_NAME_REQUEST = "ROLE_PRODUCTION_JOB_USER";

  @Mock
  private ResponseEntity responseEntity;
  @Mock
  private List<GroupDto> groupDtos;

  @InjectMocks
  private ClientGroupServiceImpl clientGroupService;
  @Captor
  private ArgumentCaptor<HttpEntity<Object>> httpEntityCaptor;

  @Before
  public void setup() {
    ReflectionTestUtils.setField(clientGroupService, "ssoServiceUrl", SSO_API_BASE_URL);
  }

  @Test
  public void testLoadAllGroupsContainRole() {
    when(responseEntity.getBody()).thenReturn(groupDtos);
    when(restTemplate.exchange(eq(SSO_API_BASE_URL + GROUPS_FILTER_ENDPOINT + "?roleName=ROLE_PRODUCTION_JOB_USER"), eq(HttpMethod.GET),
                               httpEntityCaptor.capture(), any(ParameterizedTypeReference.class))).thenReturn(responseEntity);

    List<GroupDto> groupDtos = clientGroupService.loadAllGroupsContainRole(TOKEN_TYPE, ACCESS_TOKEN, ROLE_NAME_REQUEST);
    Assert.assertEquals(this.groupDtos, groupDtos);
    HttpEntity<Object> value = httpEntityCaptor.getValue();
    Assert.assertEquals(AUTHORIZATION_HEADER, value.getHeaders().get(HttpHeaders.AUTHORIZATION).get(0));
  }
}
