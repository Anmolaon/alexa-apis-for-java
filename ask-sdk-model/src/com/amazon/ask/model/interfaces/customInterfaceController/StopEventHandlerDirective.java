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


package com.amazon.ask.model.interfaces.customInterfaceController;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This directive stops a running Event Handler associated with the provided token. The Expiration payload will not be sent if this executed before the Event Handler duration expired.
 */

@JsonDeserialize(builder = StopEventHandlerDirective.Builder.class)
public final class StopEventHandlerDirective extends com.amazon.ask.model.Directive  {

    @JsonProperty("token")
    private String token = null;

    private StopEventHandlerDirective() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private StopEventHandlerDirective(Builder builder) {
        String discriminatorValue = "CustomInterfaceController.StopEventHandler";

        this.type = discriminatorValue;
        if (builder.token != null) {
            this.token = builder.token;
        }
    }

    /**
     * Unique identifier required to close the Event Handler. This token must match the token used in the StartEventHandlerDirective.
     * @return token
    **/
    @JsonProperty("token")
    public String getToken() {
        return token;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StopEventHandlerDirective interfacesCustomInterfaceControllerStopEventHandlerDirective = (StopEventHandlerDirective) o;
        return Objects.equals(this.token, interfacesCustomInterfaceControllerStopEventHandlerDirective.token) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(token, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StopEventHandlerDirective {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    token: ").append(toIndentedString(token)).append("\n");
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
        private String token;

        private Builder() {}

        @JsonProperty("token")

        public Builder withToken(String token) {
            this.token = token;
            return this;
        }


        public StopEventHandlerDirective build() {
            return new StopEventHandlerDirective(this);
        }
    }
}

