/*
 * @(#)FindUserSummaryRequest.java
 *
 * Copyright 2021 by esoft systems (tm).
 * All rights reserved.
 */
package com.esoftsystem.sso.model.response;

import java.io.Serializable;
import java.util.List;

import com.esoftsystem.sso.model.UserSummaryDto;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Vinh Nguyen
 * @since 1.0.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class FindUserSummaryResponse implements Serializable {

  private static final long serialVersionUID = -793760325703244226L;
  private Long count;
  private List<UserSummaryDto> userSummaries;
}
