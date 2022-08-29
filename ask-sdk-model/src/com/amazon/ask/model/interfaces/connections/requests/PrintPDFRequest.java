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


package com.amazon.ask.model.interfaces.connections.requests;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Payload Request object for PrintPDF
 */

@JsonDeserialize(builder = PrintPDFRequest.Builder.class)
public final class PrintPDFRequest extends com.amazon.ask.model.interfaces.connections.requests.BaseRequest  {

    @JsonProperty("title")
    private String title = null;

    @JsonProperty("url")
    private String url = null;

    @JsonProperty("description")
    private String description = null;

    private PrintPDFRequest() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private PrintPDFRequest(Builder builder) {
        String discriminatorValue = "PrintPDFRequest";

        this.type = discriminatorValue;
        if (builder.version != null) {
            this.version = builder.version;
        }
        if (builder.title != null) {
            this.title = builder.title;
        }
        if (builder.url != null) {
            this.url = builder.url;
        }
        if (builder.description != null) {
            this.description = builder.description;
        }
    }

    /**
     * title of the image
     * @return title
    **/
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }


    /**
     * url of the image
     * @return url
    **/
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }


    /**
     * description of the image
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
        PrintPDFRequest interfacesConnectionsRequestsPrintPDFRequest = (PrintPDFRequest) o;
        return Objects.equals(this.title, interfacesConnectionsRequestsPrintPDFRequest.title) &&
            Objects.equals(this.url, interfacesConnectionsRequestsPrintPDFRequest.url) &&
            Objects.equals(this.description, interfacesConnectionsRequestsPrintPDFRequest.description) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, url, description, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PrintPDFRequest {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
        private String version;
        private String title;
        private String url;
        private String description;

        private Builder() {}

        @JsonProperty("@version")

        public Builder withVersion(String version) {
            this.version = version;
            return this;
        }


        @JsonProperty("title")

        public Builder withTitle(String title) {
            this.title = title;
            return this;
        }


        @JsonProperty("url")

        public Builder withUrl(String url) {
            this.url = url;
            return this;
        }


        @JsonProperty("description")

        public Builder withDescription(String description) {
            this.description = description;
            return this;
        }


        public PrintPDFRequest build() {
            return new PrintPDFRequest(this);
        }
    }
}

