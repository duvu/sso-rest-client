/*
 * @(#)CreateUserRequest.java
 *
 * Copyright 2021 by esoft systems (tm).
 * All rights reserved.
 */
package com.esoftsystem.sso.model.request;

import java.util.Date;
import java.util.List;

import com.esoftsystem.sso.model.UserGroupDto;
import com.esoftsystem.sso.model.UserTeamDto;
import com.esoftsystem.sso.model.request.base.BaseUserData;
import com.esoftsystem.sso.type.AuthenticationConfig;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @author Vinh Nguyen
 * @since 1.1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateUserRequest extends BaseUserData {

  private static final long serialVersionUID = -3114553423007443401L;

  @JsonProperty(value = "password", required = true)
  private String password;
  @JsonProperty(value = "confirmedPassword", required = true)
  private String confirmedPassword;

  /**
   * Instantiates a new Create user request.
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
   * @param password             the password
   * @param confirmedPassword    the confirmed password
   */
  @Builder
  public CreateUserRequest(String title, String firstName, String middleName, String lastName, Date dateOfBirth, String avatarUrl, String skypeId,
                           String countryCode, String locationCode, String phone, String username, String resourceName, String companyCode,
                           String email, List<UserTeamDto> teams, List<UserGroupDto> groups, String userStatus, Boolean fullTimeEmployee,
                           AuthenticationConfig authenticationConfig, String password, String confirmedPassword) {

    super(title, firstName, middleName, lastName, dateOfBirth, avatarUrl, skypeId, countryCode, locationCode, phone, username, resourceName,
          companyCode, email, teams, groups, userStatus, fullTimeEmployee, authenticationConfig);

    this.password = password;
    this.confirmedPassword = confirmedPassword;
  }
}
