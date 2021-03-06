/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerinstance.v2019_12_01.implementation;

import com.microsoft.azure.management.containerinstance.v2019_12_01.Usage;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import rx.Observable;
import com.microsoft.azure.management.containerinstance.v2019_12_01.UsageName;

class UsageImpl extends WrapperImpl<UsageInner> implements Usage {
    private final ContainerInstanceManager manager;

    UsageImpl(UsageInner inner,  ContainerInstanceManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public ContainerInstanceManager manager() {
        return this.manager;
    }



    @Override
    public Integer currentValue() {
        return this.inner().currentValue();
    }

    @Override
    public Integer limit() {
        return this.inner().limit();
    }

    @Override
    public UsageName name() {
        return this.inner().name();
    }

    @Override
    public String unit() {
        return this.inner().unit();
    }

}
