/*
 * @(#)RolesUpdateRequest.java
 *
 * Copyright 2022 by esoft systems (tm).
 * All rights reserved.
 */
package com.esoftsystem.sso.model.request;

import java.util.List;

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
public class RolesUpdateRequest {
  private List<String> roleNames;
}
