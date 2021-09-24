/*
 * @(#)ClientUserServiceImplTest.java
 *
 * Copyright 2021 by esoft systems (tm).
 * All rights reserved.
 */
package com.esoftsystem.sso.service;

import com.esoftsystem.sso.model.UserDto;
import com.esoftsystem.sso.model.request.CreateUserRequest;
import com.esoftsystem.sso.model.request.IssueResetPasswordTokenRequest;
import com.esoftsystem.sso.model.request.ResetPasswordRequest;
import com.esoftsystem.sso.model.request.UpdatePasswordRequest;
import com.esoftsystem.sso.model.request.UpdateUserProfileRequest;
import com.esoftsystem.sso.model.request.UpdateUserRequest;
import com.esoftsystem.sso.service.base.BaseServiceImplTest;
import com.esoftsystem.sso.service.impl.ClientUserServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
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
public class ClientUserServiceImplTest extends BaseServiceImplTest {

  private static final String USER_ENDPOINT = "users";
  private static final String USER_PASSWORD_ENDPOINT = "users/passwords";
  private static final String ISSUE_RESET_PASSWORD_TOKEN_ENDPOINT = "users/passwords/reset";
  private static final String RESET_PASSWORD_WITH_TOKEN_ENDPOINT = "users/passwords/reset/";
  private static final String LOAD_USER_PROFILE_ENDPOINT = "users/profile";

  private static final String RESET_PASSWORD_TOKEN = "q2osVyn7409Wk82IjBBDAECkPRbcFLDtlyiRF6dh";

  @Mock
  private UserDto userDto;
  @Mock
  private ResponseEntity responseEntity;
  @Mock
  private UpdateUserProfileRequest updateUserProfileRequest;
  @Captor
  private ArgumentCaptor<HttpEntity<Object>> httpEntityCaptor;

  @InjectMocks
  private ClientUserServiceImpl clientUserService;

  @Before
  public void setup() {
    ReflectionTestUtils.setField(clientUserService, "ssoServiceUrl", SSO_API_BASE_URL);
  }

  @Test
  public void testCreateUser() {
    CreateUserRequest createUserRequest = mock(CreateUserRequest.class);
    when(responseEntity.getBody()).thenReturn(userDto);
    when(restTemplate.exchange(eq(SSO_API_BASE_URL + USER_ENDPOINT), eq(HttpMethod.POST), any(HttpEntity.class), eq(UserDto.class)))
      .thenReturn(responseEntity);

    UserDto userProfile = clientUserService.createUser(TOKEN_TYPE, ACCESS_TOKEN, createUserRequest);
    verify(restTemplate).exchange(eq(SSO_API_BASE_URL + USER_ENDPOINT), eq(HttpMethod.POST), httpEntityCaptor.capture(), eq(UserDto.class));
    HttpEntity<Object> value = httpEntityCaptor.getValue();
    Assert.assertEquals(userDto, userProfile);
    Assert.assertEquals(AUTHORIZATION_HEADER, value.getHeaders().get(HttpHeaders.AUTHORIZATION).get(0));
  }

  @Test
  public void testUpdateUser() {
    UpdateUserRequest updateUserRequest = mock(UpdateUserRequest.class);
    when(responseEntity.getBody()).thenReturn(userDto);
    when(restTemplate.exchange(eq(SSO_API_BASE_URL + USER_ENDPOINT), eq(HttpMethod.PUT), any(HttpEntity.class), eq(UserDto.class)))
      .thenReturn(responseEntity);

    UserDto userProfile = clientUserService.updateUser(TOKEN_TYPE, ACCESS_TOKEN, updateUserRequest);
    verify(restTemplate).exchange(eq(SSO_API_BASE_URL + USER_ENDPOINT), eq(HttpMethod.PUT), httpEntityCaptor.capture(), eq(UserDto.class));
    HttpEntity<Object> value = httpEntityCaptor.getValue();
    Assert.assertEquals(userDto, userProfile);
    Assert.assertEquals(AUTHORIZATION_HEADER, value.getHeaders().get(HttpHeaders.AUTHORIZATION).get(0));
  }

