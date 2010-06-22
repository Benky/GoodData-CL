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
 * DescribeLayoutResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.partner;

public class DescribeLayoutResult  implements java.io.Serializable {
    private DescribeLayout[] layouts;

    private com.sforce.soap.partner.RecordTypeMapping[] recordTypeMappings;

    private boolean recordTypeSelectorRequired;

    public DescribeLayoutResult() {
    }

    public DescribeLayoutResult(
           DescribeLayout[] layouts,
           com.sforce.soap.partner.RecordTypeMapping[] recordTypeMappings,
           boolean recordTypeSelectorRequired) {
           this.layouts = layouts;
           this.recordTypeMappings = recordTypeMappings;
           this.recordTypeSelectorRequired = recordTypeSelectorRequired;
    }


    /**
     * Gets the layouts value for this DescribeLayoutResult.
     * 
     * @return layouts
     */
    public DescribeLayout[] getLayouts() {
        return layouts;
    }


    /**
     * Sets the layouts value for this DescribeLayoutResult.
     * 
     * @param layouts
     */
    public void setLayouts(DescribeLayout[] layouts) {
        this.layouts = layouts;
    }

    public DescribeLayout getLayouts(int i) {
        return this.layouts[i];
    }

    public void setLayouts(int i, DescribeLayout _value) {
        this.layouts[i] = _value;
    }


    /**
     * Gets the recordTypeMappings value for this DescribeLayoutResult.
     * 
     * @return recordTypeMappings
     */
    public com.sforce.soap.partner.RecordTypeMapping[] getRecordTypeMappings() {
        return recordTypeMappings;
    }


    /**
     * Sets the recordTypeMappings value for this DescribeLayoutResult.
     * 
     * @param recordTypeMappings
     */
    public void setRecordTypeMappings(com.sforce.soap.partner.RecordTypeMapping[] recordTypeMappings) {
        this.recordTypeMappings = recordTypeMappings;
    }

    public com.sforce.soap.partner.RecordTypeMapping getRecordTypeMappings(int i) {
        return this.recordTypeMappings[i];
    }

    public void setRecordTypeMappings(int i, com.sforce.soap.partner.RecordTypeMapping _value) {
        this.recordTypeMappings[i] = _value;
    }


    /**
     * Gets the recordTypeSelectorRequired value for this DescribeLayoutResult.
     * 
     * @return recordTypeSelectorRequired
     */
    public boolean isRecordTypeSelectorRequired() {
        return recordTypeSelectorRequired;
    }


    /**
     * Sets the recordTypeSelectorRequired value for this DescribeLayoutResult.
     * 
     * @param recordTypeSelectorRequired
     */
    public void setRecordTypeSelectorRequired(boolean recordTypeSelectorRequired) {
        this.recordTypeSelectorRequired = recordTypeSelectorRequired;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof DescribeLayoutResult)) return false;
        DescribeLayoutResult other = (DescribeLayoutResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.layouts==null && other.getLayouts()==null) || 
             (this.layouts!=null &&
              java.util.Arrays.equals(this.layouts, other.getLayouts()))) &&
            ((this.recordTypeMappings==null && other.getRecordTypeMappings()==null) || 
             (this.recordTypeMappings!=null &&
              java.util.Arrays.equals(this.recordTypeMappings, other.getRecordTypeMappings()))) &&
            this.recordTypeSelectorRequired == other.isRecordTypeSelectorRequired();
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
        if (getLayouts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLayouts());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getLayouts(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRecordTypeMappings() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRecordTypeMappings());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getRecordTypeMappings(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isRecordTypeSelectorRequired() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DescribeLayoutResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeLayoutResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("layouts");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "layouts"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeLayout"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordTypeMappings");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "recordTypeMappings"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "RecordTypeMapping"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordTypeSelectorRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "recordTypeSelectorRequired"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
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
