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

package com.microsoft.windowsazure.management.sql.models;

/**
 * Parameters supplied to the Create Server operation.
 */
public class ServerCreateParameters {
    private String administratorPassword;

    /**
     * Gets or sets the administrator password.
     * 
     * @return The AdministratorPassword value.
     */
    public String getAdministratorPassword() {
        return this.administratorPassword;
    }

    /**
     * Gets or sets the administrator password.
     * 
     * @param administratorPasswordValue
     *            The AdministratorPassword value.
     */
    public void setAdministratorPassword(final String administratorPasswordValue) {
        this.administratorPassword = administratorPasswordValue;
    }

    private String administratorUserName;

    /**
     * Gets or sets the administrator username.
     * 
     * @return The AdministratorUserName value.
     */
    public String getAdministratorUserName() {
        return this.administratorUserName;
    }

    /**
     * Gets or sets the administrator username.
     * 
     * @param administratorUserNameValue
     *            The AdministratorUserName value.
     */
    public void setAdministratorUserName(final String administratorUserNameValue) {
        this.administratorUserName = administratorUserNameValue;
    }

    private String location;

    /**
     * Gets or sets the region in which this server will be created.
     * 
     * @return The Location value.
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * Gets or sets the region in which this server will be created.
     * 
     * @param locationValue
     *            The Location value.
     */
    public void setLocation(final String locationValue) {
        this.location = locationValue;
    }
}
