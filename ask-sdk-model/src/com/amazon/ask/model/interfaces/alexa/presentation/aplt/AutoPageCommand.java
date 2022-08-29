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


package com.amazon.ask.model.interfaces.alexa.presentation.aplt;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Automatically progress through a series of pages displayed in a Pager component. The AutoPage command finishes after the last page has been displayed for the requested time period.
 */

@JsonDeserialize(builder = AutoPageCommand.Builder.class)
public final class AutoPageCommand extends com.amazon.ask.model.interfaces.alexa.presentation.aplt.Command  {

    @JsonProperty("componentId")
    private String componentId = null;

    @JsonProperty("count")
    private String count = null;

    @JsonProperty("duration")
    private String duration = null;

    private AutoPageCommand() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private AutoPageCommand(Builder builder) {
        String discriminatorValue = "AutoPage";

        this.type = discriminatorValue;
        if (builder.delay != null) {
            this.delay = builder.delay;
        }
        if (builder.description != null) {
            this.description = builder.description;
        }
        if (builder.screenLock != null) {
            this.screenLock = builder.screenLock;
        }
        if (builder.when != null) {
            this.when = builder.when;
        }
        if (builder.componentId != null) {
            this.componentId = builder.componentId;
        }
        if (builder.count != null) {
            this.count = builder.count;
        }
        if (builder.duration != null) {
            this.duration = builder.duration;
        }
    }

    /**
     * The id of the Pager component.
     * @return componentId
    **/
    @JsonProperty("componentId")
    public String getComponentId() {
        return componentId;
    }


    /**
     * Number of pages to display. Defaults to all of them.
     * @return count
    **/
    @JsonProperty("count")
    public String getCount() {
        return count;
    }


    /**
     * Time to wait between pages (in milliseconds). Defaults to 0.
     * @return duration
    **/
    @JsonProperty("duration")
    public String getDuration() {
        return duration;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AutoPageCommand interfacesAlexaPresentationApltAutoPageCommand = (AutoPageCommand) o;
        return Objects.equals(this.componentId, interfacesAlexaPresentationApltAutoPageCommand.componentId) &&
            Objects.equals(this.count, interfacesAlexaPresentationApltAutoPageCommand.count) &&
            Objects.equals(this.duration, interfacesAlexaPresentationApltAutoPageCommand.duration) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(componentId, count, duration, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AutoPageCommand {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    componentId: ").append(toIndentedString(componentId)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
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
        private Integer delay;
        private String description;
        private Boolean screenLock;
        private String when;
        private String componentId;
        private String count;
        private String duration;

        private Builder() {}

        @JsonProperty("delay")

        public Builder withDelay(Integer delay) {
            this.delay = delay;
            return this;
        }


        @JsonProperty("description")

        public Builder withDescription(String description) {
            this.description = description;
            return this;
        }


        @JsonProperty("screenLock")

        public Builder withScreenLock(Boolean screenLock) {
            this.screenLock = screenLock;
            return this;
        }


        @JsonProperty("when")

        public Builder withWhen(Boolean when) {
            this.when = String.valueOf(when);
            return this;
        }

        @JsonProperty("when")

        public Builder withWhen(String whenExpression) {
            this.when = whenExpression;
            return this;
        }

        @JsonProperty("componentId")

        public Builder withComponentId(String componentId) {
            this.componentId = componentId;
            return this;
        }


        @JsonProperty("count")

        public Builder withCount(Integer count) {
            this.count = String.valueOf(count);
            return this;
        }

        @JsonProperty("count")

        public Builder withCount(String countExpression) {
            this.count = countExpression;
            return this;
        }

        @JsonProperty("duration")

        public Builder withDuration(Integer duration) {
            this.duration = String.valueOf(duration);
            return this;
        }

        @JsonProperty("duration")

        public Builder withDuration(String durationExpression) {
            this.duration = durationExpression;
            return this;
        }

        public AutoPageCommand build() {
            return new AutoPageCommand(this);
        }
    }
}

