/*
 * @(#)UpdateUserProfileRequest.java
 *
 * Copyright 2021 by esoft systems (tm).
 * All rights reserved.
 */
package com.esoftsystem.sso.model.request;

import java.io.Serializable;
import java.util.Date;

import com.esoftsystem.sso.model.request.base.UpdateUserBaseRequest;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @author Vinh Nguyen
 * @since 1.0.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateUserProfileRequest extends UpdateUserBaseRequest implements Serializable {

  private static final long serialVersionUID = 8022115544361163047L;
  private String currentPassword;
  private String newPassword;

  /**
   * All Args Constructor.
   *
   * @param title           user's title
   * @param firstName       user's first name
   * @param middleName      user's middle name
   * @param lastName        user's last name
   * @param dateOfBirth     user's date of birth
   * @param avatarUrl       user's avatar
   * @param skypeId         user's skypeId
   * @param countryCode     user's country code
   * @param phone           user's phone number
   * @param currentPassword submitted current password for checking before changing to new password.
   * @param newPassword     new password to change.
   */
  //CHECKSTYLE.OFF: ParameterNumber
  @Builder
  public UpdateUserProfileRequest(String title, String firstName, String middleName, String lastName, Date dateOfBirth,
                                  String avatarUrl, String skypeId, String countryCode, String phone, String currentPassword, String newPassword) {
    super(title, firstName, middleName, lastName, dateOfBirth, avatarUrl, skypeId, countryCode, phone);
    this.currentPassword = currentPassword;
    this.newPassword = newPassword;
  }
  //CHECKSTYLE.ON: ParameterNumber
}
