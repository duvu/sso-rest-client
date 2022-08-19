/*
 * @(#)RolesUpdateResponse.java
 *
 * Copyright 2022 by esoft systems (tm).
 * All rights reserved.
 */
package com.esoftsystem.sso.model.response;

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
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RolesUpdateResponse {
  @JsonProperty("groupId")
  private Long groupId;

  @JsonProperty("groupName")
  private String groupName;

  @JsonProperty("displayName")
  private String displayName;

  @JsonProperty("roleNames")
  private List<String> roleNames;
}
