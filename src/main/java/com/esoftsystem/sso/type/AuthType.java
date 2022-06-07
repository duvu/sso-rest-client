/*
 * @(#)AuthTypeEnum.java
 *
 * Copyright 2021 by esoft systems (tm).
 * All rights reserved.
 */
package com.esoftsystem.sso.type;

import java.util.Arrays;
import java.util.List;

/**
 * This class holds authorities.
 *
 * @author Chien Nguyen Tien
 * @since 1.0
 */
public class AuthType {

  public static final String ROLE_PRODUCTION_JOB_USER = "ROLE_PRODUCTION_JOB_USER";
  public static final String ROLE_PRODUCTION_JOB_ADMIN = "ROLE_PRODUCTION_JOB_ADMIN";

  public static final String ROLE_PRODUCTION_JOB_PRODUCT_MANAGER = "ROLE_PRODUCTION_JOB_PRODUCT_MANAGER";
  public static final String ROLE_PRODUCTION_JOB_SUPERVISOR = "ROLE_PRODUCTION_JOB_SUPERVISOR";
  public static final String ROLE_PRODUCTION_JOB_TEAM_LEADER = "ROLE_PRODUCTION_JOB_TEAM_LEADER";
  public static final String ROLE_PRODUCTION_JOB_PART_TIMER = "ROLE_PRODUCTION_JOB_PART_TIMER";

  public static final List<String> TEAM_ADMIN_ROLES = Arrays.asList(AuthType.ROLE_PRODUCTION_JOB_ADMIN,
                                                                    AuthType.ROLE_PRODUCTION_JOB_PRODUCT_MANAGER,
                                                                    AuthType.ROLE_PRODUCTION_JOB_SUPERVISOR,
                                                                    AuthType.ROLE_PRODUCTION_JOB_TEAM_LEADER);

  public static final List<String> TEAM_MANAGING_ROLES = Arrays.asList(AuthType.ROLE_PRODUCTION_JOB_ADMIN,
                                                                       AuthType.ROLE_PRODUCTION_JOB_PRODUCT_MANAGER,
                                                                       AuthType.ROLE_PRODUCTION_JOB_SUPERVISOR);

  public static List<String> getAdminRoles() {
    return Arrays.asList(ROLE_PRODUCTION_JOB_ADMIN, ROLE_PRODUCTION_JOB_PRODUCT_MANAGER);
  }
}
