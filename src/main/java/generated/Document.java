//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.08.30 at 01:28:21 PM MSK 
//


package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="XmlData">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element ref="{}supplierpurchaserequest14cust"/>
 *                   &lt;element ref="{}supplierpurchaserequest24cust"/>
 *                 &lt;/choice>
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
    "id",
    "xmlData"
})
@XmlRootElement(name = "Document")
public class Document {

    @XmlElement(name = "ID")
    protected int id;
    @XmlElement(name = "XmlData", required = true)
    protected Document.XmlData xmlData;

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
     * Gets the value of the xmlData property.
     * 
     * @return
     *     possible object is
     *     {@link Document.XmlData }
     *     
     */
    public Document.XmlData getXmlData() {
        return xmlData;
    }

    /**
     * Sets the value of the xmlData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Document.XmlData }
     *     
     */
    public void setXmlData(Document.XmlData value) {
        this.xmlData = value;
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
     *       &lt;choice>
     *         &lt;element ref="{}supplierpurchaserequest14cust"/>
     *         &lt;element ref="{}supplierpurchaserequest24cust"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "supplierpurchaserequest14Cust",
        "supplierpurchaserequest24Cust"
    })
    public static class XmlData {

        @XmlElement(name = "supplierpurchaserequest14cust")
        protected Supplierpurchaserequest14Cust supplierpurchaserequest14Cust;
        @XmlElement(name = "supplierpurchaserequest24cust")
        protected Supplierpurchaserequest24Cust supplierpurchaserequest24Cust;

        /**
         * Gets the value of the supplierpurchaserequest14Cust property.
         * 
         * @return
         *     possible object is
         *     {@link Supplierpurchaserequest14Cust }
         *     
         */
        public Supplierpurchaserequest14Cust getSupplierpurchaserequest14Cust() {
            return supplierpurchaserequest14Cust;
        }

        /**
         * Sets the value of the supplierpurchaserequest14Cust property.
         * 
         * @param value
         *     allowed object is
         *     {@link Supplierpurchaserequest14Cust }
         *     
         */
        public void setSupplierpurchaserequest14Cust(Supplierpurchaserequest14Cust value) {
            this.supplierpurchaserequest14Cust = value;
        }

        /**
         * Gets the value of the supplierpurchaserequest24Cust property.
         * 
         * @return
         *     possible object is
         *     {@link Supplierpurchaserequest24Cust }
         *     
         */
        public Supplierpurchaserequest24Cust getSupplierpurchaserequest24Cust() {
            return supplierpurchaserequest24Cust;
        }

        /**
         * Sets the value of the supplierpurchaserequest24Cust property.
         * 
         * @param value
         *     allowed object is
         *     {@link Supplierpurchaserequest24Cust }
         *     
         */
        public void setSupplierpurchaserequest24Cust(Supplierpurchaserequest24Cust value) {
            this.supplierpurchaserequest24Cust = value;
        }

    }

}
