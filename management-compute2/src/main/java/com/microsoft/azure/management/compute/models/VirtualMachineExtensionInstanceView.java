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

package com.microsoft.azure.management.compute.models;

import com.microsoft.windowsazure.core.LazyArrayList;
import java.util.ArrayList;

/**
* The instance view of a virtual machine extension.
*/
public class VirtualMachineExtensionInstanceView extends ResourceInstanceView {
    private String extensionType;
    
    /**
    * Optional. Gets or sets the full type of the extension handler which
    * includes both publisher and type.
    * @return The ExtensionType value.
    */
    public String getExtensionType() {
        return this.extensionType;
    }
    
    /**
    * Optional. Gets or sets the full type of the extension handler which
    * includes both publisher and type.
    * @param extensionTypeValue The ExtensionType value.
    */
    public void setExtensionType(final String extensionTypeValue) {
        this.extensionType = extensionTypeValue;
    }
    
    private String name;
    
    /**
    * Optional. Gets or sets the virtual machine extension name.
    * @return The Name value.
    */
    public String getName() {
        return this.name;
    }
    
    /**
    * Optional. Gets or sets the virtual machine extension name.
    * @param nameValue The Name value.
    */
    public void setName(final String nameValue) {
        this.name = nameValue;
    }
    
    private ArrayList<InstanceViewStatus> subStatuses;
    
    /**
    * Optional. Gets or sets the resource status information.
    * @return The SubStatuses value.
    */
    public ArrayList<InstanceViewStatus> getSubStatuses() {
        return this.subStatuses;
    }
    
    /**
    * Optional. Gets or sets the resource status information.
    * @param subStatusesValue The SubStatuses value.
    */
    public void setSubStatuses(final ArrayList<InstanceViewStatus> subStatusesValue) {
        this.subStatuses = subStatusesValue;
    }
    
    private String typeHandlerVersion;
    
    /**
    * Optional. Gets or sets the type version of the extension handler.
    * @return The TypeHandlerVersion value.
    */
    public String getTypeHandlerVersion() {
        return this.typeHandlerVersion;
    }
    
    /**
    * Optional. Gets or sets the type version of the extension handler.
    * @param typeHandlerVersionValue The TypeHandlerVersion value.
    */
    public void setTypeHandlerVersion(final String typeHandlerVersionValue) {
        this.typeHandlerVersion = typeHandlerVersionValue;
    }
    
    /**
    * Initializes a new instance of the VirtualMachineExtensionInstanceView
    * class.
    *
    */
    public VirtualMachineExtensionInstanceView() {
        super();
        this.setSubStatuses(new LazyArrayList<InstanceViewStatus>());
    }
}
