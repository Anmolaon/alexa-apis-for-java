/*
* Copyright 2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
*
* Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file
* except in compliance with the License. A copy of the License is located at
*
* http://aws.amazon.com/apache2.0/
*
* or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for
* the specific language governing permissions and limitations under the License.
*/


package com.amazon.ask.model.interfaces.amazonpay.model.v1;

import java.util.Objects;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The result attributes from successful SetupAmazonPay call.
 */

@JsonDeserialize(builder = BillingAgreementDetails.Builder.class)
public final class BillingAgreementDetails {

    @JsonProperty("billingAgreementId")
    private String billingAgreementId = null;

    @JsonProperty("creationTimestamp")
    private OffsetDateTime creationTimestamp = null;

    @JsonProperty("destination")
    private com.amazon.ask.model.interfaces.amazonpay.model.v1.Destination destination = null;

    @JsonProperty("checkoutLanguage")
    private String checkoutLanguage = null;

    @JsonProperty("releaseEnvironment")
    private String releaseEnvironment = null;

    @JsonProperty("billingAgreementStatus")
    private String billingAgreementStatus = null;

    public static Builder builder() {
        return new Builder();
    }

    private BillingAgreementDetails(Builder builder) {
        if (builder.billingAgreementId != null) {
            this.billingAgreementId = builder.billingAgreementId;
        }
        if (builder.creationTimestamp != null) {
            this.creationTimestamp = builder.creationTimestamp;
        }
        if (builder.destination != null) {
            this.destination = builder.destination;
        }
        if (builder.checkoutLanguage != null) {
            this.checkoutLanguage = builder.checkoutLanguage;
        }
        if (builder.releaseEnvironment != null) {
            this.releaseEnvironment = builder.releaseEnvironment;
        }
        if (builder.billingAgreementStatus != null) {
            this.billingAgreementStatus = builder.billingAgreementStatus;
        }
    }

    /**
     * Billing agreement id which can be used for one time and recurring purchases
     * @return billingAgreementId
    **/
    @JsonProperty("billingAgreementId")
    public String getBillingAgreementId() {
        return billingAgreementId;
    }


    /**
     * Time at which billing agreement details created.
     * @return creationTimestamp
    **/
    @JsonProperty("creationTimestamp")
    public OffsetDateTime getCreationTimestamp() {
        return creationTimestamp;
    }


    /**
     * The default shipping address of the buyer. Returned if needAmazonShippingAddress is set to true.
     * @return destination
    **/
    @JsonProperty("destination")
    public com.amazon.ask.model.interfaces.amazonpay.model.v1.Destination getDestination() {
        return destination;
    }


    /**
     * Merchant's preferred language of checkout.
     * @return checkoutLanguage
    **/
    @JsonProperty("checkoutLanguage")
    public String getCheckoutLanguage() {
        return checkoutLanguage;
    }


    /**
     * Get releaseEnvironment
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getReleaseEnvironmentAsString().
     *
     * @return releaseEnvironment
    **/
    
    public com.amazon.ask.model.interfaces.amazonpay.model.v1.ReleaseEnvironment getReleaseEnvironment() {
        return com.amazon.ask.model.interfaces.amazonpay.model.v1.ReleaseEnvironment.fromValue(releaseEnvironment);
    }

    /**
     * Get the underlying String value for releaseEnvironment.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return releaseEnvironment as a String value
    **/
    @JsonProperty("releaseEnvironment")
    public String getReleaseEnvironmentAsString() {
      return releaseEnvironment;
    }

    /**
     * Get billingAgreementStatus
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getBillingAgreementStatusAsString().
     *
     * @return billingAgreementStatus
    **/
    
    public com.amazon.ask.model.interfaces.amazonpay.model.v1.BillingAgreementStatus getBillingAgreementStatus() {
        return com.amazon.ask.model.interfaces.amazonpay.model.v1.BillingAgreementStatus.fromValue(billingAgreementStatus);
    }

