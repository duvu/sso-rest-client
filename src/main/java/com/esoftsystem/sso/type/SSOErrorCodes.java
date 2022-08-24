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
  String INVALID_RESET_PASSWORD_REQUEST = "invalid.reset.password.request";
  String RESET_PASSWORD_TOKEN_DISABLED = "reset.password.token.disabled";
  String RESET_PASSWORD_TOKEN_USED = "reset.password.token.used";
  String RESET_TOKEN_NOT_FOUND = "reset.token.not.found";
  String INVALID_TOKEN = "invalid.token";

  String INSUFFICIENT_GROUP_PERMISSION_TO_ADD_USER = "insufficient.group.permission.to.add.user";
  String INSUFFICIENT_GROUP_PERMISSION_TO_UPDATE_USER = "insufficient.group.permission.to.update.user";
  String INSUFFICIENT_GROUP_PERMISSION_TO_LIST_USER = "insufficient.group.permission.to.list.user";

  String INSUFFICIENT_TEAM_PERMISSION_TO_ADD_USER = "insufficient.team.permission.to.add.user";
  String INSUFFICIENT_TEAM_PERMISSION_TO_UPDATE_USER = "insufficient.team.permission.to.update.user";
  String INSUFFICIENT_TEAM_PERMISSION_TO_LIST_USER = "insufficient.team.permission.to.list.user";

  String ACTIVATE_TOKEN_ALREADY_USED = "activate.token.already.used";
  String ACTIVATE_TOKEN_NOT_FOUND = "activate.token.not.found";
  String ACTIVATE_TOKEN_INVALID = "activate.token.invalid";
  String ACTIVATE_TOKEN_EXPIRED = "activate.token.expired";

  String ACCESS_TOKEN_EXPIRED = "access.token.expired";
  String REFRESH_TOKEN_EXPIRED = "refresh.token.expired";
  String AUTHENTICATION_BAD_CREDENTIALS = "authentication.bad.credential";

  String USER_NAME_DUPLICATED = "username.already.used";
  String EMAIL_DUPLICATED = "email.already.used";
  String RESOURCE_NAME_USED = "resource.name.already.used";
  String RESOURCE_NAME_ALREADY_SET = "resource.name.already.set";

  String USER_LOCKED = "user.locked";
  String USER_NOT_FOUND = "user.not.found";
  String USER_ACTIVATION_PENDING = "user.activation.pending";
  String USER_DISABLED = "user.disabled";

  String ACCESS_DENIED_EXCEPTION = "access.denied.exception";

  String REQUESTED_TEAM_NOT_FOUND = "requested.team.not.found";
  String REQUESTED_GROUP_NOT_FOUND = "requested.group.not.found";
  String REQUESTED_ROLE_NOT_FOUND = "requested.role.not.found";
  String REQUESTED_COMPANY_NOT_FOUND = "requested.company.not.found";
  String REQUESTED_LOCATION_NOT_FOUND = "requested.location.not.found";
  String AVATAR_UPLOAD_FAILED = "upload.avatar.failed";

  String LDAP_PASSWORD_CHANGING_NOT_SUPPORTED = "ldap.password.changing.not.supported";

  String REQUESTED_CONSTRAINS_NOT_EMPTY = "requested.constrains.not.empty";
}
