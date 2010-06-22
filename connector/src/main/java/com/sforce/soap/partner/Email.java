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
 * Email.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.partner;

public class Email  implements java.io.Serializable {
    private Boolean bccSender;

    private com.sforce.soap.partner.EmailPriority emailPriority;

    private String replyTo;

    private Boolean saveAsActivity;

    private String senderDisplayName;

    private String subject;

    private Boolean useSignature;

    public Email() {
    }

    public Email(
           Boolean bccSender,
           com.sforce.soap.partner.EmailPriority emailPriority,
           String replyTo,
           Boolean saveAsActivity,
           String senderDisplayName,
           String subject,
           Boolean useSignature) {
           this.bccSender = bccSender;
           this.emailPriority = emailPriority;
           this.replyTo = replyTo;
           this.saveAsActivity = saveAsActivity;
           this.senderDisplayName = senderDisplayName;
           this.subject = subject;
           this.useSignature = useSignature;
    }


    /**
     * Gets the bccSender value for this Email.
     * 
     * @return bccSender
     */
    public Boolean getBccSender() {
        return bccSender;
    }


    /**
     * Sets the bccSender value for this Email.
     * 
     * @param bccSender
     */
    public void setBccSender(Boolean bccSender) {
        this.bccSender = bccSender;
    }


    /**
     * Gets the emailPriority value for this Email.
     * 
     * @return emailPriority
     */
    public com.sforce.soap.partner.EmailPriority getEmailPriority() {
        return emailPriority;
    }


    /**
     * Sets the emailPriority value for this Email.
     * 
     * @param emailPriority
     */
    public void setEmailPriority(com.sforce.soap.partner.EmailPriority emailPriority) {
        this.emailPriority = emailPriority;
    }


    /**
     * Gets the replyTo value for this Email.
     * 
     * @return replyTo
     */
    public String getReplyTo() {
        return replyTo;
    }


    /**
     * Sets the replyTo value for this Email.
     * 
     * @param replyTo
     */
    public void setReplyTo(String replyTo) {
        this.replyTo = replyTo;
    }


    /**
     * Gets the saveAsActivity value for this Email.
     * 
     * @return saveAsActivity
     */
    public Boolean getSaveAsActivity() {
        return saveAsActivity;
    }


    /**
     * Sets the saveAsActivity value for this Email.
     * 
     * @param saveAsActivity
     */
    public void setSaveAsActivity(Boolean saveAsActivity) {
        this.saveAsActivity = saveAsActivity;
    }


    /**
     * Gets the senderDisplayName value for this Email.
     * 
     * @return senderDisplayName
     */
    public String getSenderDisplayName() {
        return senderDisplayName;
    }


    /**
     * Sets the senderDisplayName value for this Email.
     * 
     * @param senderDisplayName
     */
    public void setSenderDisplayName(String senderDisplayName) {
        this.senderDisplayName = senderDisplayName;
    }


    /**
     * Gets the subject value for this Email.
     * 
     * @return subject
     */
    public String getSubject() {
        return subject;
    }


    /**
     * Sets the subject value for this Email.
     * 
     * @param subject
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }


    /**
     * Gets the useSignature value for this Email.
     * 
     * @return useSignature
     */
    public Boolean getUseSignature() {
        return useSignature;
    }


    /**
     * Sets the useSignature value for this Email.
     * 
     * @param useSignature
     */
    public void setUseSignature(Boolean useSignature) {
        this.useSignature = useSignature;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof Email)) return false;
        Email other = (Email) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bccSender==null && other.getBccSender()==null) || 
             (this.bccSender!=null &&
              this.bccSender.equals(other.getBccSender()))) &&
            ((this.emailPriority==null && other.getEmailPriority()==null) || 
             (this.emailPriority!=null &&
              this.emailPriority.equals(other.getEmailPriority()))) &&
            ((this.replyTo==null && other.getReplyTo()==null) || 
             (this.replyTo!=null &&
              this.replyTo.equals(other.getReplyTo()))) &&
            ((this.saveAsActivity==null && other.getSaveAsActivity()==null) || 
             (this.saveAsActivity!=null &&
              this.saveAsActivity.equals(other.getSaveAsActivity()))) &&
            ((this.senderDisplayName==null && other.getSenderDisplayName()==null) || 
             (this.senderDisplayName!=null &&
              this.senderDisplayName.equals(other.getSenderDisplayName()))) &&
            ((this.subject==null && other.getSubject()==null) || 
             (this.subject!=null &&
              this.subject.equals(other.getSubject()))) &&
            ((this.useSignature==null && other.getUseSignature()==null) || 
             (this.useSignature!=null &&
              this.useSignature.equals(other.getUseSignature())));
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
        if (getBccSender() != null) {
            _hashCode += getBccSender().hashCode();
        }
        if (getEmailPriority() != null) {
            _hashCode += getEmailPriority().hashCode();
        }
        if (getReplyTo() != null) {
            _hashCode += getReplyTo().hashCode();
        }
        if (getSaveAsActivity() != null) {
            _hashCode += getSaveAsActivity().hashCode();
        }
        if (getSenderDisplayName() != null) {
            _hashCode += getSenderDisplayName().hashCode();
        }
        if (getSubject() != null) {
            _hashCode += getSubject().hashCode();
        }
        if (getUseSignature() != null) {
            _hashCode += getUseSignature().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Email.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "Email"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bccSender");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "bccSender"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailPriority");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "emailPriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "EmailPriority"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("replyTo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "replyTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("saveAsActivity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "saveAsActivity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderDisplayName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "senderDisplayName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subject");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "subject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useSignature");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "useSignature"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
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