    /**
     * Get the underlying String value for billingAgreementStatus.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return billingAgreementStatus as a String value
    **/
    @JsonProperty("billingAgreementStatus")
    public String getBillingAgreementStatusAsString() {
      return billingAgreementStatus;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BillingAgreementDetails interfacesAmazonpayModelV1BillingAgreementDetails = (BillingAgreementDetails) o;
        return Objects.equals(this.billingAgreementId, interfacesAmazonpayModelV1BillingAgreementDetails.billingAgreementId) &&
            Objects.equals(this.creationTimestamp, interfacesAmazonpayModelV1BillingAgreementDetails.creationTimestamp) &&
            Objects.equals(this.destination, interfacesAmazonpayModelV1BillingAgreementDetails.destination) &&
            Objects.equals(this.checkoutLanguage, interfacesAmazonpayModelV1BillingAgreementDetails.checkoutLanguage) &&
            Objects.equals(this.releaseEnvironment, interfacesAmazonpayModelV1BillingAgreementDetails.releaseEnvironment) &&
            Objects.equals(this.billingAgreementStatus, interfacesAmazonpayModelV1BillingAgreementDetails.billingAgreementStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(billingAgreementId, creationTimestamp, destination, checkoutLanguage, releaseEnvironment, billingAgreementStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BillingAgreementDetails {\n");
        
        sb.append("    billingAgreementId: ").append(toIndentedString(billingAgreementId)).append("\n");
        sb.append("    creationTimestamp: ").append(toIndentedString(creationTimestamp)).append("\n");
        sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
        sb.append("    checkoutLanguage: ").append(toIndentedString(checkoutLanguage)).append("\n");
        sb.append("    releaseEnvironment: ").append(toIndentedString(releaseEnvironment)).append("\n");
        sb.append("    billingAgreementStatus: ").append(toIndentedString(billingAgreementStatus)).append("\n");
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
  
    public static class Builder {
        private String billingAgreementId;
        private OffsetDateTime creationTimestamp;
        private com.amazon.ask.model.interfaces.amazonpay.model.v1.Destination destination;
        private String checkoutLanguage;
        private String releaseEnvironment;
        private String billingAgreementStatus;

        private Builder() {}

        @JsonProperty("billingAgreementId")

        public Builder withBillingAgreementId(String billingAgreementId) {
            this.billingAgreementId = billingAgreementId;
            return this;
        }


        @JsonProperty("creationTimestamp")

        public Builder withCreationTimestamp(OffsetDateTime creationTimestamp) {
            this.creationTimestamp = creationTimestamp;
            return this;
        }


        @JsonProperty("destination")

        public Builder withDestination(com.amazon.ask.model.interfaces.amazonpay.model.v1.Destination destination) {
            this.destination = destination;
            return this;
        }


        @JsonProperty("checkoutLanguage")

        public Builder withCheckoutLanguage(String checkoutLanguage) {
            this.checkoutLanguage = checkoutLanguage;
            return this;
        }


        @JsonProperty("releaseEnvironment")

        public Builder withReleaseEnvironment(String releaseEnvironment) {
          this.releaseEnvironment = releaseEnvironment;
          return this;
        }

        public Builder withReleaseEnvironment(com.amazon.ask.model.interfaces.amazonpay.model.v1.ReleaseEnvironment releaseEnvironment) {
            this.releaseEnvironment = releaseEnvironment != null ? releaseEnvironment.toString() : null;
            return this;
        }


        @JsonProperty("billingAgreementStatus")

        public Builder withBillingAgreementStatus(String billingAgreementStatus) {
          this.billingAgreementStatus = billingAgreementStatus;
          return this;
        }

        public Builder withBillingAgreementStatus(com.amazon.ask.model.interfaces.amazonpay.model.v1.BillingAgreementStatus billingAgreementStatus) {
            this.billingAgreementStatus = billingAgreementStatus != null ? billingAgreementStatus.toString() : null;
            return this;
        }


        public BillingAgreementDetails build() {
            return new BillingAgreementDetails(this);
        }
    }
}

