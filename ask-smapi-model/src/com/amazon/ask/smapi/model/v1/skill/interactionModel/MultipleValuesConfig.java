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


package com.amazon.ask.smapi.model.v1.skill.interactionModel;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Configuration object for multiple values capturing behavior for this slot.
 */

@JsonDeserialize(builder = MultipleValuesConfig.Builder.class)
public final class MultipleValuesConfig {

    @JsonProperty("enabled")
    private Boolean enabled = null;

    public static Builder builder() {
        return new Builder();
    }

    private MultipleValuesConfig(Builder builder) {
        if (builder.enabled != null) {
            this.enabled = builder.enabled;
        }
    }

    /**
     * Boolean that indicates whether this slot can capture multiple values.
     * @return enabled
    **/
    @JsonProperty("enabled")
    public Boolean getEnabled() {
        return enabled;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MultipleValuesConfig v1SkillInteractionModelMultipleValuesConfig = (MultipleValuesConfig) o;
        return Objects.equals(this.enabled, v1SkillInteractionModelMultipleValuesConfig.enabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enabled);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MultipleValuesConfig {\n");
        
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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
        private Boolean enabled;

        private Builder() {}

        @JsonProperty("enabled")

        public Builder withEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }


        public MultipleValuesConfig build() {
            return new MultipleValuesConfig(this);
        }
    }
}

