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
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A description of an error in APL functionality.
 */

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true )
@JsonSubTypes({
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.alexa.presentation.apl.ListRuntimeError.class, name = "LIST_ERROR"),
})
public abstract class RuntimeError {

    protected String type = null;

    @JsonProperty("message")
    protected String message = null;

    @JsonProperty("token")
    protected String token = null;

    protected RuntimeError() {
    }

    /**
     * Defines the error type and dictates which properties must/can be included.
     * @return type
    **/
    @JsonIgnore
    public String getType() {
        return type;
    }


    /**
     * A human-readable description of the error.
     * @return message
    **/
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }


    /**
     * The token as specified in the presentation's RenderDocument directive.
     * @return token
    **/
    @JsonProperty("token")
    public String getToken() {
        return token;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RuntimeError interfacesAlexaPresentationAplRuntimeError = (RuntimeError) o;
        return Objects.equals(this.type, interfacesAlexaPresentationAplRuntimeError.type) &&
            Objects.equals(this.message, interfacesAlexaPresentationAplRuntimeError.message) &&
            Objects.equals(this.token, interfacesAlexaPresentationAplRuntimeError.token);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, message, token);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RuntimeError {\n");
        
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    token: ").append(toIndentedString(token)).append("\n");
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
  
}

