/*
 * @(#)FindUserSummaryRequest.java
 *
 * Copyright 2021 by esoft systems (tm).
 * All rights reserved.
 */
package com.esoftsystem.sso.model.request;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

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
public class FindUserSummaryRequest implements Serializable {

  private static final long serialVersionUID = -8748598355778971407L;
  @JsonProperty(value = "teamCodes")
  private List<String> teamCodes;

  @JsonProperty(value = "resourceTypes")
  private List<String> resourceTypes;

  @JsonProperty(value = "locations")
  private List<String> locations;
  @JsonProperty(value = "groupIds")
  private List<Long> groupIds;
  @JsonProperty(value = "statuses")
  private List<String> statuses;
  @JsonProperty(value = "keyword")
  private String keyword;
  @JsonProperty(value = "pageIndex")
  private Integer pageIndex;
  @JsonProperty(value = "pageSize")
  private Integer pageSize;
  @JsonProperty(value = "sortField")
  private String sortField;
  @JsonProperty(value = "sortType")
  private String sortType;
}
