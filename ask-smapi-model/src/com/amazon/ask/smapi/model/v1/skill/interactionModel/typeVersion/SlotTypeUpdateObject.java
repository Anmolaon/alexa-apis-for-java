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
 * Slot Type update description object.
 */

@JsonDeserialize(builder = SlotTypeUpdateObject.Builder.class)
public final class SlotTypeUpdateObject {

    @JsonProperty("description")
    private String description = null;

    private SlotTypeUpdateObject() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private SlotTypeUpdateObject(Builder builder) {
        if (builder.description != null) {
            this.description = builder.description;
        }
    }

    /**
     * The slot type description with a 255 character maximum.
     * @return description
    **/
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SlotTypeUpdateObject v1SkillInteractionModelTypeVersionSlotTypeUpdateObject = (SlotTypeUpdateObject) o;
        return Objects.equals(this.description, v1SkillInteractionModelTypeVersionSlotTypeUpdateObject.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SlotTypeUpdateObject {\n");
        
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
        private String description;

        private Builder() {}

        @JsonProperty("description")

        public Builder withDescription(String description) {
            this.description = description;
            return this;
        }


        public SlotTypeUpdateObject build() {
            return new SlotTypeUpdateObject(this);
        }
    }
}

