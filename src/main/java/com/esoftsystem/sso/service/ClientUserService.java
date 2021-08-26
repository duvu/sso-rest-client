/*
 * @(#)ClientUserService.java
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
import com.esoftsystem.sso.model.request.UpdateUserRequest;

/**
 * @author Vinh Nguyen
 * @since 1.0.0
 */
public interface ClientUserService {

  /**
   * Current logged-in user create another account.
   *
   * @param tokenType         token type, mostly: 'Bearer'
   * @param accessToken       the access token
   * @param createUserRequest the request data
   * @return the userDto
   */
  UserDto createUser(String tokenType, String accessToken, CreateUserRequest createUserRequest);

  /**
   * Current logged-in user update another account.
   *
   * @param tokenType         token type, mostly: 'Bearer'
   * @param accessToken       the access token
   * @param updateUserRequest the request data
   * @return the userDto
   */
  UserDto updateUser(String tokenType, String accessToken, UpdateUserRequest updateUserRequest);

  /**
   * Current logged-in load her/his user's profile.
   *
   * @param tokenType   token type, mostly: 'Bearer'
   * @param accessToken the access token
   * @return the userDto
   */
  UserDto loadUserProfile(String tokenType, String accessToken);

  /**
   * Current logged-in change her/his password.
   *
   * @param tokenType             token type, mostly: 'Bearer'
   * @param accessToken           the access token
   * @param updatePasswordRequest the request data
   */
  void changeUserPassword(String tokenType, String accessToken, UpdatePasswordRequest updatePasswordRequest);

  /**
   * Request for new forgotPassword token.
   *
   * @param issueResetPasswordTokenRequest the request data
   */
  void issueResetPasswordToken(IssueResetPasswordTokenRequest issueResetPasswordTokenRequest);

  /**
   * Reset user's password.
   *
   * @param resetPasswordToken   reset password token.
   * @param resetPasswordRequest new password request data.
   */
  void resetPassword(String resetPasswordToken, ResetPasswordRequest resetPasswordRequest);
}
