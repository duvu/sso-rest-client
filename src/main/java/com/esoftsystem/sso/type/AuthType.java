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
  public static final String ROLE_SYSTEM_ADMINISTRATOR                = "ROLE_SYSTEM_ADMINISTRATOR";
  public static final String ROLE_PRODUCTION_JOB_USER                 = "ROLE_PRODUCTION_JOB_USER";
  public static final String ROLE_PRODUCTION_JOB_ADMIN                = "ROLE_PRODUCTION_JOB_ADMIN";

  public static final String ROLE_PRODUCTION_JOB_PRODUCT_MANAGER      = "ROLE_PRODUCTION_JOB_PRODUCT_MANAGER";
  public static final String ROLE_PRODUCTION_JOB_SUPERVISOR           = "ROLE_PRODUCTION_JOB_SUPERVISOR";
  public static final String ROLE_PRODUCTION_JOB_TEAM_LEADER          = "ROLE_PRODUCTION_JOB_TEAM_LEADER";
  public static final String ROLE_PRODUCTION_JOB_PART_TIMER           = "ROLE_PRODUCTION_JOB_PART_TIMER";

  public static final String ROLE_ESOFT_USER                          = "ROLE_ESOFT_USER";
  public static final String ROLE_PRODUCTION_JOB_EDITOR               = "ROLE_PRODUCTION_JOB_EDITOR";
  public static final String ROLE_PRODUCTION_JOB_QC                   = "ROLE_PRODUCTION_JOB_QC";
  public static final String ROLE_PRODUCTION_JOB_INTERNATIONAL_USER   = "ROLE_PRODUCTION_JOB_INTERNATIONAL_USER";

  public static final String ROLE_USER_MANAGEMENT_VIEW                = "ROLE_USER_MANAGEMENT_VIEW";
  public static final String ROLE_USER_MANAGEMENT_MANAGE              = "ROLE_USER_MANAGEMENT_MANAGE";
  public static final String ROLE_USER_MANAGEMENT_ADMIN               = "ROLE_USER_MANAGEMENT_ADMIN";

  public static final String ROLE_JOB_OVERVIEW_VIEW                   = "ROLE_JOB_OVERVIEW_VIEW";
  public static final String ROLE_JOB_OVERVIEW_MANAGE                 = "ROLE_JOB_OVERVIEW_MANAGE";
  public static final String ROLE_JOB_OVERVIEW_ADMIN                  = "ROLE_JOB_OVERVIEW_ADMIN";
  public static final String ROLE_USER_PROFILE_VIEW                   = "ROLE_USER_PROFILE_VIEW";
  public static final String ROLE_USER_PROFILE_MANAGE                 = "ROLE_USER_PROFILE_MANAGE";
  public static final String ROLE_USER_PROFILE_ADMIN                  = "ROLE_USER_PROFILE_ADMIN";
  public static final String ROLE_P3_SETTINGS_VIEW                    = "ROLE_P3_SETTINGS_VIEW";
  public static final String ROLE_P3_SETTINGS_MANAGE                  = "ROLE_P3_SETTINGS_MANAGE";
  public static final String ROLE_P3_SETTINGS_ADMIN                   = "ROLE_P3_SETTINGS_ADMIN";
  public static final String ROLE_USER_FEEDBACK_FORM_VIEW             = "ROLE_USER_FEEDBACK_FORM_VIEW";
  public static final String ROLE_USER_FEEDBACK_FORM_MANAGE           = "ROLE_USER_FEEDBACK_FORM_MANAGE";
  public static final String ROLE_USER_FEEDBACK_FORM_ADMIN            = "ROLE_USER_FEEDBACK_FORM_ADMIN";
  public static final String ROLE_PRODUCT_UPDATE_VIEW                 = "ROLE_PRODUCT_UPDATE_VIEW";
  public static final String ROLE_PRODUCT_UPDATE_MANAGE               = "ROLE_PRODUCT_UPDATE_MANAGE";
  public static final String ROLE_PRODUCT_UPDATE_ADMIN                = "ROLE_PRODUCT_UPDATE_ADMIN";
  public static final String ROLE_CLIENT_TEMPERATURE_VIEW             = "ROLE_CLIENT_TEMPERATURE_VIEW";
  public static final String ROLE_CLIENT_TEMPERATURE_MANAGE           = "ROLE_CLIENT_TEMPERATURE_MANAGE";
  public static final String ROLE_CLIENT_TEMPERATURE_ADMIN            = "ROLE_CLIENT_TEMPERATURE_ADMIN";


  public static final List<String> SINGLE_TEAM_MANAGING_ROLES = Arrays.asList(ROLE_PRODUCTION_JOB_ADMIN, ROLE_PRODUCTION_JOB_PRODUCT_MANAGER,
                                                                              ROLE_PRODUCTION_JOB_SUPERVISOR, ROLE_PRODUCTION_JOB_TEAM_LEADER);
  public static final List<String> MULTIPLE_TEAMS_MANAGING_ROLES = List.of(ROLE_PRODUCTION_JOB_ADMIN, ROLE_PRODUCTION_JOB_PRODUCT_MANAGER);
}
