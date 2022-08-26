/*
 * @(#)TeamDto.java
 *
 * Copyright 2021 by esoft systems (tm).
 * All rights reserved.
 */
package com.esoftsystem.sso.model;

import java.io.Serializable;

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
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TeamDto implements Serializable {

  private static final long serialVersionUID = -5672124139056221361L;

  @JsonProperty("teamCode")
  private String teamCode;

  @JsonProperty("teamName")
  private String teamName;

  @JsonProperty("teamDescription")
  private String teamDescription;

  @JsonProperty("isProduction")
  private boolean isProduction;
}
