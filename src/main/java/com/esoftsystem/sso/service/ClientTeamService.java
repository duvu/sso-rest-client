/*
 * @(#)ClientTeamService.java
 *
 * Copyright 2021 by esoft systems (tm).
 * All rights reserved.
 */
package com.esoftsystem.sso.service;

import java.util.List;

import com.esoftsystem.sso.model.ResourceDto;
import com.esoftsystem.sso.model.TeamDto;

/**
 * @author Thanh Pham
 * @author Chien Nguyen Tien
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

  /**
   * Load all resources which belong to a team.
   *
   * @param tokenType   token type, mostly: 'Bearer'
   * @param accessToken the access token
   * @param teamCode the team code
   * @return List<ResourceDto> resources of a atem
   */
  List<ResourceDto> loadResources(String tokenType, String accessToken, String teamCode);
}
