package com.esoftsystem.sso.type;

public enum ResourceType {
  FULL_TIME("full_time"),
  INTERNAL_PART_TIME("internal_part_time"),
  EXTERNAL_PART_TIME("external_part_time"),
  INTERNATIONAL_PART_TIME("international_part_time");

  // Declare a private field for getting values
  private String value;

  ResourceType(String resourceTypes) {
    this.value = resourceTypes;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return this.value;
  }

  public static ResourceType fromValue(String value) {
    for (ResourceType resourceType : ResourceType.values()) {
      if (resourceType.value.equals(value)) {
        return resourceType;
      }
    }
    throw new IllegalArgumentException(value);
  }

  public static ResourceType fromName(String name) {
    for (ResourceType resourceType : ResourceType.values()) {
      if (resourceType.name().equals(name)) {
        return resourceType;
      }
    }
    throw new IllegalArgumentException(name);
  }
}
