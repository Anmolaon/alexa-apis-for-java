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


package com.amazon.ask.smapi.model.v1.skill.evaluations;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An object representing the resolved value for the slot, based on the user&#39;s utterance and the slot type definition. 
 */

@JsonDeserialize(builder = ResolutionsPerAuthorityValueItems.Builder.class)
public final class ResolutionsPerAuthorityValueItems {

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("id")
    private String id = null;

    private ResolutionsPerAuthorityValueItems() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private ResolutionsPerAuthorityValueItems(Builder builder) {
        if (builder.name != null) {
            this.name = builder.name;
        }
        if (builder.id != null) {
            this.id = builder.id;
        }
    }

    /**
     * The string for the resolved slot value.
     * @return name
    **/
    @JsonProperty("name")
    public String getName() {
        return name;
    }


    /**
     * The unique ID defined for the resolved slot value. This is based on the IDs defined in the slot type definition. 
     * @return id
    **/
    @JsonProperty("id")
    public String getId() {
        return id;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResolutionsPerAuthorityValueItems v1SkillEvaluationsResolutionsPerAuthorityValueItems = (ResolutionsPerAuthorityValueItems) o;
        return Objects.equals(this.name, v1SkillEvaluationsResolutionsPerAuthorityValueItems.name) &&
            Objects.equals(this.id, v1SkillEvaluationsResolutionsPerAuthorityValueItems.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResolutionsPerAuthorityValueItems {\n");
        
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
        private String name;
        private String id;

        private Builder() {}

        @JsonProperty("name")

        public Builder withName(String name) {
            this.name = name;
            return this;
        }


        @JsonProperty("id")

        public Builder withId(String id) {
            this.id = id;
            return this;
        }


        public ResolutionsPerAuthorityValueItems build() {
            return new ResolutionsPerAuthorityValueItems(this);
        }
    }
}

