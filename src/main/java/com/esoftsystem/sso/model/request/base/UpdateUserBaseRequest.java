/*
 * @(#)UpdateUserBaseRequest.java
 *
 * Copyright 2021 by esoft systems (tm).
 * All rights reserved.
 */
package com.esoftsystem.sso.model.request.base;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Vinh Nguyen
 * @since 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateUserBaseRequest {

  @JsonProperty("title")
  private String title;
  @JsonProperty("firstName")
  private String firstName;
  @JsonProperty("lastName")
  private String lastName;
  @JsonFormat(pattern = "yyyy-MM-dd")
  @JsonProperty("dateOfBirth")
  private Date dateOfBirth;
  @JsonProperty("avatarUrl")
  private String avatarUrl;

  @JsonProperty(value = "skypeId")
  private String skypeId;
  @JsonProperty(value = "countryCode")
  private String countryCode;
  @JsonProperty(value = "phone")
  private String phone;
}
