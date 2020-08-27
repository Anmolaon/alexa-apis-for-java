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


package com.amazon.ask.smapi.model.v1;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Error
 */

@JsonDeserialize(builder = Error.Builder.class)
public class Error {

    @JsonProperty("code")
    private String code = null;

    @JsonProperty("message")
    private String message = null;

    protected Error(Builder builder) {
        if (builder.code != null) {
            this.code = builder.code;
        }
        if (builder.message != null) {
            this.message = builder.message;
        }
    }

    /**
     * Error code that maps to an error message. Developers with different locales should be able to lookup the error description based on this code. 
     * @return code
    **/
    @JsonProperty("code")
    public String getCode() {
        return code;
    }


    /**
     * Readable description of error. If standardized, this is generated from the error code and validation details.
     * @return message
    **/
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Error v1Error = (Error) o;
        return Objects.equals(this.code, v1Error.code) &&
            Objects.equals(this.message, v1Error.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, message);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Error {\n");
        
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
  
    public static class Builder<T extends Builder<T>> {
        private String code;
        private String message;

        protected Builder() {}


        @JsonProperty("code")
        public T withCode(String code) {
            this.code = code;
            return (T)this;
        }



        @JsonProperty("message")
        public T withMessage(String message) {
            this.message = message;
            return (T)this;
        }

    }
}

