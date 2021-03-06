//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.10.10 at 11:31:49 PM PDT 
//


package com.intuit.ipp.data;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SpecialItemTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SpecialItemTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FinanceCharge"/>
 *     &lt;enumeration value="ReimbursableExpenseGroup"/>
 *     &lt;enumeration value="ReimbursableExpenseSubtotal"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SpecialItemTypeEnum")
@XmlEnum
public enum SpecialItemTypeEnum {

    @XmlEnumValue("FinanceCharge")
    FINANCE_CHARGE("FinanceCharge"),
    @XmlEnumValue("ReimbursableExpenseGroup")
    REIMBURSABLE_EXPENSE_GROUP("ReimbursableExpenseGroup"),
    @XmlEnumValue("ReimbursableExpenseSubtotal")
    REIMBURSABLE_EXPENSE_SUBTOTAL("ReimbursableExpenseSubtotal");
    private final String value;

    SpecialItemTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SpecialItemTypeEnum fromValue(String v) {
        for (SpecialItemTypeEnum c: SpecialItemTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
