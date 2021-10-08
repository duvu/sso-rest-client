/*
 * @(#)BaseServiceImplTest.java
 *
 * Copyright 2021 by esoft systems (tm).
 * All rights reserved.
 */
package com.esoftsystem.sso.service.base;

import org.mockito.Mock;
import org.springframework.web.client.RestTemplate;

/**
 * @author Thanh Pham
 * @since 1.0.0
 */
public abstract class BaseServiceImplTest {

  protected static final String SSO_API_BASE_URL = "https://sso.esoft.com/";
  protected static final String ACCESS_TOKEN = "eE0rs6V84okqOPYKfFG9bcgZTDH2OAVchmg1aWYl";
  protected static final String REFRESH_TOKEN = "li61DOeImkIdyic5zpfCehAbjbS6dMpzW1ephJ2p";
  protected static final String TOKEN_TYPE = "Bearer";
  protected static final String AUTHORIZATION_HEADER = TOKEN_TYPE + " " + ACCESS_TOKEN;
  protected static final String USER_NAME = "userName@email.com";

  @Mock
  protected RestTemplate restTemplate;

}
