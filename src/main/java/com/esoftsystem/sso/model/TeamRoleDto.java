/*
 * @(#)TeamRoleDto.java
 *
 * Copyright 2022 by esoft systems (tm).
 * All rights reserved.
 */

package com.esoftsystem.sso.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * @author duquangvu
 * @since 1.0.0
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TeamRoleDto implements Serializable {

  @JsonProperty("teamCode")
  private String teamCode;

  @JsonProperty("isPrimaryTeam")
  private Boolean isPrimaryTeam;

  @JsonProperty("groups")
  private List<GroupDto> groups;
}
