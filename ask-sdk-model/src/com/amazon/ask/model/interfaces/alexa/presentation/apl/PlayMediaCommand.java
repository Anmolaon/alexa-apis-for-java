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


package com.amazon.ask.model.interfaces.alexa.presentation.apl;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * Plays media on a media player (currently only a Video player; audio may be added in the future). The media may be on the background audio track or may be sequenced with speak directives).
 */

@JsonDeserialize(builder = PlayMediaCommand.Builder.class)
public final class PlayMediaCommand extends com.amazon.ask.model.interfaces.alexa.presentation.apl.Command  {

    @JsonProperty("audioTrack")
    private com.amazon.ask.model.interfaces.alexa.presentation.apl.AudioTrack audioTrack = null;

    @JsonProperty("componentId")
    private String componentId = null;

    @JsonProperty("source")
    private List<com.amazon.ask.model.interfaces.alexa.presentation.apl.VideoSource> source = new ArrayList<com.amazon.ask.model.interfaces.alexa.presentation.apl.VideoSource>();

    private PlayMediaCommand() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private PlayMediaCommand(Builder builder) {
        String discriminatorValue = "PlayMedia";

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
        if (builder.sequencer != null) {
            this.sequencer = builder.sequencer;
        }
        if (builder.when != null) {
            this.when = builder.when;
        }
        if (builder.audioTrack != null) {
            this.audioTrack = builder.audioTrack;
        }
        if (builder.componentId != null) {
            this.componentId = builder.componentId;
        }
        if (builder.source != null) {
            this.source = builder.source;
        }
    }

    /**
     * The command to issue on the media player
     * @return audioTrack
    **/
    @JsonProperty("audioTrack")
    public com.amazon.ask.model.interfaces.alexa.presentation.apl.AudioTrack getAudioTrack() {
        return audioTrack;
    }


    /**
     * The name of the media playing component
     * @return componentId
    **/
    @JsonProperty("componentId")
    public String getComponentId() {
        return componentId;
    }


    /**
     * The media source
     * @return source
    **/
    @JsonProperty("source")
    public List<com.amazon.ask.model.interfaces.alexa.presentation.apl.VideoSource> getSource() {
        return source;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PlayMediaCommand interfacesAlexaPresentationAplPlayMediaCommand = (PlayMediaCommand) o;
        return Objects.equals(this.audioTrack, interfacesAlexaPresentationAplPlayMediaCommand.audioTrack) &&
            Objects.equals(this.componentId, interfacesAlexaPresentationAplPlayMediaCommand.componentId) &&
            Objects.equals(this.source, interfacesAlexaPresentationAplPlayMediaCommand.source) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(audioTrack, componentId, source, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PlayMediaCommand {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    audioTrack: ").append(toIndentedString(audioTrack)).append("\n");
        sb.append("    componentId: ").append(toIndentedString(componentId)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
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
        private String delay;
        private String description;
        private Boolean screenLock;
        private String sequencer;
        private Boolean when;
        private com.amazon.ask.model.interfaces.alexa.presentation.apl.AudioTrack audioTrack;
        private String componentId;
        private List<com.amazon.ask.model.interfaces.alexa.presentation.apl.VideoSource> source;

        private Builder() {}

        @JsonProperty("delay")

        public Builder withDelay(Integer delay) {
            this.delay = String.valueOf(delay);
            return this;
        }

        @JsonProperty("delay")

        public Builder withDelay(String delayExpression) {
            this.delay = delayExpression;
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


        @JsonProperty("sequencer")

        public Builder withSequencer(String sequencer) {
            this.sequencer = sequencer;
            return this;
        }


        @JsonProperty("when")

        public Builder withWhen(Boolean when) {
            this.when = when;
            return this;
        }


        @JsonProperty("audioTrack")

        public Builder withAudioTrack(com.amazon.ask.model.interfaces.alexa.presentation.apl.AudioTrack audioTrack) {
            this.audioTrack = audioTrack;
            return this;
        }


        @JsonProperty("componentId")

        public Builder withComponentId(String componentId) {
            this.componentId = componentId;
            return this;
        }


        @JsonProperty("source")

        public Builder withSource(List<com.amazon.ask.model.interfaces.alexa.presentation.apl.VideoSource> source) {
            this.source = source;
            return this;
        }

        public Builder addSourceItem(com.amazon.ask.model.interfaces.alexa.presentation.apl.VideoSource sourceItem) {
            if (this.source == null) {
                this.source = new ArrayList<com.amazon.ask.model.interfaces.alexa.presentation.apl.VideoSource>();
            }
            this.source.add(sourceItem);
            return this;
        }

        public PlayMediaCommand build() {
            return new PlayMediaCommand(this);
        }
    }
}

