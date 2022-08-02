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


package com.amazon.ask.smapi.model.v1.skill.interactionModel.conflictDetection;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PagedResponse
 */

@JsonDeserialize(builder = PagedResponse.Builder.class)
public final class PagedResponse {

    @JsonProperty("paginationContext")
    private com.amazon.ask.smapi.model.v1.skill.interactionModel.conflictDetection.PaginationContext paginationContext = null;

    @JsonProperty("_links")
    private com.amazon.ask.smapi.model.v1.Links links = null;

    private PagedResponse() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private PagedResponse(Builder builder) {
        if (builder.paginationContext != null) {
            this.paginationContext = builder.paginationContext;
        }
        if (builder.links != null) {
            this.links = builder.links;
        }
    }

    /**
     * Get paginationContext
     * @return paginationContext
    **/
    @JsonProperty("paginationContext")
    public com.amazon.ask.smapi.model.v1.skill.interactionModel.conflictDetection.PaginationContext getPaginationContext() {
        return paginationContext;
    }


    /**
     * Get links
     * @return links
    **/
    @JsonProperty("_links")
    public com.amazon.ask.smapi.model.v1.Links getLinks() {
        return links;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PagedResponse v1SkillInteractionModelConflictDetectionPagedResponse = (PagedResponse) o;
        return Objects.equals(this.paginationContext, v1SkillInteractionModelConflictDetectionPagedResponse.paginationContext) &&
            Objects.equals(this.links, v1SkillInteractionModelConflictDetectionPagedResponse.links);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paginationContext, links);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PagedResponse {\n");
        
        sb.append("    paginationContext: ").append(toIndentedString(paginationContext)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
        private com.amazon.ask.smapi.model.v1.skill.interactionModel.conflictDetection.PaginationContext paginationContext;
        private com.amazon.ask.smapi.model.v1.Links links;

        private Builder() {}

        @JsonProperty("paginationContext")

        public Builder withPaginationContext(com.amazon.ask.smapi.model.v1.skill.interactionModel.conflictDetection.PaginationContext paginationContext) {
            this.paginationContext = paginationContext;
            return this;
        }


        @JsonProperty("_links")

        public Builder withLinks(com.amazon.ask.smapi.model.v1.Links links) {
            this.links = links;
            return this;
        }


        public PagedResponse build() {
            return new PagedResponse(this);
        }
    }
}

