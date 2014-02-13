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

package com.microsoft.windowsazure.management.storage.models;

import java.net.URI;
import java.util.ArrayList;
import java.util.Calendar;

/**
 * Details about a storage account.
 */
public class StorageServiceProperties {
    private String affinityGroup;

    /**
     * The affinity group with which this storage account is associated.
     * 
     * @return The AffinityGroup value.
     */
    public String getAffinityGroup() {
        return this.affinityGroup;
    }

    /**
     * The affinity group with which this storage account is associated.
     * 
     * @param affinityGroupValue
     *            The AffinityGroup value.
     */
    public void setAffinityGroup(final String affinityGroupValue) {
        this.affinityGroup = affinityGroupValue;
    }

    private String description;

    /**
     * The user supplied description of the storage account.
     * 
     * @return The Description value.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * The user supplied description of the storage account.
     * 
     * @param descriptionValue
     *            The Description value.
     */
    public void setDescription(final String descriptionValue) {
        this.description = descriptionValue;
    }

    private ArrayList<URI> endpoints;

    /**
     * The URLs that are used to perform a retrieval of a public blob, queue, or
     * table object.
     * 
     * @return The Endpoints value.
     */
    public ArrayList<URI> getEndpoints() {
        return this.endpoints;
    }

    /**
     * The URLs that are used to perform a retrieval of a public blob, queue, or
     * table object.
     * 
     * @param endpointsValue
     *            The Endpoints value.
     */
    public void setEndpoints(final ArrayList<URI> endpointsValue) {
        this.endpoints = endpointsValue;
    }

    private String geoPrimaryRegion;

    /**
     * Indicates the primary geographical region in which the storage account
     * exists at this time.
     * 
     * @return The GeoPrimaryRegion value.
     */
    public String getGeoPrimaryRegion() {
        return this.geoPrimaryRegion;
    }

    /**
     * Indicates the primary geographical region in which the storage account
     * exists at this time.
     * 
     * @param geoPrimaryRegionValue
     *            The GeoPrimaryRegion value.
     */
    public void setGeoPrimaryRegion(final String geoPrimaryRegionValue) {
        this.geoPrimaryRegion = geoPrimaryRegionValue;
    }

    private boolean geoReplicationEnabled;

    /**
     * Indicates whether the data in the storage account is replicated across
     * more than one geographic location so as to enable resilience in the face
     * of catastrophic service loss. The value is true if geo-replication is
     * enabled; otherwise false.
     * 
     * @return The GeoReplicationEnabled value.
     */
    public boolean isGeoReplicationEnabled() {
        return this.geoReplicationEnabled;
    }

    /**
     * Indicates whether the data in the storage account is replicated across
     * more than one geographic location so as to enable resilience in the face
     * of catastrophic service loss. The value is true if geo-replication is
     * enabled; otherwise false.
     * 
     * @param geoReplicationEnabledValue
     *            The GeoReplicationEnabled value.
     */
    public void setGeoReplicationEnabled(
            final boolean geoReplicationEnabledValue) {
        this.geoReplicationEnabled = geoReplicationEnabledValue;
    }

    private String geoSecondaryRegion;

    /**
     * Indicates the geographical region in which the storage account is being
     * replicated. The GeoSecondaryRegion element is not returned if
     * geo-replication is “off” for this account.
     * 
     * @return The GeoSecondaryRegion value.
     */
    public String getGeoSecondaryRegion() {
        return this.geoSecondaryRegion;
    }

    /**
     * Indicates the geographical region in which the storage account is being
     * replicated. The GeoSecondaryRegion element is not returned if
     * geo-replication is “off” for this account.
     * 
     * @param geoSecondaryRegionValue
     *            The GeoSecondaryRegion value.
     */
    public void setGeoSecondaryRegion(final String geoSecondaryRegionValue) {
        this.geoSecondaryRegion = geoSecondaryRegionValue;
    }

    private String label;

    /**
     * The user supplied name of the storage account returned as a base-64
     * encoded string. This name can be used identify the storage account for
     * your tracking purposes.
     * 
     * @return The Label value.
     */
    public String getLabel() {
        return this.label;
    }

