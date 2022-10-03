/*
 * @(#)UpdateUserRequest.java
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

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * The type Update user profile request.
 *
 * @author Vinh Nguyen
 * @since 1.0
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateUserRequest extends BaseUserData {

  private static final long serialVersionUID = -3810975507942930879L;

  /**
   * Instantiates a new Update user request.
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
  @Builder
  public UpdateUserRequest(String title, String firstName, String middleName, String lastName, Date dateOfBirth, String avatarUrl, String skypeId,
                           String countryCode, String locationCode, String phone, String username, String resourceName, String companyCode,
                           String email, List<UserTeamDto> teams, List<UserGroupDto> groups, String userStatus, Boolean fullTimeEmployee,
                           AuthenticationConfig authenticationConfig) {

    super(title, firstName, middleName, lastName, dateOfBirth, avatarUrl, skypeId, countryCode, locationCode, phone, username, resourceName,
          companyCode, email, teams, groups, userStatus, fullTimeEmployee, authenticationConfig);
  }
}
