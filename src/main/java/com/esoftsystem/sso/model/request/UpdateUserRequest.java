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
 * @author Vinh Nguyen
 * @since 1.0
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateUserRequest extends BaseUserData {

  private static final long serialVersionUID = 2113745427088860690L;

  /**
   * All Args Constructor.
   *
   * @param title                user's title
   * @param firstName            user's first name
   * @param middleName           user's middle name
   * @param lastName             user's last name
   * @param dateOfBirth          user's date of birth
   * @param avatarUrl            user's avatar
   * @param skypeId              user's skypeId
   * @param countryCode          user's country code
   * @param locationCode         user's location code
   * @param phone                user's phone number
   * @param username             the username
   * @param resourceName         the resourceName
   * @param teamCode             user's team code
   * @param companyCode          user's company code
   * @param groups               user's groups
   * @param userStatus           user's status
   * @param authenticationConfig which authentication will be applied for this user
   */
  //CHECKSTYLE.OFF: ParameterNumber
  @Builder
  public UpdateUserRequest(String username, String resourceName, String title, String firstName, String middleName, String lastName,
                           Date dateOfBirth, String avatarUrl, String skypeId, String companyCode, String countryCode, String locationCode,
                           String phone, String teamCode, List<UserTeamDto> teams, List<UserGroupDto> groups, String userStatus,
                           AuthenticationConfig authenticationConfig) {
    super(username, resourceName, title, firstName, middleName, lastName, dateOfBirth, avatarUrl, skypeId, companyCode, countryCode, locationCode,
          phone, teamCode, teams, groups, userStatus, authenticationConfig);
  }
  //CHECKSTYLE.ON: ParameterNumber
}
