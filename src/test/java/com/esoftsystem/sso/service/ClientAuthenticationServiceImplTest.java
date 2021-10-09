/*
 * @(#)ClientAuthenticationServiceImplTest.java
 *
 * Copyright 2021 by esoft systems (tm).
 * All rights reserved.
 */
package com.esoftsystem.sso.service;

import com.esoftsystem.sso.model.AuthorizationDto;
import com.esoftsystem.sso.model.request.AuthenticationRequest;
import com.esoftsystem.sso.model.request.FailedLoginAttemptVerifyRequest;
import com.esoftsystem.sso.model.response.FailedLoginAttemptVerifyResponse;
import com.esoftsystem.sso.service.base.BaseServiceImplTest;
import com.esoftsystem.sso.service.impl.ClientAuthenticationServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.util.ReflectionTestUtils;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * @author Thanh Pham
 * @since 1.0.0
 */
@RunWith(MockitoJUnitRunner.class)
public class ClientAuthenticationServiceImplTest extends BaseServiceImplTest {

  private static final String AUTHENTICATE_ENDPOINT = "authentication";
  private static final String REFRESH_TOKEN_ENDPOINT = "authentication/tokens/refresh";
  private static final String VALIDATION_TOKEN_ENDPOINT = "authentication/tokens/validation";
  private static final String VERIFY_IF_EXCEED_FAILED_LOGIN_LIMIT_ENDPOINT = "authentication/failed-attempts/verify";

  @Mock
  private AuthorizationDto authorizationDto;

  @Mock
  private ResponseEntity responseEntity;

  @InjectMocks
  private ClientAuthenticationServiceImpl clientAuthenticationService;

  @Before
  public void setup() {
    ReflectionTestUtils.setField(clientAuthenticationService, "ssoServiceUrl", SSO_API_BASE_URL);
  }

  @Test
  public void testAuthenticate() {
    AuthenticationRequest authenticationRequest = mock(AuthenticationRequest.class);
    clientAuthenticationService.authenticate(authenticationRequest);
    verify(restTemplate).postForObject(SSO_API_BASE_URL + AUTHENTICATE_ENDPOINT, authenticationRequest, AuthorizationDto.class);
  }

  @Test
  public void testRefreshToken() {
    when(responseEntity.getBody()).thenReturn(authorizationDto);
    when(restTemplate.exchange(eq(SSO_API_BASE_URL + REFRESH_TOKEN_ENDPOINT), eq(HttpMethod.GET), any(HttpEntity.class), eq(AuthorizationDto.class))).thenReturn(responseEntity);
    clientAuthenticationService.refreshToken(TOKEN_TYPE, REFRESH_TOKEN);
    verify(restTemplate).exchange(eq(SSO_API_BASE_URL + REFRESH_TOKEN_ENDPOINT), eq(HttpMethod.GET), any(HttpEntity.class), eq(AuthorizationDto.class));
  }

  @Test
  public void testLogOut() {
    clientAuthenticationService.logout(TOKEN_TYPE, ACCESS_TOKEN);
    verify(restTemplate).exchange(eq(SSO_API_BASE_URL + AUTHENTICATE_ENDPOINT), eq(HttpMethod.DELETE), any(HttpEntity.class), eq(Void.class));
  }

  @Test
  public void testValidateToken() {
    when(responseEntity.getBody()).thenReturn(authorizationDto);
    when(restTemplate.exchange(eq(SSO_API_BASE_URL + VALIDATION_TOKEN_ENDPOINT), eq(HttpMethod.GET), any(HttpEntity.class), eq(AuthorizationDto.class))).thenReturn(responseEntity);
    clientAuthenticationService.validateToken(TOKEN_TYPE, ACCESS_TOKEN);
    verify(restTemplate).exchange(eq(SSO_API_BASE_URL + VALIDATION_TOKEN_ENDPOINT), eq(HttpMethod.GET), any(HttpEntity.class), eq(AuthorizationDto.class));
  }

  @Test
  public void testValidateAuthenticationHeader() {
    when(responseEntity.getBody()).thenReturn(authorizationDto);
    when(restTemplate.exchange(eq(SSO_API_BASE_URL + VALIDATION_TOKEN_ENDPOINT), eq(HttpMethod.GET), any(HttpEntity.class), eq(AuthorizationDto.class))).thenReturn(responseEntity);
    clientAuthenticationService.validateToken(AUTHORIZATION_HEADER);
    verify(restTemplate).exchange(eq(SSO_API_BASE_URL + VALIDATION_TOKEN_ENDPOINT), eq(HttpMethod.GET), any(HttpEntity.class), eq(AuthorizationDto.class));
  }

  @Test
  public void testVerifyIfExceedFailedLoginAttemptLimit() {
    FailedLoginAttemptVerifyRequest failedLoginAttemptVerifyRequest = mock(FailedLoginAttemptVerifyRequest.class);
    clientAuthenticationService.verifyIfExceedFailedLoginAttemptLimit(failedLoginAttemptVerifyRequest);
    verify(restTemplate).postForObject(SSO_API_BASE_URL + VERIFY_IF_EXCEED_FAILED_LOGIN_LIMIT_ENDPOINT, failedLoginAttemptVerifyRequest,
                                       FailedLoginAttemptVerifyResponse.class);
  }
}
