/*
 * @(#)RoleDto.java
 *
 * Copyright 2022 by esoft systems (tm).
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
 * @author duquangvu
 * @since 1.0.0
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RoleDto implements Serializable {
  private static final long serialVersionUID = -5672124139696221361L;

  @JsonProperty("id")
  private Long id;

  @JsonProperty("roleName")
  private String roleName;
}
