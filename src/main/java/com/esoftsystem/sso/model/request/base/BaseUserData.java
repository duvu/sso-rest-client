/*
 * @(#)BaseUserData.java
 *
 * Copyright 2020 by esoft systems (tm).
 * All rights reserved.
 */
package com.esoftsystem.sso.model.request.base;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.esoftsystem.sso.model.UserGroupDto;
import com.esoftsystem.sso.model.UserTeamDto;
import com.esoftsystem.sso.type.AuthenticationConfig;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Vinh Nguyen
 * @since 1.1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class BaseUserData implements Serializable {

  @JsonProperty(value = "username", required = true)
  private String username;
  @JsonProperty(value = "resourceName")
  private String resourceName;

  @JsonProperty("title")
  private String title;
  @JsonProperty("firstName")
  private String firstName;
  @JsonProperty("middleName")
  private String middleName;
  @JsonProperty("lastName")
  private String lastName;
  @JsonFormat(pattern = "yyyy-MM-dd")
  @JsonProperty("dateOfBirth")
  private Date dateOfBirth;
  @JsonProperty("avatarUrl")
  private String avatarUrl;
  @JsonProperty(value = "skypeId")
  private String skypeId;
  @JsonProperty(value = "companyCode")
  private String companyCode;
  @JsonProperty(value = "countryCode")
  private String countryCode;
  @JsonProperty(value = "locationCode")
  private String locationCode;
  @JsonProperty(value = "phone")
  private String phone;

  @Deprecated
  @JsonProperty(value = "teamCode")
  private String teamCode;
  @JsonProperty(value = "teams")
  private List<UserTeamDto> teams;
  @JsonProperty(value = "groups")
  private List<UserGroupDto> groups;

  @JsonProperty(value = "userStatus")
  private String userStatus;
  @JsonProperty(value = "authenticationConfig")
  private AuthenticationConfig authenticationConfig;
}
