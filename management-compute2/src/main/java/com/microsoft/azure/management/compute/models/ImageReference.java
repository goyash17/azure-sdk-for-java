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

/**
* The image reference.
*/
public class ImageReference {
    private String offer;
    
    /**
    * Optional. Gets or sets the image offer.
    * @return The Offer value.
    */
    public String getOffer() {
        return this.offer;
    }
    
    /**
    * Optional. Gets or sets the image offer.
    * @param offerValue The Offer value.
    */
    public void setOffer(final String offerValue) {
        this.offer = offerValue;
    }
    
    private String publisher;
    
    /**
    * Optional. Gets or sets the image publisher.
    * @return The Publisher value.
    */
    public String getPublisher() {
        return this.publisher;
    }
    
    /**
    * Optional. Gets or sets the image publisher.
    * @param publisherValue The Publisher value.
    */
    public void setPublisher(final String publisherValue) {
        this.publisher = publisherValue;
    }
    
    private String sku;
    
    /**
    * Optional. Gets or sets the image sku.
    * @return The Sku value.
    */
    public String getSku() {
        return this.sku;
    }
    
    /**
    * Optional. Gets or sets the image sku.
    * @param skuValue The Sku value.
    */
    public void setSku(final String skuValue) {
        this.sku = skuValue;
    }
    
    private String version;
    
    /**
    * Optional. Gets or sets the image version. The allowed formats are
    * Major.Minor.Build or 'latest'. Major, Minor and Build being decimal
    * numbers. Specify 'latest' to use the latest version of image.
    * @return The Version value.
    */
    public String getVersion() {
        return this.version;
    }
    
    /**
    * Optional. Gets or sets the image version. The allowed formats are
    * Major.Minor.Build or 'latest'. Major, Minor and Build being decimal
    * numbers. Specify 'latest' to use the latest version of image.
    * @param versionValue The Version value.
    */
    public void setVersion(final String versionValue) {
        this.version = versionValue;
    }
}
