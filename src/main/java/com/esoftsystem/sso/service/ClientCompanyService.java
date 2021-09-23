/*
 * @(#)ClientCompanyService.java
 *
 * Copyright 2021 by esoft systems (tm).
 * All rights reserved.
 */
package com.esoftsystem.sso.service;

import java.util.List;

import com.esoftsystem.sso.model.CompanyDto;

/**
 * @author Thanh Pham
 * @since 1.0.0
 */
public interface ClientCompanyService {

  /**
   * Load all available companies.
   *
   * @param tokenType   token type, mostly: 'Bearer'
   * @param accessToken the access token
   * @return company dtos
   */
  List<CompanyDto> loadAllAvailableCompanies(String tokenType, String accessToken);
}
