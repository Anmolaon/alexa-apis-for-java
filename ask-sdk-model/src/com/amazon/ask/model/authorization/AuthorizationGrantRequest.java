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


package com.amazon.ask.model.authorization;

import java.util.Objects;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents an authorization code delivered to a skill that has out-of-session permissions without requiring account linking.
 */

@JsonDeserialize(builder = AuthorizationGrantRequest.Builder.class)
public final class AuthorizationGrantRequest extends com.amazon.ask.model.Request  {

    @JsonProperty("body")
    private com.amazon.ask.model.authorization.AuthorizationGrantBody body = null;

    private AuthorizationGrantRequest() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private AuthorizationGrantRequest(Builder builder) {
        String discriminatorValue = "Alexa.Authorization.Grant";

        this.type = discriminatorValue;
        if (builder.requestId != null) {
            this.requestId = builder.requestId;
        }
        if (builder.timestamp != null) {
            this.timestamp = builder.timestamp;
        }
        if (builder.locale != null) {
            this.locale = builder.locale;
        }
        if (builder.body != null) {
            this.body = builder.body;
        }
    }

    /**
     * Get body
     * @return body
    **/
    @JsonProperty("body")
    public com.amazon.ask.model.authorization.AuthorizationGrantBody getBody() {
        return body;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AuthorizationGrantRequest authorizationAuthorizationGrantRequest = (AuthorizationGrantRequest) o;
        return Objects.equals(this.body, authorizationAuthorizationGrantRequest.body) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuthorizationGrantRequest {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
        private String requestId;
        private OffsetDateTime timestamp;
        private String locale;
        private com.amazon.ask.model.authorization.AuthorizationGrantBody body;

        private Builder() {}

        @JsonProperty("requestId")

        public Builder withRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }


        @JsonProperty("timestamp")

        public Builder withTimestamp(OffsetDateTime timestamp) {
            this.timestamp = timestamp;
            return this;
        }


        @JsonProperty("locale")

        public Builder withLocale(String locale) {
            this.locale = locale;
            return this;
        }


        @JsonProperty("body")

        public Builder withBody(com.amazon.ask.model.authorization.AuthorizationGrantBody body) {
            this.body = body;
            return this;
        }


        public AuthorizationGrantRequest build() {
            return new AuthorizationGrantRequest(this);
        }
    }
}

