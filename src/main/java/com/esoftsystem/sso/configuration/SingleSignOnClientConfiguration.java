/*
 * @(#)SingleSignOnClientConfiguration.java
 *
 * Copyright 2021 by esoft systems (tm).
 * All rights reserved.
 */
package com.esoftsystem.sso.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author Vinh Nguyen
 * @since 1.0.0
 */
@Configuration
@ComponentScan(basePackages = "com.esoftsystem.sso.configuration")
public class SingleSignOnClientConfiguration {

  /**
   * Define  singleSignOnClientRestTemplate bean.
   *
   * @return RestTemplate bean.
   */
  @Bean(name = "singleSignOnClientRestTemplate")
  public RestTemplate restTemplate() {
    return new RestTemplate();
  }
}
