/*
 * @(#)ClientLocationService.java
 *
 * Copyright 2021 by esoft systems (tm).
 * All rights reserved.
 */
package com.esoftsystem.sso.service;

import java.util.List;

import com.esoftsystem.sso.model.LocationDto;

/**
 * @author Thanh Pham
 * @since 1.0.0
 */
public interface ClientLocationService {

  /**
   * Load all available locations.
   *
   * @param tokenType   token type, mostly: 'Bearer'
   * @param accessToken the access token
   * @return location dtos
   */
  List<LocationDto> loadAllAvailableLocations(String tokenType, String accessToken);
}
