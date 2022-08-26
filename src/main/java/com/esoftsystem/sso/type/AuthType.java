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
  public static final String ROLE_SYSTEM_ADMINISTRATOR = "ROLE_SYSTEM_ADMINISTRATOR";
  public static final String ROLE_PRODUCTION_JOB_USER = "ROLE_PRODUCTION_JOB_USER";
  public static final String ROLE_PRODUCTION_JOB_ADMIN = "ROLE_PRODUCTION_JOB_ADMIN";

  public static final String ROLE_PRODUCTION_JOB_PRODUCT_MANAGER = "ROLE_PRODUCTION_JOB_PRODUCT_MANAGER";
  public static final String ROLE_PRODUCTION_JOB_SUPERVISOR = "ROLE_PRODUCTION_JOB_SUPERVISOR";
  public static final String ROLE_PRODUCTION_JOB_TEAM_LEADER = "ROLE_PRODUCTION_JOB_TEAM_LEADER";
  public static final String ROLE_PRODUCTION_JOB_PART_TIMER = "ROLE_PRODUCTION_JOB_PART_TIMER";

  public static final String ROLE_USER_MANAGEMENT_LIST_VIEW        = "ROLE_USER_MANAGEMENT_LIST_VIEW";
  public static final String ROLE_USER_MANAGEMENT_LIST_MANAGE      = "ROLE_USER_MANAGEMENT_LIST_MANAGE";
  public static final String ROLE_USER_MANAGEMENT_LIST_ADMIN       = "ROLE_USER_MANAGEMENT_LIST_ADMIN";
  public static final String ROLE_USER_MANAGEMENT_ADD_EDIT_VIEW    = "ROLE_USER_MANAGEMENT_ADD_EDIT_VIEW";
  public static final String ROLE_USER_MANAGEMENT_ADD_EDIT_MANAGE  = "ROLE_USER_MANAGEMENT_ADD_EDIT_MANAGE";
  public static final String ROLE_USER_MANAGEMENT_ADD_EDIT_ADMIN   = "ROLE_USER_MANAGEMENT_ADD_EDIT_ADMIN";
  public static final String ROLE_P3_SETTINGS_VIEW                 = "ROLE_P3_SETTINGS_VIEW";
  public static final String ROLE_P3_SETTINGS_MANAGE               = "ROLE_P3_SETTINGS_MANAGE";
  public static final String ROLE_P3_SETTINGS_ADMIN                = "ROLE_P3_SETTINGS_ADMIN";
  public static final String ROLE_JOB_OVERVIEW_VIEW                = "ROLE_JOB_OVERVIEW_VIEW";
  public static final String ROLE_JOB_OVERVIEW_MANAGE              = "ROLE_JOB_OVERVIEW_MANAGE";
  public static final String ROLE_JOB_OVERVIEW_ADMIN               = "ROLE_JOB_OVERVIEW_ADMIN";
  public static final String ROLE_USER_FORM_LIST_VIEW              = "ROLE_USER_FORM_LIST_VIEW";
  public static final String ROLE_USER_FORM_LIST_MANAGE            = "ROLE_USER_FORM_LIST_MANAGE";
  public static final String ROLE_USER_FORM_LIST_ADMIN             = "ROLE_USER_FORM_LIST_ADMIN";
  public static final String ROLE_USER_FORM_ADD_VIEW               = "ROLE_USER_FORM_ADD_VIEW";
  public static final String ROLE_USER_FORM_ADD_MANAGE             = "ROLE_USER_FORM_ADD_MANAGE";
  public static final String ROLE_USER_FORM_ADD_ADMIN              = "ROLE_USER_FORM_ADD_ADMIN";
  public static final String ROLE_USER_FORM_EDIT_VIEW              = "ROLE_USER_FORM_EDIT_VIEW";
  public static final String ROLE_USER_FORM_EDIT_MANAGE            = "ROLE_USER_FORM_EDIT_MANAGE";
  public static final String ROLE_USER_FORM_EDIT_ADMIN             = "ROLE_USER_FORM_EDIT_ADMIN";
  public static final String ROLE_USER_FORM_PREVIEW_VIEW           = "ROLE_USER_FORM_PREVIEW_VIEW";
  public static final String ROLE_USER_FORM_PREVIEW_MANAGE         = "ROLE_USER_FORM_PREVIEW_MANAGE";
  public static final String ROLE_USER_FORM_PREVIEW_ADMIN          = "ROLE_USER_FORM_PREVIEW_ADMIN";
  public static final String ROLE_PRODUCT_UPDATE_LIST_VIEW         = "ROLE_PRODUCT_UPDATE_LIST_VIEW";
  public static final String ROLE_PRODUCT_UPDATE_LIST_MANAGE       = "ROLE_PRODUCT_UPDATE_LIST_MANAGE";
  public static final String ROLE_PRODUCT_UPDATE_LIST_ADMIN        = "ROLE_PRODUCT_UPDATE_LIST_ADMIN";
  public static final String ROLE_PRODUCT_UPDATE_ADD_EDIT_VIEW     = "ROLE_PRODUCT_UPDATE_ADD_EDIT_VIEW";
  public static final String ROLE_PRODUCT_UPDATE_ADD_EDIT_MANAGE   = "ROLE_PRODUCT_UPDATE_ADD_EDIT_MANAGE";
  public static final String ROLE_PRODUCT_UPDATE_ADD_EDIT_ADMIN    = "ROLE_PRODUCT_UPDATE_ADD_EDIT_ADMIN";
  public static final String ROLE_PRODUCT_UPDATE_VIEW_VIEW         = "ROLE_PRODUCT_UPDATE_VIEW_VIEW";
  public static final String ROLE_PRODUCT_UPDATE_VIEW_MANAGE       = "ROLE_PRODUCT_UPDATE_VIEW_MANAGE";
  public static final String ROLE_PRODUCT_UPDATE_VIEW_ADMIN        = "ROLE_PRODUCT_UPDATE_VIEW_ADMIN";
  public static final String ROLE_PRODUCT_UPDATE_PREVIEW_VIEW      = "ROLE_PRODUCT_UPDATE_PREVIEW_VIEW";
  public static final String ROLE_PRODUCT_UPDATE_PREVIEW_MANAGE    = "ROLE_PRODUCT_UPDATE_PREVIEW_MANAGE";
  public static final String ROLE_PRODUCT_UPDATE_PREVIEW_ADMIN     = "ROLE_PRODUCT_UPDATE_PREVIEW_ADMIN";

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
