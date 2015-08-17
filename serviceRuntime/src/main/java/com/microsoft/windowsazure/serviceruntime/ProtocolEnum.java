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
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.11.14 at 04:34:45 PM PST 
//

package com.microsoft.windowsazure.serviceruntime;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ProtocolEnum.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="ProtocolEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ip"/>
 *     &lt;enumeration value="tcp"/>
 *     &lt;enumeration value="tls"/>
 *     &lt;enumeration value="http"/>
 *     &lt;enumeration value="https"/>
 *     &lt;enumeration value="wcf:tcp"/>
 *     &lt;enumeration value="wcf:tls"/>
 *     &lt;enumeration value="wcf:http"/>
 *     &lt;enumeration value="wcf:https"/>
 *     &lt;enumeration value="wcf:https:certificate"/>
 *     &lt;enumeration value="udp"/>
 *     &lt;enumeration value="raw"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProtocolEnum")
@XmlEnum
enum ProtocolEnum {

    @XmlEnumValue("ip")
    IP("ip"), @XmlEnumValue("tcp")
    TCP("tcp"), @XmlEnumValue("tls")
    TLS("tls"), @XmlEnumValue("http")
    HTTP("http"), @XmlEnumValue("https")
    HTTPS("https"), @XmlEnumValue("wcf:tcp")
    WCF_TCP("wcf:tcp"), @XmlEnumValue("wcf:tls")
    WCF_TLS("wcf:tls"), @XmlEnumValue("wcf:http")
    WCF_HTTP("wcf:http"), @XmlEnumValue("wcf:https")
    WCF_HTTPS("wcf:https"), @XmlEnumValue("wcf:https:certificate")
    WCF_HTTPS_CERTIFICATE("wcf:https:certificate"), @XmlEnumValue("udp")
    UDP("udp"), @XmlEnumValue("raw")
    RAW("raw");
    private final String value;

    ProtocolEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProtocolEnum fromValue(String v) {
        for (ProtocolEnum c : ProtocolEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
