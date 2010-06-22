/*
 * Copyright (c) 2009 GoodData Corporation.  All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 * 1. Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in the
 *    documentation and/or other materials provided with the distribution.
 * 3. Redistributions in any form must be accompanied by information on
 *    how to obtain complete source code for this software and any
 *    accompanying software that uses this software.  The source code
 *    must either be included in the distribution or be available for no
 *    more than the cost of distribution plus a nominal fee, and must be
 *    freely redistributable under reasonable conditions.  For an
 *    executable file, complete source code means the source code for all
 *    modules it contains.  It does not include source code for modules or
 *    files that typically accompany the major components of the operating
 *    system on which the executable file runs.
 *
 * THIS SOFTWARE IS PROVIDED BY GOODDATA ``AS IS'' AND ANY EXPRESS OR
 * IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, OR
 * NON-INFRINGEMENT, ARE DISCLAIMED.  IN NO EVENT SHALL ORACLE BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR
 * BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
 * WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE
 * OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN
 * IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

/**
 * DescribeLayoutType0.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.partner;

public class DescribeLayoutType0  implements java.io.Serializable {
    private String sObjectType;

    private String[] recordTypeIds;

    public DescribeLayoutType0() {
    }

    public DescribeLayoutType0(
           String sObjectType,
           String[] recordTypeIds) {
           this.sObjectType = sObjectType;
           this.recordTypeIds = recordTypeIds;
    }


    /**
     * Gets the sObjectType value for this DescribeLayoutType0.
     * 
     * @return sObjectType
     */
    public String getSObjectType() {
        return sObjectType;
    }


    /**
     * Sets the sObjectType value for this DescribeLayoutType0.
     * 
     * @param sObjectType
     */
    public void setSObjectType(String sObjectType) {
        this.sObjectType = sObjectType;
    }


    /**
     * Gets the recordTypeIds value for this DescribeLayoutType0.
     * 
     * @return recordTypeIds
     */
    public String[] getRecordTypeIds() {
        return recordTypeIds;
    }


    /**
     * Sets the recordTypeIds value for this DescribeLayoutType0.
     * 
     * @param recordTypeIds
     */
    public void setRecordTypeIds(String[] recordTypeIds) {
        this.recordTypeIds = recordTypeIds;
    }

    public String getRecordTypeIds(int i) {
        return this.recordTypeIds[i];
    }

    public void setRecordTypeIds(int i, String _value) {
        this.recordTypeIds[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof DescribeLayoutType0)) return false;
        DescribeLayoutType0 other = (DescribeLayoutType0) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sObjectType==null && other.getSObjectType()==null) || 
             (this.sObjectType!=null &&
              this.sObjectType.equals(other.getSObjectType()))) &&
            ((this.recordTypeIds==null && other.getRecordTypeIds()==null) || 
             (this.recordTypeIds!=null &&
              java.util.Arrays.equals(this.recordTypeIds, other.getRecordTypeIds())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getSObjectType() != null) {
            _hashCode += getSObjectType().hashCode();
        }
        if (getRecordTypeIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRecordTypeIds());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getRecordTypeIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DescribeLayoutType0.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", ">describeLayout"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SObjectType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "sObjectType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordTypeIds");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "recordTypeIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "ID"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
