//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.20 at 09:46:06 PM KRAT 
//


package com.github._1c_syntax.mdclasses.jabx.original;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for FormDataDescriptionChanges complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FormDataDescriptionChanges"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="added" type="{http://v8.1c.ru/8.2/uobjects}FormDataDescriptions" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="removed" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="changed" type="{http://v8.1c.ru/8.2/uobjects}FormDataStructureChanges" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="sin" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="seq" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="sinUo" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="seqUo" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormDataDescriptionChanges", namespace = "http://v8.1c.ru/8.2/uobjects", propOrder = {
    "added",
    "removed",
    "changed"
})
public class FormDataDescriptionChanges {

    protected List<FormDataDescriptions> added;
    protected List<String> removed;
    protected List<FormDataStructureChanges> changed;
    @XmlAttribute(name = "sin", required = true)
    protected BigDecimal sin;
    @XmlAttribute(name = "seq", required = true)
    protected BigDecimal seq;
    @XmlAttribute(name = "sinUo", required = true)
    protected BigDecimal sinUo;
    @XmlAttribute(name = "seqUo", required = true)
    protected BigDecimal seqUo;

    /**
     * Gets the value of the added property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the added property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdded().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormDataDescriptions }
     * 
     * 
     */
    public List<FormDataDescriptions> getAdded() {
        if (added == null) {
            added = new ArrayList<FormDataDescriptions>();
        }
        return this.added;
    }

    /**
     * Gets the value of the removed property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the removed property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemoved().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRemoved() {
        if (removed == null) {
            removed = new ArrayList<String>();
        }
        return this.removed;
    }

    /**
     * Gets the value of the changed property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the changed property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChanged().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormDataStructureChanges }
     * 
     * 
     */
    public List<FormDataStructureChanges> getChanged() {
        if (changed == null) {
            changed = new ArrayList<FormDataStructureChanges>();
        }
        return this.changed;
    }

    /**
     * Gets the value of the sin property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSin() {
        return sin;
    }

    /**
     * Sets the value of the sin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSin(BigDecimal value) {
        this.sin = value;
    }

    /**
     * Gets the value of the seq property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSeq() {
        return seq;
    }

    /**
     * Sets the value of the seq property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSeq(BigDecimal value) {
        this.seq = value;
    }

    /**
     * Gets the value of the sinUo property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSinUo() {
        return sinUo;
    }

    /**
     * Sets the value of the sinUo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSinUo(BigDecimal value) {
        this.sinUo = value;
    }

    /**
     * Gets the value of the seqUo property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSeqUo() {
        return seqUo;
    }

    /**
     * Sets the value of the seqUo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSeqUo(BigDecimal value) {
        this.seqUo = value;
    }

}