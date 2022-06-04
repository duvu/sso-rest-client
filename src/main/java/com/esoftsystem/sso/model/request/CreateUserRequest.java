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

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Vinh Nguyen
 * @since 1.0
 */
@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateUserRequest extends BaseUserData {

  private static final long serialVersionUID = 3276294320221480523L;

  @JsonProperty(value = "email", required = true)
  private String email;
  @JsonProperty(value = "password", required = true)
  private String password;
  @JsonProperty(value = "confirmedPassword", required = true)
  private String confirmedPassword;

  /**
   * All Args Constructor.
   *
   * @param username             the username
   * @param email                user's email
   * @param resourceName         the resourceName
   * @param title                user's title
   * @param firstName            user's first name
   * @param middleName           user's middle name
   * @param lastName             user's last name
   * @param dateOfBirth          user's date of birth
   * @param password             user's password
   * @param confirmedPassword    user's confirmed password
   * @param avatarUrl            user's avatar
   * @param skypeId              user's skypeId
   * @param countryCode          user's country code
   * @param locationCode         user's location code
   * @param phone                user's phone number
   * @param groups               groups to be belonged to
   * @param userStatus           user's status
   * @param companyCode          user's company code
   * @param teams                teams to be belonged to
   * @param authenticationConfig which authentication will be applied for this user
   */
  //CHECKSTYLE.OFF: ParameterNumber
  @Builder
  public CreateUserRequest(String username, String resourceName, String title, String firstName, String middleName, String lastName,
                           Date dateOfBirth, String avatarUrl, String skypeId, String companyCode, String countryCode, String locationCode,
                           String phone, String teamCode, List<UserTeamDto> teams, List<UserGroupDto> groups, String userStatus,
                           AuthenticationConfig authenticationConfig, String email, String password, String confirmedPassword) {
    super(username, resourceName, title, firstName, middleName, lastName, dateOfBirth, avatarUrl, skypeId, companyCode, countryCode, locationCode,
          phone, teamCode, teams, groups, userStatus, authenticationConfig);
    this.email = email;
    this.password = password;
    this.confirmedPassword = confirmedPassword;
  }
  //CHECKSTYLE.ON: ParameterNumber
}
