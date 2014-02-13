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

package com.microsoft.windowsazure.management.websites.models;

import com.microsoft.windowsazure.core.OperationResponse;

/**
 * The Get DNS Suffix operation response.
 */
public class WebSpacesGetDnsSuffixResponse extends OperationResponse {
    private String dnsSuffix;

    /**
     * The DNS Suffix used for the web space.
     * 
     * @return The DnsSuffix value.
     */
    public String getDnsSuffix() {
        return this.dnsSuffix;
    }

    /**
     * The DNS Suffix used for the web space.
     * 
     * @param dnsSuffixValue
     *            The DnsSuffix value.
     */
    public void setDnsSuffix(final String dnsSuffixValue) {
        this.dnsSuffix = dnsSuffixValue;
    }
}
