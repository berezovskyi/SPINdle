/**
 * SPINdle (version 2.2.2)
 * Copyright (C) 2009-2012 NICTA Ltd.
 *
 * This file is part of SPINdle project.
 * 
 * SPINdle is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * SPINdle is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with SPINdle.  If not, see <http://www.gnu.org/licenses/>.
 *
 * @author H.-P. Lam (oleklam@gmail.com), National ICT Australia - Queensland Research Laboratory 
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.30 at 12:44:15 PM EST 
//


package spindle.io.xjc.dom2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ctRule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ctRule">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mode" type="{http://spin.nicta.org.au/spindle/spindleDefeasibleTheory2.xsd}stMode" minOccurs="0"/>
 *         &lt;element name="interval" type="{http://spin.nicta.org.au/spindle/spindleDefeasibleTheory2.xsd}ctInterval" minOccurs="0"/>
 *         &lt;element name="head" type="{http://spin.nicta.org.au/spindle/spindleDefeasibleTheory2.xsd}ctRuleHeadLiterals"/>
 *         &lt;element name="body" type="{http://spin.nicta.org.au/spindle/spindleDefeasibleTheory2.xsd}ctRuleBodyLiterals" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="label" type="{http://spin.nicta.org.au/spindle/spindleDefeasibleTheory2.xsd}stRuleLabel" />
 *       &lt;attribute name="ruletype" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="STRICT"/>
 *             &lt;enumeration value="DEFEASIBLE"/>
 *             &lt;enumeration value="DEFEATER"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ctRule", namespace = "http://spin.nicta.org.au/spindle/spindleDefeasibleTheory2.xsd", propOrder = {
    "mode",
    "interval",
    "head",
    "body"
})
public class CtRule {

    @XmlElement(namespace = "http://spin.nicta.org.au/spindle/spindleDefeasibleTheory2.xsd")
    protected String mode;
    @XmlElement(namespace = "http://spin.nicta.org.au/spindle/spindleDefeasibleTheory2.xsd")
    protected CtInterval interval;
    @XmlElement(namespace = "http://spin.nicta.org.au/spindle/spindleDefeasibleTheory2.xsd", required = true)
    protected CtRuleHeadLiterals head;
    @XmlElement(namespace = "http://spin.nicta.org.au/spindle/spindleDefeasibleTheory2.xsd")
    protected CtRuleBodyLiterals body;
    @XmlAttribute
    protected String label;
    @XmlAttribute(required = true)
    protected String ruletype;

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMode(String value) {
        this.mode = value;
    }

    /**
     * Gets the value of the interval property.
     * 
     * @return
     *     possible object is
     *     {@link CtInterval }
     *     
     */
    public CtInterval getInterval() {
        return interval;
    }

    /**
     * Sets the value of the interval property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtInterval }
     *     
     */
    public void setInterval(CtInterval value) {
        this.interval = value;
    }

    /**
     * Gets the value of the head property.
     * 
     * @return
     *     possible object is
     *     {@link CtRuleHeadLiterals }
     *     
     */
    public CtRuleHeadLiterals getHead() {
        return head;
    }

    /**
     * Sets the value of the head property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtRuleHeadLiterals }
     *     
     */
    public void setHead(CtRuleHeadLiterals value) {
        this.head = value;
    }

    /**
     * Gets the value of the body property.
     * 
     * @return
     *     possible object is
     *     {@link CtRuleBodyLiterals }
     *     
     */
    public CtRuleBodyLiterals getBody() {
        return body;
    }

    /**
     * Sets the value of the body property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtRuleBodyLiterals }
     *     
     */
    public void setBody(CtRuleBodyLiterals value) {
        this.body = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the ruletype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuletype() {
        return ruletype;
    }

    /**
     * Sets the value of the ruletype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuletype(String value) {
        this.ruletype = value;
    }

}
