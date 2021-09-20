/*
 * @(#)ErrorCodes.java
 *
 * Copyright 2021 by esoft systems (tm).
 * All rights reserved.
 */
package com.esoftsystem.sso.type;

/**
 * This class define all error codes for rest entry points.
 *
 * @author Vinh Nguyen
 * @since 1.0
 */
public interface SSOErrorCodes {

  String INTERNAL_SERVER_ERROR = "internal.server.error";

  String UPDATED_PASSWORD_SAME_EXISTING = "update.password.same.existing";
  String RESET_PASSWORD_TOKEN_EXPIRED = "reset.password.token.expired";
  String RESET_PASSWORD_TOKEN_DISABLED = "reset.password.token.disabled";
  String RESET_PASSWORD_TOKEN_USED = "reset.password.token.used";
  String RESET_TOKEN_NOT_FOUND = "reset.token.not.found";

  String INVALID_TOKEN = "invalid.token";

  String INSUFFICIENT_GROUP_PERMISSION_TO_ADD_USER = "insufficient.group.permission.to.add.user";
  String INSUFFICIENT_GROUP_PERMISSION_TO_LIST_USER = "insufficient.group.permission.to.list.user";

  String ACTIVATE_TOKEN_ALREADY_USED = "activate.token.already.used";
  String ACTIVATE_TOKEN_NOT_FOUND = "activate.token.not.found";
  String ACTIVATE_TOKEN_INVALID = "activate.token.invalid";
  String ACTIVATE_TOKEN_EXPIRED = "activate.token.expired";

  String ACCESS_TOKEN_EXPIRED = "access.token.expired";
  String REFRESH_TOKEN_EXPIRED = "refresh.token.expired";
  String AUTHENTICATION_BAD_CREDENTIALS = "authentication.bad.credential";

  String USER_NAME_DUPLICATED = "username.already.used";
  String RESOURCE_NAME_USED = "resource.name.already.used";
  String RESOURCE_NAME_ALREADY_SET = "resource.name.already.set";

  String USER_LOCKED = "user.locked";
  String USER_NOT_FOUND = "user.not.found";
  String USER_ACTIVATION_PENDING = "user.activation.pending";
  String USER_DISABLED = "user.disabled";

  String REQUESTED_TEAM_NOT_FOUND = "requested.team.not.found";
  String REQUESTED_COMPANY_NOT_FOUND = "requested.company.not.found";
}
