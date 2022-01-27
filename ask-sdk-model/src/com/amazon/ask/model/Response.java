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


package com.amazon.ask.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * Response
 */

@JsonDeserialize(builder = Response.Builder.class)
public final class Response {

    @JsonProperty("outputSpeech")
    private com.amazon.ask.model.ui.OutputSpeech outputSpeech = null;

    @JsonProperty("card")
    private com.amazon.ask.model.ui.Card card = null;

    @JsonProperty("reprompt")
    private com.amazon.ask.model.ui.Reprompt reprompt = null;

    @JsonProperty("directives")
    private List<com.amazon.ask.model.Directive> directives = new ArrayList<com.amazon.ask.model.Directive>();

    @JsonProperty("apiResponse")
    private Object apiResponse = null;

    @JsonProperty("shouldEndSession")
    private Boolean shouldEndSession = null;

    @JsonProperty("canFulfillIntent")
    private com.amazon.ask.model.canfulfill.CanFulfillIntent canFulfillIntent = null;

    @JsonProperty("experimentation")
    private com.amazon.ask.model.interfaces.alexa.experimentation.ExperimentTriggerResponse experimentation = null;

    public static Builder builder() {
        return new Builder();
    }

    private Response(Builder builder) {
        if (builder.outputSpeech != null) {
            this.outputSpeech = builder.outputSpeech;
        }
        if (builder.card != null) {
            this.card = builder.card;
        }
        if (builder.reprompt != null) {
            this.reprompt = builder.reprompt;
        }
        if (builder.directives != null) {
            this.directives = builder.directives;
        }
        if (builder.apiResponse != null) {
            this.apiResponse = builder.apiResponse;
        }
        if (builder.shouldEndSession != null) {
            this.shouldEndSession = builder.shouldEndSession;
        }
        if (builder.canFulfillIntent != null) {
            this.canFulfillIntent = builder.canFulfillIntent;
        }
        if (builder.experimentation != null) {
            this.experimentation = builder.experimentation;
        }
    }

    /**
     * Get outputSpeech
     * @return outputSpeech
    **/
    @JsonProperty("outputSpeech")
    public com.amazon.ask.model.ui.OutputSpeech getOutputSpeech() {
        return outputSpeech;
    }


    /**
     * Get card
     * @return card
    **/
    @JsonProperty("card")
    public com.amazon.ask.model.ui.Card getCard() {
        return card;
    }


    /**
     * Get reprompt
     * @return reprompt
    **/
    @JsonProperty("reprompt")
    public com.amazon.ask.model.ui.Reprompt getReprompt() {
        return reprompt;
    }


    /**
     * Get directives
     * @return directives
    **/
    @JsonProperty("directives")
    public List<com.amazon.ask.model.Directive> getDirectives() {
        return directives;
    }


    /**
     * API response object containing API response value(s)
     * @return apiResponse
    **/
    @JsonProperty("apiResponse")
    public Object getApiResponse() {
        return apiResponse;
    }


    /**
     * Get shouldEndSession
     * @return shouldEndSession
    **/
    @JsonProperty("shouldEndSession")
    public Boolean getShouldEndSession() {
        return shouldEndSession;
    }


    /**
     * Get canFulfillIntent
     * @return canFulfillIntent
    **/
    @JsonProperty("canFulfillIntent")
    public com.amazon.ask.model.canfulfill.CanFulfillIntent getCanFulfillIntent() {
        return canFulfillIntent;
    }


    /**
     * Experiment trigger response from skill
     * @return experimentation
    **/
    @JsonProperty("experimentation")
    public com.amazon.ask.model.interfaces.alexa.experimentation.ExperimentTriggerResponse getExperimentation() {
        return experimentation;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Response response = (Response) o;
        return Objects.equals(this.outputSpeech, response.outputSpeech) &&
            Objects.equals(this.card, response.card) &&
            Objects.equals(this.reprompt, response.reprompt) &&
            Objects.equals(this.directives, response.directives) &&
            Objects.equals(this.apiResponse, response.apiResponse) &&
            Objects.equals(this.shouldEndSession, response.shouldEndSession) &&
            Objects.equals(this.canFulfillIntent, response.canFulfillIntent) &&
            Objects.equals(this.experimentation, response.experimentation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(outputSpeech, card, reprompt, directives, apiResponse, shouldEndSession, canFulfillIntent, experimentation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Response {\n");
        
        sb.append("    outputSpeech: ").append(toIndentedString(outputSpeech)).append("\n");
        sb.append("    card: ").append(toIndentedString(card)).append("\n");
        sb.append("    reprompt: ").append(toIndentedString(reprompt)).append("\n");
        sb.append("    directives: ").append(toIndentedString(directives)).append("\n");
        sb.append("    apiResponse: ").append(toIndentedString(apiResponse)).append("\n");
        sb.append("    shouldEndSession: ").append(toIndentedString(shouldEndSession)).append("\n");
        sb.append("    canFulfillIntent: ").append(toIndentedString(canFulfillIntent)).append("\n");
        sb.append("    experimentation: ").append(toIndentedString(experimentation)).append("\n");
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
        private com.amazon.ask.model.ui.OutputSpeech outputSpeech;
        private com.amazon.ask.model.ui.Card card;
        private com.amazon.ask.model.ui.Reprompt reprompt;
        private List<com.amazon.ask.model.Directive> directives;
        private Object apiResponse;
        private Boolean shouldEndSession;
        private com.amazon.ask.model.canfulfill.CanFulfillIntent canFulfillIntent;
        private com.amazon.ask.model.interfaces.alexa.experimentation.ExperimentTriggerResponse experimentation;

        private Builder() {}

        @JsonProperty("outputSpeech")

        public Builder withOutputSpeech(com.amazon.ask.model.ui.OutputSpeech outputSpeech) {
            this.outputSpeech = outputSpeech;
            return this;
        }


        @JsonProperty("card")

        public Builder withCard(com.amazon.ask.model.ui.Card card) {
            this.card = card;
            return this;
        }


        @JsonProperty("reprompt")

        public Builder withReprompt(com.amazon.ask.model.ui.Reprompt reprompt) {
            this.reprompt = reprompt;
            return this;
        }


        @JsonProperty("directives")

        public Builder withDirectives(List<com.amazon.ask.model.Directive> directives) {
            this.directives = directives;
            return this;
        }

        public Builder addDirectivesItem(com.amazon.ask.model.Directive directivesItem) {
            if (this.directives == null) {
                this.directives = new ArrayList<com.amazon.ask.model.Directive>();
            }
            this.directives.add(directivesItem);
            return this;
        }

        @JsonProperty("apiResponse")

        public Builder withApiResponse(Object apiResponse) {
            this.apiResponse = apiResponse;
            return this;
        }


        @JsonProperty("shouldEndSession")

        public Builder withShouldEndSession(Boolean shouldEndSession) {
            this.shouldEndSession = shouldEndSession;
            return this;
        }


        @JsonProperty("canFulfillIntent")

        public Builder withCanFulfillIntent(com.amazon.ask.model.canfulfill.CanFulfillIntent canFulfillIntent) {
            this.canFulfillIntent = canFulfillIntent;
            return this;
        }


        @JsonProperty("experimentation")

        public Builder withExperimentation(com.amazon.ask.model.interfaces.alexa.experimentation.ExperimentTriggerResponse experimentation) {
            this.experimentation = experimentation;
            return this;
        }


        public Response build() {
            return new Response(this);
        }
    }
}

