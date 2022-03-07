/*
 * @(#)UserSummaryDto.java
 *
 * Copyright 2021 by esoft systems (tm).
 * All rights reserved.
 */
package com.esoftsystem.sso.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.esoftsystem.sso.type.AuthenticationConfig;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Vinh Nguyen
 * @since 1.0.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserSummaryDto implements Serializable {

  private static final long serialVersionUID = 3088854471808668803L;
  @JsonProperty("userId")
  private Long userId;
  @JsonProperty("username")
  private String username;
  @JsonProperty("email")
  private String email;
  @JsonProperty("resourceName")
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
  @JsonProperty("status")
  private String status;
  @JsonProperty("enabled")
  private Boolean enabled;
  @JsonProperty(value = "skypeId")
  private String skypeId;
  @JsonProperty(value = "countryCode")
  private String countryCode;
  @JsonProperty(value = "phone")
  private String phone;
  @JsonProperty(value = "team")
  private TeamDto team;
  @JsonProperty(value = "company")
  private CompanyDto company;
  @JsonProperty(value = "location")
  private LocationDto location;
  @JsonProperty(value = "authenticationConfig")
  private AuthenticationConfig authenticationConfig;
  @JsonProperty("groups")
  private List<UserGroupDto> groups;
}
