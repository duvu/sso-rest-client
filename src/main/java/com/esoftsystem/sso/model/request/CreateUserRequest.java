/*
 * @(#)CreateUserRequest.java
 *
 * Copyright 2021 by esoft systems (tm).
 * All rights reserved.
 */
package com.esoftsystem.sso.model.request;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.esoftsystem.sso.model.UserGroupDto;
import com.esoftsystem.sso.model.request.base.NewUserBaseRequest;
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
public class CreateUserRequest extends NewUserBaseRequest implements Serializable {

  private static final long serialVersionUID = -7320500338791209759L;
  @JsonProperty(value = "groups")
  private List<UserGroupDto> groups;
  @JsonProperty(value = "userStatus")
  private String userStatus;
  @JsonProperty(value = "companyCode")
  private String companyCode;
  @JsonProperty(value = "teamCode")
  private String teamCode;
  @JsonProperty(value = "authenticationConfig")
  private AuthenticationConfig authenticationConfig;

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
   * @param teamCode             user's team code
   * @param companyCode          user's company code
   * @param groups               user's groups
   * @param userStatus           user's status
   * @param authenticationConfig which authentication will be applied for this user
   */
  //CHECKSTYLE.OFF: ParameterNumber
  @Builder
  public CreateUserRequest(String username, String email, String resourceName, String title, String firstName, String middleName,
                           String lastName, Date dateOfBirth, String password, String confirmedPassword, String avatarUrl, String skypeId,
                           String countryCode, String locationCode, String phone, AuthenticationConfig authenticationConfig,
                           List<UserGroupDto> groups, String userStatus, String companyCode, String teamCode) {
    super(username, email, resourceName, title, firstName, middleName, lastName, dateOfBirth, password, confirmedPassword, avatarUrl, skypeId,
          countryCode, locationCode, phone);
    this.groups = groups;
    this.userStatus = userStatus;
    this.companyCode = companyCode;
    this.teamCode = teamCode;
    this.authenticationConfig = authenticationConfig;
  }
  //CHECKSTYLE.ON: ParameterNumber
}
