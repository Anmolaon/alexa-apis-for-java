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


package com.amazon.ask.model.interfaces.applink;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AppLinkInterface
 */

@JsonDeserialize(builder = AppLinkInterface.Builder.class)
public final class AppLinkInterface {

    @JsonProperty("version")
    private String version = null;

    private AppLinkInterface() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private AppLinkInterface(Builder builder) {
        if (builder.version != null) {
            this.version = builder.version;
        }
    }

    /**
     * Get version
     * @return version
    **/
    @JsonProperty("version")
    public String getVersion() {
        return version;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AppLinkInterface interfacesApplinkAppLinkInterface = (AppLinkInterface) o;
        return Objects.equals(this.version, interfacesApplinkAppLinkInterface.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AppLinkInterface {\n");
        
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
        private String version;

        private Builder() {}

        @JsonProperty("version")

        public Builder withVersion(String version) {
            this.version = version;
            return this;
        }


        public AppLinkInterface build() {
            return new AppLinkInterface(this);
        }
    }
}

