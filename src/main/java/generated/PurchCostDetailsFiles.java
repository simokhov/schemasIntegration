//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.12 at 12:10:25 PM MSK 
//


package generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PurchCostDetailsFiles complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PurchCostDetailsFiles">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="ispurchcostdetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalcostpurchdetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="purchcostdetails" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="purchcostdetail" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="file" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PurchCostDetailsFiles", propOrder = {

})
public class PurchCostDetailsFiles {

    protected String ispurchcostdetails;
    protected String totalcostpurchdetails;
    protected PurchCostDetailsFiles.Purchcostdetails purchcostdetails;

    /**
     * Gets the value of the ispurchcostdetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIspurchcostdetails() {
        return ispurchcostdetails;
    }

    /**
     * Sets the value of the ispurchcostdetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIspurchcostdetails(String value) {
        this.ispurchcostdetails = value;
    }

    /**
     * Gets the value of the totalcostpurchdetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalcostpurchdetails() {
        return totalcostpurchdetails;
    }

    /**
     * Sets the value of the totalcostpurchdetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalcostpurchdetails(String value) {
        this.totalcostpurchdetails = value;
    }

    /**
     * Gets the value of the purchcostdetails property.
     * 
     * @return
     *     possible object is
     *     {@link PurchCostDetailsFiles.Purchcostdetails }
     *     
     */
    public PurchCostDetailsFiles.Purchcostdetails getPurchcostdetails() {
        return purchcostdetails;
    }

    /**
     * Sets the value of the purchcostdetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchCostDetailsFiles.Purchcostdetails }
     *     
     */
    public void setPurchcostdetails(PurchCostDetailsFiles.Purchcostdetails value) {
        this.purchcostdetails = value;
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
     *         &lt;element name="purchcostdetail" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="file" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
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
        "purchcostdetail"
    })
    public static class Purchcostdetails {

        protected PurchCostDetailsFiles.Purchcostdetails.Purchcostdetail purchcostdetail;

        /**
         * Gets the value of the purchcostdetail property.
         * 
         * @return
         *     possible object is
         *     {@link PurchCostDetailsFiles.Purchcostdetails.Purchcostdetail }
         *     
         */
        public PurchCostDetailsFiles.Purchcostdetails.Purchcostdetail getPurchcostdetail() {
            return purchcostdetail;
        }

        /**
         * Sets the value of the purchcostdetail property.
         * 
         * @param value
         *     allowed object is
         *     {@link PurchCostDetailsFiles.Purchcostdetails.Purchcostdetail }
         *     
         */
        public void setPurchcostdetail(PurchCostDetailsFiles.Purchcostdetails.Purchcostdetail value) {
            this.purchcostdetail = value;
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
         *         &lt;element name="file" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
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
            "file"
        })
        public static class Purchcostdetail {

            protected List<Object> file;

            /**
             * Gets the value of the file property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the file property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFile().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Object }
             * 
             * 
             */
            public List<Object> getFile() {
                if (file == null) {
                    file = new ArrayList<Object>();
                }
                return this.file;
            }

        }

    }

}
