//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.06 at 12:38:49 PM MSK 
//


package generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequiredDocs22 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequiredDocs22">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="requireddoctype" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="needdoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="prddoctype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="prddoctypename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="requireddoc" type="{}RequiredDoc" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="requireddoc" type="{}RequiredDoc" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequiredDocs22", propOrder = {
    "requireddoctype",
    "requireddoc"
})
public class RequiredDocs22 {

    protected List<RequiredDocs22 .Requireddoctype> requireddoctype;
    protected List<RequiredDoc> requireddoc;

    /**
     * Gets the value of the requireddoctype property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requireddoctype property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequireddoctype().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequiredDocs22 .Requireddoctype }
     * 
     * 
     */
    public List<RequiredDocs22 .Requireddoctype> getRequireddoctype() {
        if (requireddoctype == null) {
            requireddoctype = new ArrayList<RequiredDocs22 .Requireddoctype>();
        }
        return this.requireddoctype;
    }

    /**
     * Gets the value of the requireddoc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requireddoc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequireddoc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequiredDoc }
     * 
     * 
     */
    public List<RequiredDoc> getRequireddoc() {
        if (requireddoc == null) {
            requireddoc = new ArrayList<RequiredDoc>();
        }
        return this.requireddoc;
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
     *         &lt;element name="needdoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="prddoctype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="prddoctypename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="requireddoc" type="{}RequiredDoc" maxOccurs="unbounded" minOccurs="0"/>
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
        "needdoc",
        "prddoctype",
        "prddoctypename",
        "requireddoc"
    })
    public static class Requireddoctype {

        protected String needdoc;
        protected String prddoctype;
        protected String prddoctypename;
        protected List<RequiredDoc> requireddoc;

        /**
         * Gets the value of the needdoc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNeeddoc() {
            return needdoc;
        }

        /**
         * Sets the value of the needdoc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNeeddoc(String value) {
            this.needdoc = value;
        }

        /**
         * Gets the value of the prddoctype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPrddoctype() {
            return prddoctype;
        }

        /**
         * Sets the value of the prddoctype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPrddoctype(String value) {
            this.prddoctype = value;
        }

        /**
         * Gets the value of the prddoctypename property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPrddoctypename() {
            return prddoctypename;
        }

        /**
         * Sets the value of the prddoctypename property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPrddoctypename(String value) {
            this.prddoctypename = value;
        }

        /**
         * Gets the value of the requireddoc property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the requireddoc property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRequireddoc().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RequiredDoc }
         * 
         * 
         */
        public List<RequiredDoc> getRequireddoc() {
            if (requireddoc == null) {
                requireddoc = new ArrayList<RequiredDoc>();
            }
            return this.requireddoc;
        }

    }

}