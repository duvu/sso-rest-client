/*
 * @(#)UpdateUserRequest.java
 *
 * Copyright 2021 by esoft systems (tm).
 * All rights reserved.
 */
package com.esoftsystem.sso.model.request;

import com.esoftsystem.sso.model.UserGroupDto;
import com.esoftsystem.sso.model.request.base.UpdateUserBaseRequest;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;
import java.util.List;
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
public class UpdateUserRequest extends UpdateUserBaseRequest {

  @JsonProperty("username")
  private String username;
  @JsonProperty(value = "resourceName")
  private String resourceName;
  @JsonProperty(value = "userStatus")
  private String userStatus;
  @JsonProperty(value = "companyCode")
  private String companyCode;
  @JsonProperty(value = "teamCode")
  private String teamCode;
  @JsonProperty(value = "groups")
  private List<UserGroupDto> groups;

  /**
   * All Args Constructor.
   *
   * @param title        user's title
   * @param firstName    user's first name
   * @param lastName     user's last name
   * @param dateOfBirth  user's date of birth
   * @param avatarUrl    user's avatar
   * @param skypeId      user's skypeId
   * @param countryCode  user's country code
   * @param phone        user's phone number
   * @param username     the username
   * @param resourceName the resourceName
   * @param teamCode     user's team code
   * @param companyCode  user's company code
   * @param groups       user's groups
   * @param userStatus   user's status
   */
  //CHECKSTYLE.OFF: ParameterNumber
  @Builder
  public UpdateUserRequest(String title, String firstName, String lastName, Date dateOfBirth, String avatarUrl, String skypeId, String countryCode,
      String phone, String username, String resourceName, String userStatus, String companyCode, String teamCode,
      List<UserGroupDto> groups) {
    super(title, firstName, lastName, dateOfBirth, avatarUrl, skypeId, countryCode, phone);
    this.username = username;
    this.resourceName = resourceName;
    this.userStatus = userStatus;
    this.companyCode = companyCode;
    this.teamCode = teamCode;
    this.groups = groups;
  }
  //CHECKSTYLE.ON: ParameterNumber
}
