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

package com.microsoft.windowsazure.management.scheduler.models;

/**
* State of the Job Collection resource.
*/
public enum JobCollectionState {
    /**
    * Service Manager knows about the resource but the state is still Unknown
    * which might either be a result of failed communication with the RP or
    * just that the Service Manager hasn't got around to process the resource.
    */
    UNKNOWN,
    
    /**
    * The resource provider did not respond with information for the resource.
    */
    NOTFOUND,
    
    /**
    * Resource is running fine.
    */
    STARTED,
    
    /**
    * Resource was stopped due to an issue.
    */
    STOPPED,
    
    /**
    * The resource was temporarily put on hold primarily due to a monetary
    * event.
    */
    PAUSED,
}
