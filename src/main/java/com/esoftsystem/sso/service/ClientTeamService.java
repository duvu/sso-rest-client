/*
 * @(#)ClientTeamService.java
 *
 * Copyright 2021 by esoft systems (tm).
 * All rights reserved.
 */
package com.esoftsystem.sso.service;

import java.util.List;

import com.esoftsystem.sso.model.TeamDto;

/**
 * @author Thanh Pham
 * @since 1.0.0
 */
public interface ClientTeamService {

  /**
   * Load all available teams.
   *
   * @param tokenType   token type, mostly: 'Bearer'
   * @param accessToken the access token
   * @return team dtos
   */
  List<TeamDto> loadAllAvailableTeams(String tokenType, String accessToken);
}
