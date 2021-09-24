/*
 * @(#)ClientTokenServiceImplTest.java
 *
 * Copyright 2021 by esoft systems (tm).
 * All rights reserved.
 */
package com.esoftsystem.sso.service;

import com.esoftsystem.sso.model.response.TokenStatusResponse;
import com.esoftsystem.sso.service.base.BaseServiceImplTest;
import com.esoftsystem.sso.service.impl.ClientTokenServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.test.util.ReflectionTestUtils;

import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;

/**
 * @author Thanh Pham
 * @since 1.0.0
 */
@RunWith(MockitoJUnitRunner.class)
public class ClientTokenServiceImplTest extends BaseServiceImplTest {

  private static final String RESET_PASSWORD_TOKEN_VALIDATION_ENDPOINT = "tokens/reset-password/validation/{tokenString}";
  private static final String RESET_PASSWORD_TOKEN = "q2osVyn7409Wk82IjBBDAECkPRbcFLDtlyiRF6dh";

  @InjectMocks
  private ClientTokenServiceImpl clientTokenService;

  @Before
  public void setup() {
    ReflectionTestUtils.setField(clientTokenService, "ssoServiceUrl", SSO_API_BASE_URL);
  }

  @Test
  public void testValidateResetPasswordToken() {
    clientTokenService.validateResetPasswordToken(RESET_PASSWORD_TOKEN);
    verify(restTemplate).getForObject(eq(SSO_API_BASE_URL + RESET_PASSWORD_TOKEN_VALIDATION_ENDPOINT), eq(TokenStatusResponse.class),
                                      eq(RESET_PASSWORD_TOKEN));
  }
}
