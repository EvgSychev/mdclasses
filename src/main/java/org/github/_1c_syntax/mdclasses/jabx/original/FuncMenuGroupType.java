//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.20 at 09:46:06 PM KRAT 
//


package org.github._1c_syntax.mdclasses.jabx.original;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FuncMenuGroupType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FuncMenuGroupType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Simple"/&gt;
 *     &lt;enumeration value="SubSystem"/&gt;
 *     &lt;enumeration value="Section"/&gt;
 *     &lt;enumeration value="Group"/&gt;
 *     &lt;enumeration value="Actions"/&gt;
 *     &lt;enumeration value="SeeAlso"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FuncMenuGroupType", namespace = "http://v8.1c.ru/8.2/managed-application/cmi")
@XmlEnum
public enum FuncMenuGroupType {

    @XmlEnumValue("Simple")
    SIMPLE("Simple"),
    @XmlEnumValue("SubSystem")
    SUB_SYSTEM("SubSystem"),
    @XmlEnumValue("Section")
    SECTION("Section"),
    @XmlEnumValue("Group")
    GROUP("Group"),
    @XmlEnumValue("Actions")
    ACTIONS("Actions"),
    @XmlEnumValue("SeeAlso")
    SEE_ALSO("SeeAlso");
    private final String value;

    FuncMenuGroupType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FuncMenuGroupType fromValue(String v) {
        for (FuncMenuGroupType c: FuncMenuGroupType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}