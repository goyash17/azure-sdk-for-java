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

package com.microsoft.windowsazure.management.websites.models;

/**
* Parameters supplied to the Create Web Web Hosting Plan operation.
*/
public class WebHostingPlanCreateParameters {
    private String adminSiteName;
    
    /**
    * Optional. The admin site. The admin site is used to deploy site
    * extensions or contents shared by all site in the plan.
    * @return The AdminSiteName value.
    */
    public String getAdminSiteName() {
        return this.adminSiteName;
    }
    
    /**
    * Optional. The admin site. The admin site is used to deploy site
    * extensions or contents shared by all site in the plan.
    * @param adminSiteNameValue The AdminSiteName value.
    */
    public void setAdminSiteName(final String adminSiteNameValue) {
        this.adminSiteName = adminSiteNameValue;
    }
    
    private String name;
    
    /**
    * Required. Name of the Web hosting plan.
    * @return The Name value.
    */
    public String getName() {
        return this.name;
    }
    
    /**
    * Required. Name of the Web hosting plan.
    * @param nameValue The Name value.
    */
    public void setName(final String nameValue) {
        this.name = nameValue;
    }
    
    private Integer numberOfWorkers;
    
    /**
    * Optional. The requested number of workers.
    * @return The NumberOfWorkers value.
    */
    public Integer getNumberOfWorkers() {
        return this.numberOfWorkers;
    }
    
    /**
    * Optional. The requested number of workers.
    * @param numberOfWorkersValue The NumberOfWorkers value.
    */
    public void setNumberOfWorkers(final Integer numberOfWorkersValue) {
        this.numberOfWorkers = numberOfWorkersValue;
    }
    
    private SkuOptions sKU;
    
    /**
    * Optional. SKU of the Web hosting plan.
    * @return The SKU value.
    */
    public SkuOptions getSKU() {
        return this.sKU;
    }
    
    /**
    * Optional. SKU of the Web hosting plan.
    * @param sKUValue The SKU value.
    */
    public void setSKU(final SkuOptions sKUValue) {
        this.sKU = sKUValue;
    }
    
    private WorkerSizeOptions workerSize;
    
    /**
    * Optional. The worker size. Possible values are Small, Medium, and Large.
    * For JSON, the equivalents are 0 = Small, 1 = Medium, and 2 = Large.
    * @return The WorkerSize value.
    */
    public WorkerSizeOptions getWorkerSize() {
        return this.workerSize;
    }
    
    /**
    * Optional. The worker size. Possible values are Small, Medium, and Large.
    * For JSON, the equivalents are 0 = Small, 1 = Medium, and 2 = Large.
    * @param workerSizeValue The WorkerSize value.
    */
    public void setWorkerSize(final WorkerSizeOptions workerSizeValue) {
        this.workerSize = workerSizeValue;
    }
    
    /**
    * Initializes a new instance of the WebHostingPlanCreateParameters class.
    *
    */
    public WebHostingPlanCreateParameters() {
    }
    
    /**
    * Initializes a new instance of the WebHostingPlanCreateParameters class
    * with required arguments.
    *
    * @param name Name of the Web hosting plan.
    */
    public WebHostingPlanCreateParameters(String name) {
        if (name == null) {
            throw new NullPointerException("name");
        }
        this.setName(name);
    }
}