  @Test
  public void testLoadUserProfile() {
    when(responseEntity.getBody()).thenReturn(userDto);
    when(restTemplate.exchange(eq(SSO_API_BASE_URL + LOAD_USER_PROFILE_ENDPOINT), eq(HttpMethod.GET), any(HttpEntity.class), eq(UserDto.class)))
      .thenReturn(responseEntity);

    UserDto userProfile = clientUserService.loadUserProfile(TOKEN_TYPE, ACCESS_TOKEN);
    verify(restTemplate).exchange(eq(SSO_API_BASE_URL + LOAD_USER_PROFILE_ENDPOINT), eq(HttpMethod.GET), httpEntityCaptor.capture(),
                                  eq(UserDto.class));
    HttpEntity<Object> value = httpEntityCaptor.getValue();
    Assert.assertEquals(userDto, userProfile);
    Assert.assertEquals(AUTHORIZATION_HEADER, value.getHeaders().get(HttpHeaders.AUTHORIZATION).get(0));
  }

  @Test
  public void testChangeUserPassword() {
    UpdatePasswordRequest updatePasswordRequest = mock(UpdatePasswordRequest.class);
    clientUserService.changeUserPassword(TOKEN_TYPE, ACCESS_TOKEN, updatePasswordRequest);
    verify(restTemplate).exchange(eq(SSO_API_BASE_URL + USER_PASSWORD_ENDPOINT), eq(HttpMethod.PUT), httpEntityCaptor.capture(), eq(Void.class));
    HttpEntity<Object> value = httpEntityCaptor.getValue();
    Assert.assertEquals(updatePasswordRequest, value.getBody());
    Assert.assertEquals(AUTHORIZATION_HEADER, value.getHeaders().get(HttpHeaders.AUTHORIZATION).get(0));
  }

  @Test
  public void testIssueResetPasswordToken() {
    IssueResetPasswordTokenRequest passwordTokenRequest = mock(IssueResetPasswordTokenRequest.class);
    clientUserService.issueResetPasswordToken(passwordTokenRequest);
    verify(restTemplate).postForObject(eq(SSO_API_BASE_URL + ISSUE_RESET_PASSWORD_TOKEN_ENDPOINT), eq(passwordTokenRequest), eq(Void.class));
  }

  @Test
  public void testResetPassword() {
    ResetPasswordRequest resetPasswordRequest = mock(ResetPasswordRequest.class);
    clientUserService.resetPassword(RESET_PASSWORD_TOKEN, resetPasswordRequest);
    verify(restTemplate).put(eq(SSO_API_BASE_URL + RESET_PASSWORD_WITH_TOKEN_ENDPOINT + RESET_PASSWORD_TOKEN), eq(resetPasswordRequest));
  }

  @Test
  public void testUpdateUserProfile() {

    when(responseEntity.getBody()).thenReturn(userDto);
    when(restTemplate.exchange(eq(SSO_API_BASE_URL + LOAD_USER_PROFILE_ENDPOINT), eq(HttpMethod.PUT), httpEntityCaptor.capture(), eq(UserDto.class)))
      .thenReturn(responseEntity);

    clientUserService.updateUserProfile(TOKEN_TYPE, ACCESS_TOKEN, updateUserProfileRequest);
    verify(restTemplate).exchange(eq(SSO_API_BASE_URL + LOAD_USER_PROFILE_ENDPOINT), eq(HttpMethod.PUT), httpEntityCaptor.capture(),
                                  eq(UserDto.class));
    HttpEntity<Object> value = httpEntityCaptor.getValue();
    Assert.assertEquals(updateUserProfileRequest, value.getBody());
    Assert.assertEquals(AUTHORIZATION_HEADER, value.getHeaders().get(HttpHeaders.AUTHORIZATION).get(0));
  }
}
