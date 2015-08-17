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

package com.microsoft.azure.management.resources;

import com.microsoft.azure.management.resources.models.GenericResource;
import com.microsoft.azure.management.resources.models.ResourceCreateOrUpdateResult;
import com.microsoft.azure.management.resources.models.ResourceExistsResult;
import com.microsoft.azure.management.resources.models.ResourceGetResult;
import com.microsoft.azure.management.resources.models.ResourceListParameters;
import com.microsoft.azure.management.resources.models.ResourceListResult;
import com.microsoft.azure.management.resources.models.ResourcesMoveInfo;
import com.microsoft.windowsazure.core.OperationResponse;
import com.microsoft.windowsazure.core.ResourceIdentity;
import com.microsoft.windowsazure.exception.ServiceException;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
* Operations for managing resources.
*/
public interface ResourceOperations {
    /**
    * Checks whether resource exists.
    *
    * @param resourceGroupName Required. The name of the resource group. The
    * name is case insensitive.
    * @param identity Required. Resource identity.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return Resource group information.
    */
    ResourceExistsResult checkExistence(String resourceGroupName, ResourceIdentity identity) throws IOException, ServiceException;
    
    /**
    * Checks whether resource exists.
    *
    * @param resourceGroupName Required. The name of the resource group. The
    * name is case insensitive.
    * @param identity Required. Resource identity.
    * @return Resource group information.
    */
    Future<ResourceExistsResult> checkExistenceAsync(String resourceGroupName, ResourceIdentity identity);
    
    /**
    * Create a resource.
    *
    * @param resourceGroupName Required. The name of the resource group. The
    * name is case insensitive.
    * @param identity Required. Resource identity.
    * @param parameters Required. Create or update resource parameters.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws URISyntaxException Thrown if there was an error parsing a URI in
    * the response.
    * @return Resource information.
    */
    ResourceCreateOrUpdateResult createOrUpdate(String resourceGroupName, ResourceIdentity identity, GenericResource parameters) throws IOException, ServiceException, URISyntaxException;
    
    /**
    * Create a resource.
    *
    * @param resourceGroupName Required. The name of the resource group. The
    * name is case insensitive.
    * @param identity Required. Resource identity.
    * @param parameters Required. Create or update resource parameters.
    * @return Resource information.
    */
    Future<ResourceCreateOrUpdateResult> createOrUpdateAsync(String resourceGroupName, ResourceIdentity identity, GenericResource parameters);
    
    /**
    * Delete resource and all of its resources.
    *
    * @param resourceGroupName Required. The name of the resource group. The
    * name is case insensitive.
    * @param identity Required. Resource identity.
    * @throws InterruptedException Thrown when a thread is waiting, sleeping,
    * or otherwise occupied, and the thread is interrupted, either before or
    * during the activity. Occasionally a method may wish to test whether the
    * current thread has been interrupted, and if so, to immediately throw
    * this exception. The following code can be used to achieve this effect:
    * @throws ExecutionException Thrown when attempting to retrieve the result
    * of a task that aborted by throwing an exception. This exception can be
    * inspected using the Throwable.getCause() method.
    * @throws IOException Thrown if there was an error setting up tracing for
    * the request.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    OperationResponse delete(String resourceGroupName, ResourceIdentity identity) throws InterruptedException, ExecutionException, IOException, ServiceException;
    
    /**
    * Delete resource and all of its resources.
    *
    * @param resourceGroupName Required. The name of the resource group. The
    * name is case insensitive.
    * @param identity Required. Resource identity.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    Future<OperationResponse> deleteAsync(String resourceGroupName, ResourceIdentity identity);
    
    /**
    * Returns a resource belonging to a resource group.
    *
    * @param resourceGroupName Required. The name of the resource group. The
    * name is case insensitive.
    * @param identity Required. Resource identity.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws URISyntaxException Thrown if there was an error parsing a URI in
    * the response.
    * @return Resource information.
    */
    ResourceGetResult get(String resourceGroupName, ResourceIdentity identity) throws IOException, ServiceException, URISyntaxException;
    
    /**
    * Returns a resource belonging to a resource group.
    *
    * @param resourceGroupName Required. The name of the resource group. The
    * name is case insensitive.
    * @param identity Required. Resource identity.
    * @return Resource information.
    */
    Future<ResourceGetResult> getAsync(String resourceGroupName, ResourceIdentity identity);
    
    /**
    * Get all of the resources under a subscription.
    *
    * @param parameters Optional. Query parameters. If null is passed returns
    * all resource groups.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws URISyntaxException Thrown if there was an error parsing a URI in
    * the response.
    * @return List of resource groups.
    */
    ResourceListResult list(ResourceListParameters parameters) throws IOException, ServiceException, URISyntaxException;
    
    /**
    * Get all of the resources under a subscription.
    *
    * @param parameters Optional. Query parameters. If null is passed returns
    * all resource groups.
    * @return List of resource groups.
    */
    Future<ResourceListResult> listAsync(ResourceListParameters parameters);
    
    /**
    * Get a list of deployments.
    *
    * @param nextLink Required. NextLink from the previous successful call to
    * List operation.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws URISyntaxException Thrown if there was an error parsing a URI in
    * the response.
    * @return List of resource groups.
    */
    ResourceListResult listNext(String nextLink) throws IOException, ServiceException, URISyntaxException;
    
    /**
    * Get a list of deployments.
    *
    * @param nextLink Required. NextLink from the previous successful call to
    * List operation.
    * @return List of resource groups.
    */
    Future<ResourceListResult> listNextAsync(String nextLink);
    
    /**
    * Move resources within or across subscriptions.
    *
    * @param sourceResourceGroupName Required. Source resource group name.
    * @param parameters Required. move resources' parameters.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    OperationResponse moveResources(String sourceResourceGroupName, ResourcesMoveInfo parameters) throws IOException, ServiceException;
    
    /**
    * Move resources within or across subscriptions.
    *
    * @param sourceResourceGroupName Required. Source resource group name.
    * @param parameters Required. move resources' parameters.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    Future<OperationResponse> moveResourcesAsync(String sourceResourceGroupName, ResourcesMoveInfo parameters);
}
