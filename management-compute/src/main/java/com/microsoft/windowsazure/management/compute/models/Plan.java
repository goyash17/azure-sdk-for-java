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

package com.microsoft.windowsazure.management.compute.models;

/**
* Purchase context of any 3rd party artifact.
*/
public class Plan {
    private String name;
    
    /**
    * Required. Gets or sets a user defined name of the 3rd party artifact that
    * is being procured.
    * @return The Name value.
    */
    public String getName() {
        return this.name;
    }
    
    /**
    * Required. Gets or sets a user defined name of the 3rd party artifact that
    * is being procured.
    * @param nameValue The Name value.
    */
    public void setName(final String nameValue) {
        this.name = nameValue;
    }
    
    private String product;
    
    /**
    * Required. Gets or sets the 3rd party artifact that is being procured.E.g.
    * Northwind.
    * @return The Product value.
    */
    public String getProduct() {
        return this.product;
    }
    
    /**
    * Required. Gets or sets the 3rd party artifact that is being procured.E.g.
    * Northwind.
    * @param productValue The Product value.
    */
    public void setProduct(final String productValue) {
        this.product = productValue;
    }
    
    private String publisher;
    
    /**
    * Required. Gets or sets the publisher of the 3rd party artifact that is
    * being bought.E.g. Contoso.
    * @return The Publisher value.
    */
    public String getPublisher() {
        return this.publisher;
    }
    
    /**
    * Required. Gets or sets the publisher of the 3rd party artifact that is
    * being bought.E.g. Contoso.
    * @param publisherValue The Publisher value.
    */
    public void setPublisher(final String publisherValue) {
        this.publisher = publisherValue;
    }
    
    /**
    * Initializes a new instance of the Plan class.
    *
    */
    public Plan() {
    }
    
    /**
    * Initializes a new instance of the Plan class with required arguments.
    *
    * @param name Gets or sets a user defined name of the 3rd party artifact
    * that is being procured.
    * @param publisher Gets or sets the publisher of the 3rd party artifact
    * that is being bought.E.g. Contoso.
    * @param product Gets or sets the 3rd party artifact that is being
    * procured.E.g. Northwind.
    */
    public Plan(String name, String publisher, String product) {
        if (name == null) {
            throw new NullPointerException("name");
        }
        if (publisher == null) {
            throw new NullPointerException("publisher");
        }
        if (product == null) {
            throw new NullPointerException("product");
        }
        this.setName(name);
        this.setPublisher(publisher);
        this.setProduct(product);
    }
}
