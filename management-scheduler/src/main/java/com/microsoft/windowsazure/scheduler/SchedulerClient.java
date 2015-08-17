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

package com.microsoft.windowsazure.scheduler;

import com.microsoft.windowsazure.core.FilterableService;
import com.microsoft.windowsazure.credentials.SubscriptionCloudCredentials;
import java.io.Closeable;
import java.net.URI;

public interface SchedulerClient extends Closeable, FilterableService<SchedulerClient> {
    /**
    * Gets the API version.
    * @return The ApiVersion value.
    */
    String getApiVersion();
    
    /**
    * Gets the URI used as the base for all cloud service requests.
    * @return The BaseUri value.
    */
    URI getBaseUri();
    
    /**
    * @return The CloudServiceName value.
    */
    String getCloudServiceName();
    
    /**
    * @param cloudServiceNameValue The CloudServiceName value.
    */
    void setCloudServiceName(final String cloudServiceNameValue);
    /**
    * Gets subscription credentials which uniquely identify Microsoft Azure
    * subscription. The subscription ID forms part of the URI for every
    * service call.
    * @return The Credentials value.
    */
    SubscriptionCloudCredentials getCredentials();
    
    /**
    * @return The JobCollectionName value.
    */
    String getJobCollectionName();
    
    /**
    * @param jobCollectionNameValue The JobCollectionName value.
    */
    void setJobCollectionName(final String jobCollectionNameValue);
    /**
    * Gets or sets the initial timeout for Long Running Operations.
    * @return The LongRunningOperationInitialTimeout value.
    */
    int getLongRunningOperationInitialTimeout();
    
    /**
    * Gets or sets the initial timeout for Long Running Operations.
    * @param longRunningOperationInitialTimeoutValue The
    * LongRunningOperationInitialTimeout value.
    */
    void setLongRunningOperationInitialTimeout(final int longRunningOperationInitialTimeoutValue);
    /**
    * Gets or sets the retry timeout for Long Running Operations.
    * @return The LongRunningOperationRetryTimeout value.
    */
    int getLongRunningOperationRetryTimeout();
    
    /**
    * Gets or sets the retry timeout for Long Running Operations.
    * @param longRunningOperationRetryTimeoutValue The
    * LongRunningOperationRetryTimeout value.
    */
    void setLongRunningOperationRetryTimeout(final int longRunningOperationRetryTimeoutValue);
    /**
    * @return The JobsOperations value.
    */
    JobOperations getJobsOperations();
}
