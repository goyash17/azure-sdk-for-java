/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.12.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

'use strict';

/**
 * @class
 * Initializes a new instance of the Pet class.
 * @constructor
 * @member {number} [id]
 * 
 * @member {string} [name]
 * 
 */
function Pet(parameters) {
  if (parameters !== null && parameters !== undefined) {
    if (parameters.id !== undefined) {
      this.id = parameters.id;
    }
    if (parameters.name !== undefined) {
      this.name = parameters.name;
    }
  }    
}


/**
 * Validate the payload against the Pet schema
 *
 * @param {JSON} payload
 *
 */
Pet.prototype.serialize = function () {
  var payload = {};
  if (this['id'] !== null && this['id'] !== undefined) {
    if (typeof this['id'] !== 'number') {
      throw new Error('this[\'id\'] must be of type number.');
    }
    payload['id'] = this['id'];
  }

  if (this['name'] !== null && this['name'] !== undefined) {
    if (typeof this['name'].valueOf() !== 'string') {
      throw new Error('this[\'name\'] must be of type string.');
    }
    payload['name'] = this['name'];
  }

  return payload;
};

/**
 * Deserialize the instance to Pet schema
 *
 * @param {JSON} instance
 *
 */
Pet.prototype.deserialize = function (instance) {
  if (instance) {
    if (instance['id'] !== undefined) {
      this['id'] = instance['id'];
    }

    if (instance['name'] !== undefined) {
      this['name'] = instance['name'];
    }
  }

  return this;
};

module.exports = Pet;
