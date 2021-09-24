/*
 * @(#)ClientLocationServiceImplTest.java
 *
 * Copyright 2021 by esoft systems (tm).
 * All rights reserved.
 */
package com.esoftsystem.sso.service;

import java.util.List;

import com.esoftsystem.sso.model.LocationDto;
import com.esoftsystem.sso.model.TeamDto;
import com.esoftsystem.sso.service.base.BaseServiceImplTest;
import com.esoftsystem.sso.service.impl.ClientLocationServiceImpl;
import com.esoftsystem.sso.service.impl.ClientTeamServiceImpl;
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
public class ClientLocationServiceImplTest extends BaseServiceImplTest {

  private static final String LOAD_LOCATIONS_ENDPOINT = "locations";

  @Mock
  private ResponseEntity responseEntity;
  @Mock
  private List<LocationDto> locationDtos;
  @Captor
  private ArgumentCaptor<HttpEntity<Object>> httpEntityCaptor;

  @InjectMocks
  private ClientLocationServiceImpl clientLocationService;

  @Before
  public void setup() {
    ReflectionTestUtils.setField(clientLocationService, "ssoServiceUrl", SSO_API_BASE_URL);
  }

  @Test
  public void testLoadAllAvailableLocations() {
    when(responseEntity.getBody()).thenReturn(locationDtos);
    when(restTemplate.exchange(eq(SSO_API_BASE_URL + LOAD_LOCATIONS_ENDPOINT), eq(HttpMethod.GET), httpEntityCaptor.capture(),
                               any(ParameterizedTypeReference.class))).thenReturn(responseEntity);

    List<LocationDto> locationDtos = clientLocationService.loadAllAvailableLocations(TOKEN_TYPE, ACCESS_TOKEN);
    Assert.assertEquals(this.locationDtos, locationDtos);
    HttpEntity<Object> value = httpEntityCaptor.getValue();
    Assert.assertEquals(AUTHORIZATION_HEADER, value.getHeaders().get(HttpHeaders.AUTHORIZATION).get(0));
  }
}
