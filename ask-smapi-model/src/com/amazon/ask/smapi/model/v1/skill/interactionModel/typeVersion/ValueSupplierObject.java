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


package com.amazon.ask.smapi.model.v1.skill.interactionModel.typeVersion;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Value supplier object for slot definition.
 */

@JsonDeserialize(builder = ValueSupplierObject.Builder.class)
public final class ValueSupplierObject {

    @JsonProperty("valueSupplier")
    private com.amazon.ask.smapi.model.v1.skill.interactionModel.ValueSupplier valueSupplier = null;

    private ValueSupplierObject() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private ValueSupplierObject(Builder builder) {
        if (builder.valueSupplier != null) {
            this.valueSupplier = builder.valueSupplier;
        }
    }

    /**
     * Get valueSupplier
     * @return valueSupplier
    **/
    @JsonProperty("valueSupplier")
    public com.amazon.ask.smapi.model.v1.skill.interactionModel.ValueSupplier getValueSupplier() {
        return valueSupplier;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ValueSupplierObject v1SkillInteractionModelTypeVersionValueSupplierObject = (ValueSupplierObject) o;
        return Objects.equals(this.valueSupplier, v1SkillInteractionModelTypeVersionValueSupplierObject.valueSupplier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valueSupplier);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ValueSupplierObject {\n");
        
        sb.append("    valueSupplier: ").append(toIndentedString(valueSupplier)).append("\n");
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
        private com.amazon.ask.smapi.model.v1.skill.interactionModel.ValueSupplier valueSupplier;

        private Builder() {}

        @JsonProperty("valueSupplier")

        public Builder withValueSupplier(com.amazon.ask.smapi.model.v1.skill.interactionModel.ValueSupplier valueSupplier) {
            this.valueSupplier = valueSupplier;
            return this;
        }


        public ValueSupplierObject build() {
            return new ValueSupplierObject(this);
        }
    }
}

