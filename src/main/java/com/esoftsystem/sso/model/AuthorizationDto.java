/*
 * @(#)UserTokenDto.java
 *
 * Copyright 2021 by esoft systems (tm).
 * All rights reserved.
 */
package com.esoftsystem.sso.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;
import java.util.List;
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
public class AuthorizationDto {

  @JsonProperty("userId")
  private Long userId;
  @JsonProperty("tokenType")
  private String tokenType;
  @JsonProperty("accessToken")
  private String accessToken;
  @JsonProperty("refreshToken")
  private String refreshToken;
  @JsonProperty("username")
  private String username;
  @JsonProperty("title")
  private String title;
  @JsonProperty("firstName")
  private String firstName;
  @JsonProperty("lastName")
  private String lastName;
  @JsonProperty("avatarUrl")
  private String avatarUrl;
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
  @JsonProperty("issuedAt")
  private Date issuedAt;
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
  @JsonProperty("accessTokenExpiresAt")
  private Date accessTokenExpiresAt;
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
  @JsonProperty("refreshTokenExpiresAt")
  private Date refreshTokenExpiresAt;
  @JsonProperty("status")
  private String status;
  @JsonProperty("enabled")
  private Boolean enabled;
  @JsonProperty("roles")
  private List<String> roles;
}