    /**
     * The user supplied name of the storage account returned as a base-64
     * encoded string. This name can be used identify the storage account for
     * your tracking purposes.
     * 
     * @param labelValue
     *            The Label value.
     */
    public void setLabel(final String labelValue) {
        this.label = labelValue;
    }

    private Calendar lastGeoFailoverTime;

    /**
     * A timestamp that indicates the most recent instance of a failover to the
     * secondary region. In case of multiple failovers only the latest failover
     * date and time maintained. The format of the returned timestamp is:
     * [4DigitYear]-[2DigitMonth]-[2DigitDay]T[2DigitMinute]:[2DigitSecond]:[7D
     * igitsOfPrecision]Z. LastGeoFailoverTime is not returned if there has not
     * been an instance of a failover.
     * 
     * @return The LastGeoFailoverTime value.
     */
    public Calendar getLastGeoFailoverTime() {
        return this.lastGeoFailoverTime;
    }

    /**
     * A timestamp that indicates the most recent instance of a failover to the
     * secondary region. In case of multiple failovers only the latest failover
     * date and time maintained. The format of the returned timestamp is:
     * [4DigitYear]-[2DigitMonth]-[2DigitDay]T[2DigitMinute]:[2DigitSecond]:[7D
     * igitsOfPrecision]Z. LastGeoFailoverTime is not returned if there has not
     * been an instance of a failover.
     * 
     * @param lastGeoFailoverTimeValue
     *            The LastGeoFailoverTime value.
     */
    public void setLastGeoFailoverTime(final Calendar lastGeoFailoverTimeValue) {
        this.lastGeoFailoverTime = lastGeoFailoverTimeValue;
    }

    private String location;

    /**
     * The geo-location specified when the storage account was created. This
     * property is only returned if the storage account is not associated with
     * an affinity group.
     * 
     * @return The Location value.
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * The geo-location specified when the storage account was created. This
     * property is only returned if the storage account is not associated with
     * an affinity group.
     * 
     * @param locationValue
     *            The Location value.
     */
    public void setLocation(final String locationValue) {
        this.location = locationValue;
    }

    private StorageServiceStatus status;

    /**
     * The status of the storage account at the time the operation was called.
     * 
     * @return The Status value.
     */
    public StorageServiceStatus getStatus() {
        return this.status;
    }

    /**
     * The status of the storage account at the time the operation was called.
     * 
     * @param statusValue
     *            The Status value.
     */
    public void setStatus(final StorageServiceStatus statusValue) {
        this.status = statusValue;
    }

    private GeoRegionStatus statusOfGeoPrimaryRegion;

    /**
     * Indicates whether the primary storage region is available.
     * 
     * @return The StatusOfGeoPrimaryRegion value.
     */
    public GeoRegionStatus getStatusOfGeoPrimaryRegion() {
        return this.statusOfGeoPrimaryRegion;
    }

    /**
     * Indicates whether the primary storage region is available.
     * 
     * @param statusOfGeoPrimaryRegionValue
     *            The StatusOfGeoPrimaryRegion value.
     */
    public void setStatusOfGeoPrimaryRegion(
            final GeoRegionStatus statusOfGeoPrimaryRegionValue) {
        this.statusOfGeoPrimaryRegion = statusOfGeoPrimaryRegionValue;
    }

    private GeoRegionStatus statusOfGeoSecondaryRegion;

    /**
     * Indicates whether the secondary storage region is available.
     * 
     * @return The StatusOfGeoSecondaryRegion value.
     */
    public GeoRegionStatus getStatusOfGeoSecondaryRegion() {
        return this.statusOfGeoSecondaryRegion;
    }

    /**
     * Indicates whether the secondary storage region is available.
     * 
     * @param statusOfGeoSecondaryRegionValue
     *            The StatusOfGeoSecondaryRegion value.
     */
    public void setStatusOfGeoSecondaryRegion(
            final GeoRegionStatus statusOfGeoSecondaryRegionValue) {
        this.statusOfGeoSecondaryRegion = statusOfGeoSecondaryRegionValue;
    }

    /**
     * Initializes a new instance of the StorageServiceProperties class.
     * 
     */
    public StorageServiceProperties() {
        this.endpoints = new ArrayList<URI>();
    }
}
