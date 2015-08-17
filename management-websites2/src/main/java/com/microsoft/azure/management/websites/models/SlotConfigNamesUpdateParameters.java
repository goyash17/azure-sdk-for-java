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

package com.microsoft.azure.management.websites.models;

/**
* The Update slot configs parameters.
*/
public class SlotConfigNamesUpdateParameters extends ResourceBase {
    private SlotConfigNames properties;
    
    /**
    * Required. The name value pair parameters for the web site.
    * @return The Properties value.
    */
    public SlotConfigNames getProperties() {
        return this.properties;
    }
    
    /**
    * Required. The name value pair parameters for the web site.
    * @param propertiesValue The Properties value.
    */
    public void setProperties(final SlotConfigNames propertiesValue) {
        this.properties = propertiesValue;
    }
    
    /**
    * Initializes a new instance of the SlotConfigNamesUpdateParameters class.
    *
    */
    public SlotConfigNamesUpdateParameters() {
        super();
    }
    
    /**
    * Initializes a new instance of the SlotConfigNamesUpdateParameters class
    * with required arguments.
    *
    * @param properties The name value pair parameters for the web site.
    * @param location Gets or sets the location of the resource.
    */
    public SlotConfigNamesUpdateParameters(SlotConfigNames properties, String location) {
        this();
        if (properties == null) {
            throw new NullPointerException("properties");
        }
        if (location == null) {
            throw new NullPointerException("location");
        }
        this.setProperties(properties);
        this.setLocation(location);
    }
}
