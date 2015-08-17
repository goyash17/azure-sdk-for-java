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

package com.microsoft.azure.management.network.models;

/**
* Response for PutVirtualNetworks API service calls.
*/
public class VirtualNetworkPutResponse extends UpdateOperationResponse {
    private VirtualNetwork virtualNetwork;
    
    /**
    * Optional. Gets a  VirtualNetwork in a resource group
    * @return The VirtualNetwork value.
    */
    public VirtualNetwork getVirtualNetwork() {
        return this.virtualNetwork;
    }
    
    /**
    * Optional. Gets a  VirtualNetwork in a resource group
    * @param virtualNetworkValue The VirtualNetwork value.
    */
    public void setVirtualNetwork(final VirtualNetwork virtualNetworkValue) {
        this.virtualNetwork = virtualNetworkValue;
    }
}
