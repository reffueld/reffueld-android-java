/*
 * Reffueld API
 * **Reffueld's API** 
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.reffueld.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import com.reffueld.client.model.CouponUserResponse;
import com.reffueld.client.model.MetaList;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * CouponUserListResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-08T18:05:40.872Z")
public class CouponUserListResponse {
  @SerializedName("_meta")
  private MetaList meta = null;

  @SerializedName("data")
  private List<CouponUserResponse> data = new ArrayList<CouponUserResponse>();

  public CouponUserListResponse meta(MetaList meta) {
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @ApiModelProperty(example = "null", value = "")
  public MetaList getMeta() {
    return meta;
  }

  public void setMeta(MetaList meta) {
    this.meta = meta;
  }

  public CouponUserListResponse data(List<CouponUserResponse> data) {
    this.data = data;
    return this;
  }

  public CouponUserListResponse addDataItem(CouponUserResponse dataItem) {
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<CouponUserResponse> getData() {
    return data;
  }

  public void setData(List<CouponUserResponse> data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CouponUserListResponse couponUserListResponse = (CouponUserListResponse) o;
    return Objects.equals(this.meta, couponUserListResponse.meta) &&
        Objects.equals(this.data, couponUserListResponse.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(meta, data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CouponUserListResponse {\n");
    
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

