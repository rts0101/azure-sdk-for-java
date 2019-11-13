/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2019_03_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Specifies the Linux operating system settings on the virtual machine.
 * &lt;br&gt;&lt;br&gt;For a list of supported Linux distributions, see [Linux
 * on Azure-Endorsed
 * Distributions](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-linux-endorsed-distros?toc=%2fazure%2fvirtual-machines%2flinux%2ftoc.json)
 * &lt;br&gt;&lt;br&gt; For running non-endorsed distributions, see
 * [Information for Non-Endorsed
 * Distributions](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-linux-create-upload-generic?toc=%2fazure%2fvirtual-machines%2flinux%2ftoc.json).
 */
public class LinuxConfiguration {
    /**
     * Specifies whether password authentication should be disabled.
     */
    @JsonProperty(value = "disablePasswordAuthentication")
    private Boolean disablePasswordAuthentication;

    /**
     * Specifies the ssh key configuration for a Linux OS.
     */
    @JsonProperty(value = "ssh")
    private SshConfiguration ssh;

    /**
     * Indicates whether virtual machine agent should be provisioned on the
     * virtual machine. &lt;br&gt;&lt;br&gt; When this property is not
     * specified in the request body, default behavior is to set it to true.
     * This will ensure that VM Agent is installed on the VM so that extensions
     * can be added to the VM later.
     */
    @JsonProperty(value = "provisionVMAgent")
    private Boolean provisionVMAgent;

    /**
     * Get specifies whether password authentication should be disabled.
     *
     * @return the disablePasswordAuthentication value
     */
    public Boolean disablePasswordAuthentication() {
        return this.disablePasswordAuthentication;
    }

    /**
     * Set specifies whether password authentication should be disabled.
     *
     * @param disablePasswordAuthentication the disablePasswordAuthentication value to set
     * @return the LinuxConfiguration object itself.
     */
    public LinuxConfiguration withDisablePasswordAuthentication(Boolean disablePasswordAuthentication) {
        this.disablePasswordAuthentication = disablePasswordAuthentication;
        return this;
    }

    /**
     * Get specifies the ssh key configuration for a Linux OS.
     *
     * @return the ssh value
     */
    public SshConfiguration ssh() {
        return this.ssh;
    }

    /**
     * Set specifies the ssh key configuration for a Linux OS.
     *
     * @param ssh the ssh value to set
     * @return the LinuxConfiguration object itself.
     */
    public LinuxConfiguration withSsh(SshConfiguration ssh) {
        this.ssh = ssh;
        return this;
    }

    /**
     * Get indicates whether virtual machine agent should be provisioned on the virtual machine. &lt;br&gt;&lt;br&gt; When this property is not specified in the request body, default behavior is to set it to true.  This will ensure that VM Agent is installed on the VM so that extensions can be added to the VM later.
     *
     * @return the provisionVMAgent value
     */
    public Boolean provisionVMAgent() {
        return this.provisionVMAgent;
    }

    /**
     * Set indicates whether virtual machine agent should be provisioned on the virtual machine. &lt;br&gt;&lt;br&gt; When this property is not specified in the request body, default behavior is to set it to true.  This will ensure that VM Agent is installed on the VM so that extensions can be added to the VM later.
     *
     * @param provisionVMAgent the provisionVMAgent value to set
     * @return the LinuxConfiguration object itself.
     */
    public LinuxConfiguration withProvisionVMAgent(Boolean provisionVMAgent) {
        this.provisionVMAgent = provisionVMAgent;
        return this;
    }

}
