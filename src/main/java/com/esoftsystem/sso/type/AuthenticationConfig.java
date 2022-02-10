/*
 * @(#)AuthenticationConfig.java
 *
 * Copyright 2022 by esoft systems (tm).
 * All rights reserved.
 */
package com.esoftsystem.sso.type;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Vinh Nguyen
 * @since 1.0.0
 */
public enum AuthenticationConfig {
  @JsonProperty("SSO_DB")
  SSO_DB,
  @JsonProperty("LDAP")
  LDAP;
}
