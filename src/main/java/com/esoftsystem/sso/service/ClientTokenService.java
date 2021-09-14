/*
 * @(#)ClientTokenService.java
 *
 * Copyright 2021 by esoft systems (tm).
 * All rights reserved.
 */
package com.esoftsystem.sso.service;

import com.esoftsystem.sso.model.response.TokenStatusResponse;

/**
 * @author Thanh Pham
 * @since 1.0.0
 */
public interface ClientTokenService {

  /**
   * Validate resetPasswordTokenString, and return its status.
   *
   * @param tokenString token string
   * @return the token status
   */
  TokenStatusResponse validateResetPasswordToken(String tokenString);

}
