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

import com.microsoft.windowsazure.core.OperationResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/**
 * The response structure for the Server List operation.
 */
public class ServerListResponse extends OperationResponse implements
        Iterable<ServerListResponse.Server> {
    private ArrayList<ServerListResponse.Server> servers;

    /**
     * Gets or sets the SQL Servers that are valid for your subscription.
     * 
     * @return The Servers value.
     */
    public ArrayList<ServerListResponse.Server> getServers() {
        return this.servers;
    }

    /**
     * Gets or sets the SQL Servers that are valid for your subscription.
     * 
     * @param serversValue
     *            The Servers value.
     */
    public void setServers(
            final ArrayList<ServerListResponse.Server> serversValue) {
        this.servers = serversValue;
    }

    /**
     * Initializes a new instance of the ServerListResponse class.
     * 
     */
    public ServerListResponse() {
        super();
        this.servers = new ArrayList<ServerListResponse.Server>();
    }

    /**
     * Gets the sequence of Servers.
     * 
     */
    public Iterator<ServerListResponse.Server> iterator() {
        return this.getServers().iterator();
    }

    /**
     * An individual server in your Windows Azure subscription.
     */
    public static class Server {
        private String administratorUserName;

        /**
         * Gets or sets the name of an administrator for this server.
         * 
         * @return The AdministratorUserName value.
         */
        public String getAdministratorUserName() {
            return this.administratorUserName;
        }

        /**
         * Gets or sets the name of an administrator for this server.
         * 
         * @param administratorUserNameValue
         *            The AdministratorUserName value.
         */
        public void setAdministratorUserName(
                final String administratorUserNameValue) {
            this.administratorUserName = administratorUserNameValue;
        }

        private HashMap<String, String> features;

        /**
         * Gets or sets the list of features and the type of database server for
         * an individual server.
         * 
         * @return The Features value.
         */
        public HashMap<String, String> getFeatures() {
            return this.features;
        }

        /**
         * Gets or sets the list of features and the type of database server for
         * an individual server.
         * 
         * @param featuresValue
         *            The Features value.
         */
        public void setFeatures(final HashMap<String, String> featuresValue) {
            this.features = featuresValue;
        }

        private String location;

        /**
         * Gets or sets the name of a data center location that is valid for
         * your subscription.
         * 
         * @return The Location value.
         */
        public String getLocation() {
            return this.location;
        }

        /**
         * Gets or sets the name of a data center location that is valid for
         * your subscription.
         * 
         * @param locationValue
         *            The Location value.
         */
        public void setLocation(final String locationValue) {
            this.location = locationValue;
        }

        private String name;

        /**
         * Gets or sets the name of a SQL Server running in your subscription.
         * 
         * @return The Name value.
         */
        public String getName() {
            return this.name;
        }

        /**
         * Gets or sets the name of a SQL Server running in your subscription.
         * 
         * @param nameValue
         *            The Name value.
         */
        public void setName(final String nameValue) {
            this.name = nameValue;
        }

        /**
         * Initializes a new instance of the Server class.
         * 
         */
        public Server() {
            this.features = new HashMap<String, String>();
        }
    }
}
