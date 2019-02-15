//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.15 at 02:13:11 PM MSK 
//


package generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="row" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="KindName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="KindDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="inout" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="IsView" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "row"
})
@XmlRootElement(name = "data")
public class Data {

    @XmlElement(required = true)
    protected List<Data.Row> row;

    /**
     * Gets the value of the row property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the row property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRow().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Data.Row }
     * 
     * 
     */
    public List<Data.Row> getRow() {
        if (row == null) {
            row = new ArrayList<Data.Row>();
        }
        return this.row;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="KindName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="KindDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="inout" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="IsView" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "id",
        "kindName",
        "kindDescription",
        "status",
        "inout",
        "name",
        "isView",
        "createdDate"
    })
    public static class Row {

        @XmlElement(name = "ID")
        protected int id;
        @XmlElement(name = "KindName", required = true)
        protected String kindName;
        @XmlElement(name = "KindDescription", required = true)
        protected String kindDescription;
        @XmlElement(name = "Status")
        protected int status;
        protected int inout;
        @XmlElement(name = "Name", required = true)
        protected String name;
        @XmlElement(name = "IsView")
        protected Integer isView;
        @XmlElement(name = "CreatedDate", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar createdDate;

        /**
         * Gets the value of the id property.
         * 
         */
        public int getID() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         */
        public void setID(int value) {
            this.id = value;
        }

        /**
         * Gets the value of the kindName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKindName() {
            return kindName;
        }

        /**
         * Sets the value of the kindName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKindName(String value) {
            this.kindName = value;
        }

        /**
         * Gets the value of the kindDescription property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKindDescription() {
            return kindDescription;
        }

        /**
         * Sets the value of the kindDescription property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKindDescription(String value) {
            this.kindDescription = value;
        }

        /**
         * Gets the value of the status property.
         * 
         */
        public int getStatus() {
            return status;
        }

        /**
         * Sets the value of the status property.
         * 
         */
        public void setStatus(int value) {
            this.status = value;
        }

        /**
         * Gets the value of the inout property.
         * 
         */
        public int getInout() {
            return inout;
        }

        /**
         * Sets the value of the inout property.
         * 
         */
        public void setInout(int value) {
            this.inout = value;
        }

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the isView property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getIsView() {
            return isView;
        }

        /**
         * Sets the value of the isView property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setIsView(Integer value) {
            this.isView = value;
        }

        /**
         * Gets the value of the createdDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCreatedDate() {
            return createdDate;
        }

        /**
         * Sets the value of the createdDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCreatedDate(XMLGregorianCalendar value) {
            this.createdDate = value;
        }

    }

}
