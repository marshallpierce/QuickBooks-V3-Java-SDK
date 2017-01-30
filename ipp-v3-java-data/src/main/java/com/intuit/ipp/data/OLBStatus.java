/*******************************************************************************
 * Copyright (c) 2017 Intuit
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 	http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.11.14 at 04:24:27 PM PST 
//


package com.intuit.ipp.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.intuit.ipp.core.IEntity;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * Describes list of OLBAccounts that needs to be
 * 				enabled or disabled
 * 
 * <p>Java class for OLBStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OLBStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OLBAccount" type="{http://schema.intuit.com/finance/v3}OLBAccount" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OLBStatus", propOrder = {
    "olbAccount"
})
public class OLBStatus
    implements Serializable, IEntity, Equals, HashCode
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "OLBAccount")
    protected List<OLBAccount> olbAccount;

    /**
     * Gets the value of the olbAccount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the olbAccount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOLBAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OLBAccount }
     * 
     * 
     */
    public List<OLBAccount> getOLBAccount() {
        if (olbAccount == null) {
            olbAccount = new ArrayList<OLBAccount>();
        }
        return this.olbAccount;
    }

    /**
     * Sets the value of the olbAccount property.
     * 
     * @param olbAccount
     *     allowed object is
     *     {@link OLBAccount }
     *     
     */
    public void setOLBAccount(List<OLBAccount> olbAccount) {
        this.olbAccount = olbAccount;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof OLBStatus)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final OLBStatus that = ((OLBStatus) object);
        {
            List<OLBAccount> lhsOLBAccount;
            lhsOLBAccount = (((this.olbAccount!= null)&&(!this.olbAccount.isEmpty()))?this.getOLBAccount():null);
            List<OLBAccount> rhsOLBAccount;
            rhsOLBAccount = (((that.olbAccount!= null)&&(!that.olbAccount.isEmpty()))?that.getOLBAccount():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "olbAccount", lhsOLBAccount), LocatorUtils.property(thatLocator, "olbAccount", rhsOLBAccount), lhsOLBAccount, rhsOLBAccount)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            List<OLBAccount> theOLBAccount;
            theOLBAccount = (((this.olbAccount!= null)&&(!this.olbAccount.isEmpty()))?this.getOLBAccount():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "olbAccount", theOLBAccount), currentHashCode, theOLBAccount);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}