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

package com.microsoft.azure.management.resources.models;

import com.microsoft.windowsazure.core.OperationResponse;

/**
* Information from validate template deployment response.
*/
public class DeploymentValidateResponse extends OperationResponse {
    private ResourceManagementErrorWithDetails error;
    
    /**
    * Optional. Gets or sets validation error.
    * @return The Error value.
    */
    public ResourceManagementErrorWithDetails getError() {
        return this.error;
    }
    
    /**
    * Optional. Gets or sets validation error.
    * @param errorValue The Error value.
    */
    public void setError(final ResourceManagementErrorWithDetails errorValue) {
        this.error = errorValue;
    }
    
    private boolean isValid;
    
    /**
    * Optional. Gets or sets the value indicating whether the template is valid
    * or not.
    * @return The IsValid value.
    */
    public boolean isValid() {
        return this.isValid;
    }
    
    /**
    * Optional. Gets or sets the value indicating whether the template is valid
    * or not.
    * @param isValidValue The IsValid value.
    */
    public void setIsValid(final boolean isValidValue) {
        this.isValid = isValidValue;
    }
}
