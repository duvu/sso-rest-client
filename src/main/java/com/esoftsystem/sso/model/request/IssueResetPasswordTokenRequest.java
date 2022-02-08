/*
 * @(#)ResetPasswordRequest.java
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
 * @author Vinh Nguyen
 * @since 1.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class IssueResetPasswordTokenRequest implements Serializable {

  private static final long serialVersionUID = -6434101682226677184L;
  @JsonProperty(value = "username", required = true)
  private String username;
  @JsonProperty(value = "email", required = true)
  private String email;
  @JsonProperty(value = "resetPasswordLandingPagePrefix")
  private String resetPasswordLandingPagePrefix;
}
