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


package com.amazon.ask.smapi.model.v1.skill.interactionModel.catalog;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Definition for catalog entity.
 */

@JsonDeserialize(builder = CatalogItem.Builder.class)
public final class CatalogItem {

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("description")
    private String description = null;

    @JsonProperty("catalogId")
    private String catalogId = null;

    @JsonProperty("_links")
    private com.amazon.ask.smapi.model.v1.Links links = null;

    private CatalogItem() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private CatalogItem(Builder builder) {
        if (builder.name != null) {
            this.name = builder.name;
        }
        if (builder.description != null) {
            this.description = builder.description;
        }
        if (builder.catalogId != null) {
            this.catalogId = builder.catalogId;
        }
        if (builder.links != null) {
            this.links = builder.links;
        }
    }

    /**
     * Name of the catalog.
     * @return name
    **/
    @JsonProperty("name")
    public String getName() {
        return name;
    }


    /**
     * Description string about the catalog.
     * @return description
    **/
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }


    /**
     * Identifier of the catalog, optional in get response as the request already has catalogId.
     * @return catalogId
    **/
    @JsonProperty("catalogId")
    public String getCatalogId() {
        return catalogId;
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
        CatalogItem v1SkillInteractionModelCatalogCatalogItem = (CatalogItem) o;
        return Objects.equals(this.name, v1SkillInteractionModelCatalogCatalogItem.name) &&
            Objects.equals(this.description, v1SkillInteractionModelCatalogCatalogItem.description) &&
            Objects.equals(this.catalogId, v1SkillInteractionModelCatalogCatalogItem.catalogId) &&
            Objects.equals(this.links, v1SkillInteractionModelCatalogCatalogItem.links);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, catalogId, links);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CatalogItem {\n");
        
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
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
        private String name;
        private String description;
        private String catalogId;
        private com.amazon.ask.smapi.model.v1.Links links;

        private Builder() {}

        @JsonProperty("name")

        public Builder withName(String name) {
            this.name = name;
            return this;
        }


        @JsonProperty("description")

        public Builder withDescription(String description) {
            this.description = description;
            return this;
        }


        @JsonProperty("catalogId")

        public Builder withCatalogId(String catalogId) {
            this.catalogId = catalogId;
            return this;
        }


        @JsonProperty("_links")

        public Builder withLinks(com.amazon.ask.smapi.model.v1.Links links) {
            this.links = links;
            return this;
        }


        public CatalogItem build() {
            return new CatalogItem(this);
        }
    }
}

