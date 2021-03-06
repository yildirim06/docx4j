/*
 *  Copyright 2010, Plutext Pty Ltd.
 *   
 *  This file is part of docx4j.

    docx4j is licensed under the Apache License, Version 2.0 (the "License"); 
    you may not use this file except in compliance with the License. 

    You may obtain a copy of the License at 

        http://www.apache.org/licenses/LICENSE-2.0 

    Unless required by applicable law or agreed to in writing, software 
    distributed under the License is distributed on an "AS IS" BASIS, 
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
    See the License for the specific language governing permissions and 
    limitations under the License.

 */


package org.xlsx4j.sml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CT_Font complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_Font">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="name" type="{http://schemas.openxmlformats.org/spreadsheetml/2006/main}CT_FontName" minOccurs="0"/>
 *         &lt;element name="charset" type="{http://schemas.openxmlformats.org/spreadsheetml/2006/main}CT_IntProperty" minOccurs="0"/>
 *         &lt;element name="family" type="{http://schemas.openxmlformats.org/spreadsheetml/2006/main}CT_IntProperty" minOccurs="0"/>
 *         &lt;element name="b" type="{http://schemas.openxmlformats.org/spreadsheetml/2006/main}CT_BooleanProperty" minOccurs="0"/>
 *         &lt;element name="i" type="{http://schemas.openxmlformats.org/spreadsheetml/2006/main}CT_BooleanProperty" minOccurs="0"/>
 *         &lt;element name="strike" type="{http://schemas.openxmlformats.org/spreadsheetml/2006/main}CT_BooleanProperty" minOccurs="0"/>
 *         &lt;element name="outline" type="{http://schemas.openxmlformats.org/spreadsheetml/2006/main}CT_BooleanProperty" minOccurs="0"/>
 *         &lt;element name="shadow" type="{http://schemas.openxmlformats.org/spreadsheetml/2006/main}CT_BooleanProperty" minOccurs="0"/>
 *         &lt;element name="condense" type="{http://schemas.openxmlformats.org/spreadsheetml/2006/main}CT_BooleanProperty" minOccurs="0"/>
 *         &lt;element name="extend" type="{http://schemas.openxmlformats.org/spreadsheetml/2006/main}CT_BooleanProperty" minOccurs="0"/>
 *         &lt;element name="color" type="{http://schemas.openxmlformats.org/spreadsheetml/2006/main}CT_Color" minOccurs="0"/>
 *         &lt;element name="sz" type="{http://schemas.openxmlformats.org/spreadsheetml/2006/main}CT_FontSize" minOccurs="0"/>
 *         &lt;element name="u" type="{http://schemas.openxmlformats.org/spreadsheetml/2006/main}CT_UnderlineProperty" minOccurs="0"/>
 *         &lt;element name="vertAlign" type="{http://schemas.openxmlformats.org/spreadsheetml/2006/main}CT_VerticalAlignFontProperty" minOccurs="0"/>
 *         &lt;element name="scheme" type="{http://schemas.openxmlformats.org/spreadsheetml/2006/main}CT_FontScheme" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_Font", propOrder = {
    "nameOrCharsetOrFamily"
})
public class CTFont {

    @XmlElementRefs({
        @XmlElementRef(name = "i", namespace = "http://schemas.openxmlformats.org/spreadsheetml/2006/main", type = JAXBElement.class),
        @XmlElementRef(name = "u", namespace = "http://schemas.openxmlformats.org/spreadsheetml/2006/main", type = JAXBElement.class),
        @XmlElementRef(name = "sz", namespace = "http://schemas.openxmlformats.org/spreadsheetml/2006/main", type = JAXBElement.class),
        @XmlElementRef(name = "shadow", namespace = "http://schemas.openxmlformats.org/spreadsheetml/2006/main", type = JAXBElement.class),
        @XmlElementRef(name = "color", namespace = "http://schemas.openxmlformats.org/spreadsheetml/2006/main", type = JAXBElement.class),
        @XmlElementRef(name = "b", namespace = "http://schemas.openxmlformats.org/spreadsheetml/2006/main", type = JAXBElement.class),
        @XmlElementRef(name = "scheme", namespace = "http://schemas.openxmlformats.org/spreadsheetml/2006/main", type = JAXBElement.class),
        @XmlElementRef(name = "family", namespace = "http://schemas.openxmlformats.org/spreadsheetml/2006/main", type = JAXBElement.class),
        @XmlElementRef(name = "strike", namespace = "http://schemas.openxmlformats.org/spreadsheetml/2006/main", type = JAXBElement.class),
        @XmlElementRef(name = "charset", namespace = "http://schemas.openxmlformats.org/spreadsheetml/2006/main", type = JAXBElement.class),
        @XmlElementRef(name = "condense", namespace = "http://schemas.openxmlformats.org/spreadsheetml/2006/main", type = JAXBElement.class),
        @XmlElementRef(name = "vertAlign", namespace = "http://schemas.openxmlformats.org/spreadsheetml/2006/main", type = JAXBElement.class),
        @XmlElementRef(name = "name", namespace = "http://schemas.openxmlformats.org/spreadsheetml/2006/main", type = JAXBElement.class),
        @XmlElementRef(name = "outline", namespace = "http://schemas.openxmlformats.org/spreadsheetml/2006/main", type = JAXBElement.class),
        @XmlElementRef(name = "extend", namespace = "http://schemas.openxmlformats.org/spreadsheetml/2006/main", type = JAXBElement.class)
    })
    protected List<JAXBElement<?>> nameOrCharsetOrFamily;

    /**
     * Gets the value of the nameOrCharsetOrFamily property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nameOrCharsetOrFamily property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNameOrCharsetOrFamily().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link CTBooleanProperty }{@code >}
     * {@link JAXBElement }{@code <}{@link CTUnderlineProperty }{@code >}
     * {@link JAXBElement }{@code <}{@link CTFontSize }{@code >}
     * {@link JAXBElement }{@code <}{@link CTBooleanProperty }{@code >}
     * {@link JAXBElement }{@code <}{@link CTColor }{@code >}
     * {@link JAXBElement }{@code <}{@link CTBooleanProperty }{@code >}
     * {@link JAXBElement }{@code <}{@link CTFontScheme }{@code >}
     * {@link JAXBElement }{@code <}{@link CTIntProperty }{@code >}
     * {@link JAXBElement }{@code <}{@link CTBooleanProperty }{@code >}
     * {@link JAXBElement }{@code <}{@link CTIntProperty }{@code >}
     * {@link JAXBElement }{@code <}{@link CTBooleanProperty }{@code >}
     * {@link JAXBElement }{@code <}{@link CTVerticalAlignFontProperty }{@code >}
     * {@link JAXBElement }{@code <}{@link CTFontName }{@code >}
     * {@link JAXBElement }{@code <}{@link CTBooleanProperty }{@code >}
     * {@link JAXBElement }{@code <}{@link CTBooleanProperty }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getNameOrCharsetOrFamily() {
        if (nameOrCharsetOrFamily == null) {
            nameOrCharsetOrFamily = new ArrayList<JAXBElement<?>>();
        }
        return this.nameOrCharsetOrFamily;
    }

}
