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

  private static final long serialVersionUID = 1596944316135656526L;
  @JsonProperty(value = "groups")
  private List<UserGroupDto> groups;
  @JsonProperty(value = "userStatus")
  private String userStatus;
  @JsonProperty(value = "companyCode")
  private String companyCode;
  @JsonProperty(value = "teamCode")
  private String teamCode;

  /**
   * All Args Constructor.
   *
   * @param username          the username
   * @param resourceName      the resourceName
   * @param title             user's title
   * @param firstName         user's first name
   * @param middleName        user's middle name
   * @param lastName          user's last name
   * @param dateOfBirth       user's date of birth
   * @param password          user's password
   * @param confirmedPassword user's confirmed password
   * @param avatarUrl         user's avatar
   * @param skypeId           user's skypeId
   * @param countryCode       user's country code
   * @param phone             user's phone number
   * @param teamCode          user's team code
   * @param companyCode       user's company code
   * @param groups            user's groups
   * @param userStatus        user's status
   */
  //CHECKSTYLE.OFF: ParameterNumber
  @Builder
  public CreateUserRequest(String username, String resourceName, String title, String middleName, String firstName, String lastName, Date dateOfBirth,
                           String password, String confirmedPassword, String avatarUrl, String skypeId, String countryCode, String phone,
                           List<UserGroupDto> groups, String userStatus, String companyCode, String teamCode) {
    super(username, resourceName, title, firstName, middleName, lastName, dateOfBirth, password, confirmedPassword, avatarUrl, skypeId, countryCode,
          phone);
    this.groups = groups;
    this.userStatus = userStatus;
    this.companyCode = companyCode;
    this.teamCode = teamCode;
  }
  //CHECKSTYLE.ON: ParameterNumber
}
