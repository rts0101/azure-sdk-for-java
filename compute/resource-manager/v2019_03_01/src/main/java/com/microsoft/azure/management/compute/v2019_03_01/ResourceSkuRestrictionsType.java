/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2019_03_01;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for ResourceSkuRestrictionsType.
 */
public enum ResourceSkuRestrictionsType {
    /** Enum value Location. */
    LOCATION("Location"),

    /** Enum value Zone. */
    ZONE("Zone");

    /** The actual serialized value for a ResourceSkuRestrictionsType instance. */
    private String value;

    ResourceSkuRestrictionsType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ResourceSkuRestrictionsType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed ResourceSkuRestrictionsType object, or null if unable to parse.
     */
    @JsonCreator
    public static ResourceSkuRestrictionsType fromString(String value) {
        ResourceSkuRestrictionsType[] items = ResourceSkuRestrictionsType.values();
        for (ResourceSkuRestrictionsType item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
