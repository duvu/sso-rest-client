/*
 * @(#)ClientGroupService.java
 *
 * Copyright 2021 by esoft systems (tm).
 * All rights reserved.
 */
package com.esoftsystem.sso.service;

import java.util.List;

import com.esoftsystem.sso.model.GroupDto;

/**
 * @author Thanh Pham
 * @since 1.0.0
 */
public interface ClientGroupService {

  /**
   * Load all groups which has the given role.
   *
   * @param tokenType   token type, mostly: 'Bearer'
   * @param accessToken the access token
   * @param roleName    the requested role
   * @return matched groups
   */
  List<GroupDto> loadAllGroupsContainRole(String tokenType, String accessToken, String roleName);
}
