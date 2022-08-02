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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * Used to declare that the skill uses the Alexa.Presentation.APL interface.
 */

@JsonDeserialize(builder = AlexaPresentationAplInterface.Builder.class)
public final class AlexaPresentationAplInterface extends com.amazon.ask.smapi.model.v1.skill.Manifest.ModelInterface  {

    @JsonProperty("supportedViewports")
    private List<com.amazon.ask.smapi.model.v1.skill.Manifest.ViewportSpecification> supportedViewports = new ArrayList<com.amazon.ask.smapi.model.v1.skill.Manifest.ViewportSpecification>();

    private AlexaPresentationAplInterface() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private AlexaPresentationAplInterface(Builder builder) {
        String discriminatorValue = "ALEXA_PRESENTATION_APL";

        this.type = discriminatorValue;
        if (builder.supportedViewports != null) {
            this.supportedViewports = builder.supportedViewports;
        }
    }

    /**
     * List of supported viewports.
     * @return supportedViewports
    **/
    @JsonProperty("supportedViewports")
    public List<com.amazon.ask.smapi.model.v1.skill.Manifest.ViewportSpecification> getSupportedViewports() {
        return supportedViewports;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AlexaPresentationAplInterface v1SkillManifestAlexaPresentationAplInterface = (AlexaPresentationAplInterface) o;
        return Objects.equals(this.supportedViewports, v1SkillManifestAlexaPresentationAplInterface.supportedViewports) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(supportedViewports, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlexaPresentationAplInterface {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    supportedViewports: ").append(toIndentedString(supportedViewports)).append("\n");
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
        private List<com.amazon.ask.smapi.model.v1.skill.Manifest.ViewportSpecification> supportedViewports;

        private Builder() {}

        @JsonProperty("supportedViewports")

        public Builder withSupportedViewports(List<com.amazon.ask.smapi.model.v1.skill.Manifest.ViewportSpecification> supportedViewports) {
            this.supportedViewports = supportedViewports;
            return this;
        }

        public Builder addSupportedViewportsItem(com.amazon.ask.smapi.model.v1.skill.Manifest.ViewportSpecification supportedViewportsItem) {
            if (this.supportedViewports == null) {
                this.supportedViewports = new ArrayList<com.amazon.ask.smapi.model.v1.skill.Manifest.ViewportSpecification>();
            }
            this.supportedViewports.add(supportedViewportsItem);
            return this;
        }

        public AlexaPresentationAplInterface build() {
            return new AlexaPresentationAplInterface(this);
        }
    }
}

