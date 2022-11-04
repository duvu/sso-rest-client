/*
 * @(#)UserGroupDto.java
 *
 * Copyright 2021 by esoft systems (tm).
 * All rights reserved.
 */
package com.esoftsystem.sso.model;

import java.io.Serializable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Vinh Nguyen
 * @since 1.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserTeamDto implements Serializable {

  private static final long serialVersionUID = 4982358408077671479L;
  @NotNull
  @JsonProperty(value = "teamCode")
  private String teamCode;

  @JsonProperty(value = "teamName")
  private String teamName;

  @JsonProperty(value = "groupId")
  private Long groupId;

  @JsonProperty(value = "isPrimary")
  private Boolean isPrimary;
}
