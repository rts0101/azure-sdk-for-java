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

package com.microsoft.windowsazure.management.scheduler.models;

import com.microsoft.windowsazure.core.OperationResponse;
import java.util.HashMap;

/**
 * The Resource Provider Get Properties operation response.
 */
public class ResourceProviderGetPropertiesResponse extends OperationResponse {
    private HashMap<String, String> properties;

    /**
     * @return The Properties value.
     */
    public HashMap<String, String> getProperties() {
        return this.properties;
    }

    /**
     * @param propertiesValue
     *            The Properties value.
     */
    public void setProperties(final HashMap<String, String> propertiesValue) {
        this.properties = propertiesValue;
    }

    /**
     * Initializes a new instance of the ResourceProviderGetPropertiesResponse
     * class.
     * 
     */
    public ResourceProviderGetPropertiesResponse() {
        super();
        this.properties = new HashMap<String, String>();
    }
}
