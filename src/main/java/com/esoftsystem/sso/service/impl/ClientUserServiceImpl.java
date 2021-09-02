/*
 * @(#)ClientUserServiceImpl.java
 *
 * Copyright 2021 by esoft systems (tm).
 * All rights reserved.
 */
package com.esoftsystem.sso.service.impl;

import com.esoftsystem.sso.model.UserDto;
import com.esoftsystem.sso.model.request.CreateUserRequest;
import com.esoftsystem.sso.model.request.IssueResetPasswordTokenRequest;
import com.esoftsystem.sso.model.request.ResetPasswordRequest;
import com.esoftsystem.sso.model.request.UpdatePasswordRequest;
import com.esoftsystem.sso.model.request.UpdateUserProfileRequest;
import com.esoftsystem.sso.model.request.UpdateUserRequest;
import com.esoftsystem.sso.service.ClientUserService;
import com.esoftsystem.sso.service.impl.base.BaseSingleSignOnClientService;
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
@Service
public class ClientUserServiceImpl extends BaseSingleSignOnClientService implements ClientUserService {

  private static final String USER_ENDPOINT = "users";
  private static final String USER_PASSWORD_ENDPOINT = "users/passwords";
  private static final String ISSUE_RESET_PASSWORD_TOKEN_ENDPOINT = "users/passwords/reset";
  private static final String RESET_PASSWORD_WITH_TOKEN_ENDPOINT = "users/passwords/reset/";
  private static final String LOAD_USER_PROFILE_ENDPOINT = "users/profile";

  @Value("${single.sign.on.service.base.url}")
  private String ssoServiceUrl;
  private final RestTemplate restTemplate;

  /**
   * Bean constructor.
   *
   * @param restTemplate the restTemplate
   */
  public ClientUserServiceImpl(@Qualifier("singleSignOnClientRestTemplate") RestTemplate restTemplate) {
    this.restTemplate = restTemplate;
  }

  @Override
  public UserDto createUser(String tokenType, String accessToken, CreateUserRequest createUserRequest) {
    HttpEntity<Object> requestEntity = getAuthenticatedRequestEntity(tokenType, accessToken, createUserRequest);
    return restTemplate.exchange(ssoServiceUrl + USER_ENDPOINT, HttpMethod.POST, requestEntity, UserDto.class).getBody();
  }

  @Override
  public UserDto updateUser(String tokenType, String accessToken, UpdateUserRequest updateUserRequest) {
    HttpEntity<Object> requestEntity = getAuthenticatedRequestEntity(tokenType, accessToken, updateUserRequest);
    return restTemplate.exchange(ssoServiceUrl + USER_ENDPOINT, HttpMethod.PUT, requestEntity, UserDto.class).getBody();
  }

  @Override
  public UserDto loadUserProfile(String tokenType, String accessToken) {
    HttpEntity<Object> requestEntity = getAuthenticatedRequestEntity(tokenType, accessToken, null);
    return restTemplate.exchange(ssoServiceUrl + LOAD_USER_PROFILE_ENDPOINT, HttpMethod.GET, requestEntity, UserDto.class).getBody();
  }

  @Override
  public void changeUserPassword(String tokenType, String accessToken, UpdatePasswordRequest updatePasswordRequest) {
    HttpEntity<Object> requestEntity = getAuthenticatedRequestEntity(tokenType, accessToken, updatePasswordRequest);
    restTemplate.exchange(ssoServiceUrl + USER_PASSWORD_ENDPOINT, HttpMethod.PUT, requestEntity, Void.class);
  }

  @Override
  public void issueResetPasswordToken(IssueResetPasswordTokenRequest issueResetPasswordTokenRequest) {
    restTemplate.postForObject(ssoServiceUrl + ISSUE_RESET_PASSWORD_TOKEN_ENDPOINT, issueResetPasswordTokenRequest, Void.class);
  }

  @Override
  public void resetPassword(String resetPasswordToken, ResetPasswordRequest resetPasswordRequest) {
    restTemplate.put(ssoServiceUrl + RESET_PASSWORD_WITH_TOKEN_ENDPOINT + resetPasswordToken, resetPasswordRequest);
  }

  @Override
  public UserDto updateUserProfile(String tokenType, String accessToken, UpdateUserProfileRequest updateUserProfileRequest) {
    HttpEntity<Object> requestEntity = getAuthenticatedRequestEntity(tokenType, accessToken, updateUserProfileRequest);
    return restTemplate.exchange(ssoServiceUrl + LOAD_USER_PROFILE_ENDPOINT, HttpMethod.PUT, requestEntity, UserDto.class).getBody();
  }
}
