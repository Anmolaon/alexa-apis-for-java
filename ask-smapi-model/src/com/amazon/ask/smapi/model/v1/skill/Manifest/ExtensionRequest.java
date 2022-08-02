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


package com.amazon.ask.smapi.model.v1.skill.Manifest;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a request for a runtime extension. Extensions are optional enhancements to a runtime that provide additional sources of data, commands, and event handlers.
 */

@JsonDeserialize(builder = ExtensionRequest.Builder.class)
public final class ExtensionRequest {

    @JsonProperty("uri")
    private String uri = null;

    private ExtensionRequest() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private ExtensionRequest(Builder builder) {
        if (builder.uri != null) {
            this.uri = builder.uri;
        }
    }

    /**
     * The extension's URI.
     * @return uri
    **/
    @JsonProperty("uri")
    public String getUri() {
        return uri;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExtensionRequest v1SkillManifestExtensionRequest = (ExtensionRequest) o;
        return Objects.equals(this.uri, v1SkillManifestExtensionRequest.uri);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uri);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExtensionRequest {\n");
        
        sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
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
        private String uri;

        private Builder() {}

        @JsonProperty("uri")

        public Builder withUri(String uri) {
            this.uri = uri;
            return this;
        }


        public ExtensionRequest build() {
            return new ExtensionRequest(this);
        }
    }
}

