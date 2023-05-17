/*
 * @(#)BaseUserData.java
 *
 * Copyright 2020 by esoft systems (tm).
 * All rights reserved.
 */
package com.esoftsystem.sso.model.request.base;

import java.util.Date;
import java.util.List;

import com.esoftsystem.sso.model.UserGroupDto;
import com.esoftsystem.sso.model.UserTeamDto;
import com.esoftsystem.sso.type.AuthenticationConfig;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @author Vinh Nguyen
 * @since 1.1.0
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class BaseUserData extends BaseUserProfileData {

  @JsonProperty(value = "username", required = true)
  private String username;
  @JsonProperty(value = "resourceName")
  private String resourceName;
  @JsonProperty(value = "companyCode")
  private String companyCode;
  @JsonProperty(value = "email", required = true)
  private String email;

  @JsonProperty(value = "teams")
  private List<UserTeamDto> teams;
  @JsonProperty(value = "groups")
  private List<UserGroupDto> groups;

  @JsonProperty(value = "userStatus")
  private String userStatus;
  @JsonProperty("fullTimeEmployee")
  private Boolean fullTimeEmployee;
  @JsonProperty("fullTimeResource")
  private String fullTimeResource;
  @JsonProperty(value = "authenticationConfig")
  private AuthenticationConfig authenticationConfig;

  /**
   * Instantiates a new Base user data.
   *
   * @param title                the title
   * @param firstName            the first name
   * @param middleName           the middle name
   * @param lastName             the last name
   * @param dateOfBirth          the date of birth
   * @param avatarUrl            the avatar url
   * @param skypeId              the skype id
   * @param countryCode          the country code
   * @param locationCode         the location code
   * @param phone                the phone
   * @param username             the username
   * @param resourceName         the resource name
   * @param companyCode          the company code
   * @param email                the email
   * @param teams                the teams
   * @param groups               the groups
   * @param userStatus           the user status
   * @param fullTimeEmployee     true if user is esoft's full time employee
   * @param authenticationConfig the authentication config
   */
  public BaseUserData(String title, String firstName, String middleName, String lastName, Date dateOfBirth, String avatarUrl,
                      String skypeId, String countryCode, String locationCode, String phone, String username, String resourceName,
                      String companyCode, String email, List<UserTeamDto> teams,
                      List<UserGroupDto> groups, String userStatus, Boolean fullTimeEmployee, AuthenticationConfig authenticationConfig) {
    super(title, firstName, middleName, lastName, dateOfBirth, avatarUrl, skypeId, countryCode, locationCode, phone);
    this.username = username;
    this.resourceName = resourceName;
    this.companyCode = companyCode;
    this.email = email;
    this.teams = teams;
    this.groups = groups;
    this.userStatus = userStatus;
    this.fullTimeEmployee = fullTimeEmployee;
    this.authenticationConfig = authenticationConfig;
  }
}
