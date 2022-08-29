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


package com.amazon.ask.model.events.skillevents;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Permission
 */

@JsonDeserialize(builder = Permission.Builder.class)
public final class Permission {

    @JsonProperty("scope")
    private String scope = null;

    private Permission() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private Permission(Builder builder) {
        if (builder.scope != null) {
            this.scope = builder.scope;
        }
    }

    /**
     * The value representing the permission scope. 
     * @return scope
    **/
    @JsonProperty("scope")
    public String getScope() {
        return scope;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Permission eventsSkilleventsPermission = (Permission) o;
        return Objects.equals(this.scope, eventsSkilleventsPermission.scope);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scope);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Permission {\n");
        
        sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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
        private String scope;

        private Builder() {}

        @JsonProperty("scope")

        public Builder withScope(String scope) {
            this.scope = scope;
            return this;
        }


        public Permission build() {
            return new Permission(this);
        }
    }
}

