/*
 * @(#)RolesUpdateRequest.java
 *
 * Copyright 2022 by esoft systems (tm).
 * All rights reserved.
 */
package com.esoftsystem.sso.model.request;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author duquangvu
 * @since 1.0.0
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class RolesUpdateRequest {
  private List<String> roleNames;
}
