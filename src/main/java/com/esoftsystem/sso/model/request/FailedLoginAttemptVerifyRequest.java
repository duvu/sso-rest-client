/*
 * @(#)FailedLoginAttemptVerifyRequest.java
 *
 * Copyright 2021 by esoft systems (tm).
 * All rights reserved.
 */
package com.esoftsystem.sso.model.request;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Thanh Pham
 * @since 1.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class FailedLoginAttemptVerifyRequest implements Serializable {

  private static final long serialVersionUID = 4868013356729260390L;

  @JsonProperty(value = "userName", required = true)
  private String username;
  @JsonProperty("userIpAddress")
  private String userIpAddress;
}
