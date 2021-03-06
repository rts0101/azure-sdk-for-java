/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.loganalytics.v2020_03_01_preview.implementation;

import com.microsoft.azure.management.loganalytics.v2020_03_01_preview.WorkspacePurgeResponse;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;

class WorkspacePurgeResponseImpl extends WrapperImpl<WorkspacePurgeResponseInner> implements WorkspacePurgeResponse {
    private final LogAnalyticsManager manager;
    WorkspacePurgeResponseImpl(WorkspacePurgeResponseInner inner, LogAnalyticsManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public LogAnalyticsManager manager() {
        return this.manager;
    }

    @Override
    public String operationId() {
        return this.inner().operationId();
    }

}
