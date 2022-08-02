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


package com.amazon.ask.smapi.model.v1.skill.nlu.evaluations;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Use Annotation Set as evaluation source 
 */

@JsonDeserialize(builder = Source.Builder.class)
public final class Source {

    @JsonProperty("annotationId")
    private String annotationId = null;

    private Source() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private Source(Builder builder) {
        if (builder.annotationId != null) {
            this.annotationId = builder.annotationId;
        }
    }

    /**
     * ID of the annotation set
     * @return annotationId
    **/
    @JsonProperty("annotationId")
    public String getAnnotationId() {
        return annotationId;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Source v1SkillNluEvaluationsSource = (Source) o;
        return Objects.equals(this.annotationId, v1SkillNluEvaluationsSource.annotationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(annotationId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Source {\n");
        
        sb.append("    annotationId: ").append(toIndentedString(annotationId)).append("\n");
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
        private String annotationId;

        private Builder() {}

        @JsonProperty("annotationId")

        public Builder withAnnotationId(String annotationId) {
            this.annotationId = annotationId;
            return this;
        }


        public Source build() {
            return new Source(this);
        }
    }
}

