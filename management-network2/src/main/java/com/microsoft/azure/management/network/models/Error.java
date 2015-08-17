/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.azure.management.network.models;

import com.microsoft.windowsazure.core.LazyArrayList;
import java.util.ArrayList;

public class Error {
    private String code;
    
    /**
    * Optional.
    * @return The Code value.
    */
    public String getCode() {
        return this.code;
    }
    
    /**
    * Optional.
    * @param codeValue The Code value.
    */
    public void setCode(final String codeValue) {
        this.code = codeValue;
    }
    
    private ArrayList<ErrorDetails> details;
    
    /**
    * Optional.
    * @return The Details value.
    */
    public ArrayList<ErrorDetails> getDetails() {
        return this.details;
    }
    
    /**
    * Optional.
    * @param detailsValue The Details value.
    */
    public void setDetails(final ArrayList<ErrorDetails> detailsValue) {
        this.details = detailsValue;
    }
    
    private String innerError;
    
    /**
    * Optional.
    * @return The InnerError value.
    */
    public String getInnerError() {
        return this.innerError;
    }
    
    /**
    * Optional.
    * @param innerErrorValue The InnerError value.
    */
    public void setInnerError(final String innerErrorValue) {
        this.innerError = innerErrorValue;
    }
    
    private String message;
    
    /**
    * Optional.
    * @return The Message value.
    */
    public String getMessage() {
        return this.message;
    }
    
    /**
    * Optional.
    * @param messageValue The Message value.
    */
    public void setMessage(final String messageValue) {
        this.message = messageValue;
    }
    
    private String target;
    
    /**
    * Optional.
    * @return The Target value.
    */
    public String getTarget() {
        return this.target;
    }
    
    /**
    * Optional.
    * @param targetValue The Target value.
    */
    public void setTarget(final String targetValue) {
        this.target = targetValue;
    }
    
    /**
    * Initializes a new instance of the Error class.
    *
    */
    public Error() {
        this.setDetails(new LazyArrayList<ErrorDetails>());
    }
}
