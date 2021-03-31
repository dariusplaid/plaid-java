/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.11.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.plaid.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * DepositSwitchAltCreateResponse defines the response schema for &#x60;/deposit_switch/alt/create&#x60;
 */
@ApiModel(description = "DepositSwitchAltCreateResponse defines the response schema for `/deposit_switch/alt/create`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-31T09:49:55.055Z[GMT]")
public class DepositSwitchAltCreateResponse {
  public static final String SERIALIZED_NAME_DEPOSIT_SWITCH_ID = "deposit_switch_id";
  @SerializedName(SERIALIZED_NAME_DEPOSIT_SWITCH_ID)
  private String depositSwitchId;

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;


  public DepositSwitchAltCreateResponse depositSwitchId(String depositSwitchId) {
    
    this.depositSwitchId = depositSwitchId;
    return this;
  }

   /**
   * ID of the deposit switch. This ID is persisted throughout the lifetime of the deposit switch.
   * @return depositSwitchId
  **/
  @ApiModelProperty(required = true, value = "ID of the deposit switch. This ID is persisted throughout the lifetime of the deposit switch.")

  public String getDepositSwitchId() {
    return depositSwitchId;
  }


  public void setDepositSwitchId(String depositSwitchId) {
    this.depositSwitchId = depositSwitchId;
  }


  public DepositSwitchAltCreateResponse requestId(String requestId) {
    
    this.requestId = requestId;
    return this;
  }

   /**
   * A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive.
   * @return requestId
  **/
  @ApiModelProperty(required = true, value = "A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive.")

  public String getRequestId() {
    return requestId;
  }


  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepositSwitchAltCreateResponse depositSwitchAltCreateResponse = (DepositSwitchAltCreateResponse) o;
    return Objects.equals(this.depositSwitchId, depositSwitchAltCreateResponse.depositSwitchId) &&
        Objects.equals(this.requestId, depositSwitchAltCreateResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(depositSwitchId, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositSwitchAltCreateResponse {\n");
    sb.append("    depositSwitchId: ").append(toIndentedString(depositSwitchId)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

