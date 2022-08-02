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


package com.amazon.ask.smapi.model.v1.skill.asr.annotationSets;

import java.util.Objects;
import java.math.BigDecimal;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A single test case that describes the audio reference, expected transcriptions, test case weight etc. Each annotation object must have at least expectedTranscription or, uploadId and filePathInUpload in pair. In any case, filePathInUpload and uploadId must be present or missing in pair.
 */

@JsonDeserialize(builder = Annotation.Builder.class)
public final class Annotation {

    @JsonProperty("uploadId")
    private String uploadId = null;

    @JsonProperty("filePathInUpload")
    private String filePathInUpload = null;

    @JsonProperty("evaluationWeight")
    private BigDecimal evaluationWeight = null;

    @JsonProperty("expectedTranscription")
    private String expectedTranscription = null;

    private Annotation() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private Annotation(Builder builder) {
        if (builder.uploadId != null) {
            this.uploadId = builder.uploadId;
        }
        if (builder.filePathInUpload != null) {
            this.filePathInUpload = builder.filePathInUpload;
        }
        if (builder.evaluationWeight != null) {
            this.evaluationWeight = builder.evaluationWeight;
        }
        if (builder.expectedTranscription != null) {
            this.expectedTranscription = builder.expectedTranscription;
        }
    }

    /**
     * Upload id obtained when developer creates an upload using catalog API. Required to be present when expectedTranscription is missing. When uploadId is present, filePathInUpload must also be present.
     * @return uploadId
    **/
    @JsonProperty("uploadId")
    public String getUploadId() {
        return uploadId;
    }


    /**
     * File path in the uploaded zip file. For example, a zip containing a folder named 'a' and there is an audio b.mp3 in that folder. The file path is a/b.mp3. Notice that forward slash ('/') should be used to concatenate directories. Required to be present when expectedTranscription is missing. When filePathInUpload is present, uploadId must also be present.
     * @return filePathInUpload
    **/
    @JsonProperty("filePathInUpload")
    public String getFilePathInUpload() {
        return filePathInUpload;
    }


    /**
     * Weight of the test case in an evaluation, the value would be used for calculating metrics such as overall error rate.  The acceptable values are from 1 - 1000. 1 means least significant, 1000 means mot significant. Here is how weight  impact the `OVERALL_ERROR_RATE` calculation: For example, an annotation set consists of 3 annotations and they have weight of 8, 1, 1. The evaluation results  show that only the first annotation test case passed while the rest of the test cases failed. In this case,  the overall error rate is (8 / (8 + 1 + 1)) = 0.8 
     * minimum: 1
     * maximum: 1000
     * @return evaluationWeight
    **/
    @JsonProperty("evaluationWeight")
    public BigDecimal getEvaluationWeight() {
        return evaluationWeight;
    }


    /**
     * Expected transcription text for the input audio. The acceptable length of the string is between 1 and 500 Unicode characters. Required to be present when uploadId and filePathInUpload are missing.
     * @return expectedTranscription
    **/
    @JsonProperty("expectedTranscription")
    public String getExpectedTranscription() {
        return expectedTranscription;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Annotation v1SkillAsrAnnotationSetsAnnotation = (Annotation) o;
        return Objects.equals(this.uploadId, v1SkillAsrAnnotationSetsAnnotation.uploadId) &&
            Objects.equals(this.filePathInUpload, v1SkillAsrAnnotationSetsAnnotation.filePathInUpload) &&
            Objects.equals(this.evaluationWeight, v1SkillAsrAnnotationSetsAnnotation.evaluationWeight) &&
            Objects.equals(this.expectedTranscription, v1SkillAsrAnnotationSetsAnnotation.expectedTranscription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uploadId, filePathInUpload, evaluationWeight, expectedTranscription);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Annotation {\n");
        
        sb.append("    uploadId: ").append(toIndentedString(uploadId)).append("\n");
        sb.append("    filePathInUpload: ").append(toIndentedString(filePathInUpload)).append("\n");
        sb.append("    evaluationWeight: ").append(toIndentedString(evaluationWeight)).append("\n");
        sb.append("    expectedTranscription: ").append(toIndentedString(expectedTranscription)).append("\n");
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
        private String uploadId;
        private String filePathInUpload;
        private BigDecimal evaluationWeight;
        private String expectedTranscription;

        private Builder() {}

        @JsonProperty("uploadId")

        public Builder withUploadId(String uploadId) {
            this.uploadId = uploadId;
            return this;
        }


        @JsonProperty("filePathInUpload")

        public Builder withFilePathInUpload(String filePathInUpload) {
            this.filePathInUpload = filePathInUpload;
            return this;
        }


        @JsonProperty("evaluationWeight")

        public Builder withEvaluationWeight(BigDecimal evaluationWeight) {
            this.evaluationWeight = evaluationWeight;
            return this;
        }


        @JsonProperty("expectedTranscription")

        public Builder withExpectedTranscription(String expectedTranscription) {
            this.expectedTranscription = expectedTranscription;
            return this;
        }


        public Annotation build() {
            return new Annotation(this);
        }
    }
}

