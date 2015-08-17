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

package com.microsoft.windowsazure.management.sql;

import com.microsoft.windowsazure.exception.ServiceException;
import com.microsoft.windowsazure.management.sql.models.ServiceObjectiveGetResponse;
import com.microsoft.windowsazure.management.sql.models.ServiceObjectiveListResponse;
import java.io.IOException;
import java.util.concurrent.Future;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

/**
* This class provides methods to get a specific service objective by using its
* ID or to List all of the service objectives on a server.
*/
public interface ServiceObjectiveOperations {
    /**
    * Returns information about a certain Service Objective with a specific Id.
    *
    * @param serverName Required. The name of the Azure SQL Database Server to
    * be queried.
    * @param serviceObjectiveId Required. The Id of the Service Objective to be
    * obtained.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws ParserConfigurationException Thrown if there was a serious
    * configuration error with the document parser.
    * @throws SAXException Thrown if there was an error parsing the XML
    * response.
    * @return Response containing the service objective for a given Azure SQL
    * Database Server with matching service objective Id.
    */
    ServiceObjectiveGetResponse get(String serverName, String serviceObjectiveId) throws IOException, ServiceException, ParserConfigurationException, SAXException;
    
    /**
    * Returns information about a certain Service Objective with a specific Id.
    *
    * @param serverName Required. The name of the Azure SQL Database Server to
    * be queried.
    * @param serviceObjectiveId Required. The Id of the Service Objective to be
    * obtained.
    * @return Response containing the service objective for a given Azure SQL
    * Database Server with matching service objective Id.
    */
    Future<ServiceObjectiveGetResponse> getAsync(String serverName, String serviceObjectiveId);
    
    /**
    * Returns information about all Service Objectives on an Azure SQL Database
    * Server.
    *
    * @param serverName Required. The name of the Azure SQL Database Server to
    * be queried.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws ParserConfigurationException Thrown if there was a serious
    * configuration error with the document parser.
    * @throws SAXException Thrown if there was an error parsing the XML
    * response.
    * @return Response containing the list of service objective for a given
    * server.  This is returnedfrom a call to List Service Objectives.
    */
    ServiceObjectiveListResponse list(String serverName) throws IOException, ServiceException, ParserConfigurationException, SAXException;
    
    /**
    * Returns information about all Service Objectives on an Azure SQL Database
    * Server.
    *
    * @param serverName Required. The name of the Azure SQL Database Server to
    * be queried.
    * @return Response containing the list of service objective for a given
    * server.  This is returnedfrom a call to List Service Objectives.
    */
    Future<ServiceObjectiveListResponse> listAsync(String serverName);
}
