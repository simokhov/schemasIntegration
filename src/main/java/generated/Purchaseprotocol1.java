//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.14 at 05:55:13 PM MSK 
//


package generated;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="purchid" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="purchtype" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="purchcode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="purchversion" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="purchname">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="req4custdate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="requestacceptdate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="notificationfeatures">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="notificationfeature" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="placementfeature">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="featuretypename" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
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
 *         &lt;element name="supplierpurchaserequest14cust">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="supprequest" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="reqno" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                             &lt;element name="reqdate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="reqid" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                             &lt;element name="reqstate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="rejectreason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="protocoldoc">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="file">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="fileid" type="{}GUID"/>
 *                             &lt;element name="filename" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="signinfo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="hash" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *                             &lt;element name="sign" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="signrequired" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
 *         &lt;element name="agreenotchange" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "purchid",
    "purchtype",
    "purchcode",
    "purchversion",
    "purchname",
    "req4Custdate",
    "requestacceptdate",
    "notificationfeatures",
    "supplierpurchaserequest14Cust",
    "protocoldoc",
    "agreenotchange"
})
@XmlRootElement(name = "purchaseprotocol1")
public class Purchaseprotocol1 {

    @XmlElement(required = true)
    protected BigInteger purchid;
    @XmlElement(required = true)
    protected String purchtype;
    @XmlElement(required = true)
    protected String purchcode;
    @XmlElement(required = true)
    protected BigInteger purchversion;
    @XmlElement(required = true)
    protected String purchname;
    @XmlElement(name = "req4custdate", required = true)
    protected String req4Custdate;
    @XmlElement(required = true)
    protected String requestacceptdate;
    @XmlElement(required = true)
    protected Purchaseprotocol1 .Notificationfeatures notificationfeatures;
    @XmlElement(name = "supplierpurchaserequest14cust", required = true)
    protected Purchaseprotocol1 .Supplierpurchaserequest14Cust supplierpurchaserequest14Cust;
    @XmlElement(required = true)
    protected Purchaseprotocol1 .Protocoldoc protocoldoc;
    protected Boolean agreenotchange;

    /**
     * Gets the value of the purchid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPurchid() {
        return purchid;
    }

    /**
     * Sets the value of the purchid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPurchid(BigInteger value) {
        this.purchid = value;
    }

    /**
     * Gets the value of the purchtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchtype() {
        return purchtype;
    }

    /**
     * Sets the value of the purchtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchtype(String value) {
        this.purchtype = value;
    }

    /**
     * Gets the value of the purchcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchcode() {
        return purchcode;
    }

    /**
     * Sets the value of the purchcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchcode(String value) {
        this.purchcode = value;
    }

    /**
     * Gets the value of the purchversion property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPurchversion() {
        return purchversion;
    }

    /**
     * Sets the value of the purchversion property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPurchversion(BigInteger value) {
        this.purchversion = value;
    }

    /**
     * Gets the value of the purchname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchname() {
        return purchname;
    }

    /**
     * Sets the value of the purchname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchname(String value) {
        this.purchname = value;
    }

    /**
     * Gets the value of the req4Custdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReq4Custdate() {
        return req4Custdate;
    }

    /**
     * Sets the value of the req4Custdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReq4Custdate(String value) {
        this.req4Custdate = value;
    }

    /**
     * Gets the value of the requestacceptdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestacceptdate() {
        return requestacceptdate;
    }

    /**
     * Sets the value of the requestacceptdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestacceptdate(String value) {
        this.requestacceptdate = value;
    }

    /**
     * Gets the value of the notificationfeatures property.
     * 
     * @return
     *     possible object is
     *     {@link Purchaseprotocol1 .Notificationfeatures }
     *     
     */
    public Purchaseprotocol1 .Notificationfeatures getNotificationfeatures() {
        return notificationfeatures;
    }

    /**
     * Sets the value of the notificationfeatures property.
     * 
     * @param value
     *     allowed object is
     *     {@link Purchaseprotocol1 .Notificationfeatures }
     *     
     */
    public void setNotificationfeatures(Purchaseprotocol1 .Notificationfeatures value) {
        this.notificationfeatures = value;
    }

    /**
     * Gets the value of the supplierpurchaserequest14Cust property.
     * 
     * @return
     *     possible object is
     *     {@link Purchaseprotocol1 .Supplierpurchaserequest14Cust }
     *     
     */
    public Purchaseprotocol1 .Supplierpurchaserequest14Cust getSupplierpurchaserequest14Cust() {
        return supplierpurchaserequest14Cust;
    }

    /**
     * Sets the value of the supplierpurchaserequest14Cust property.
     * 
     * @param value
     *     allowed object is
     *     {@link Purchaseprotocol1 .Supplierpurchaserequest14Cust }
     *     
     */
    public void setSupplierpurchaserequest14Cust(Purchaseprotocol1 .Supplierpurchaserequest14Cust value) {
        this.supplierpurchaserequest14Cust = value;
    }

    /**
     * Gets the value of the protocoldoc property.
     * 
     * @return
     *     possible object is
     *     {@link Purchaseprotocol1 .Protocoldoc }
     *     
     */
    public Purchaseprotocol1 .Protocoldoc getProtocoldoc() {
        return protocoldoc;
    }

    /**
     * Sets the value of the protocoldoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Purchaseprotocol1 .Protocoldoc }
     *     
     */
    public void setProtocoldoc(Purchaseprotocol1 .Protocoldoc value) {
        this.protocoldoc = value;
    }

    /**
     * Gets the value of the agreenotchange property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAgreenotchange() {
        return agreenotchange;
    }

    /**
     * Sets the value of the agreenotchange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAgreenotchange(Boolean value) {
        this.agreenotchange = value;
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
     *         &lt;element name="notificationfeature" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="placementfeature">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="featuretypename" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "notificationfeature"
    })
    public static class Notificationfeatures {

        protected List<Purchaseprotocol1 .Notificationfeatures.Notificationfeature> notificationfeature;

        /**
         * Gets the value of the notificationfeature property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the notificationfeature property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNotificationfeature().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Purchaseprotocol1 .Notificationfeatures.Notificationfeature }
         * 
         * 
         */
        public List<Purchaseprotocol1 .Notificationfeatures.Notificationfeature> getNotificationfeature() {
            if (notificationfeature == null) {
                notificationfeature = new ArrayList<Purchaseprotocol1 .Notificationfeatures.Notificationfeature>();
            }
            return this.notificationfeature;
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
         *         &lt;element name="placementfeature">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="featuretypename" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "placementfeature"
        })
        public static class Notificationfeature {

            @XmlElement(required = true)
            protected Purchaseprotocol1 .Notificationfeatures.Notificationfeature.Placementfeature placementfeature;

            /**
             * Gets the value of the placementfeature property.
             * 
             * @return
             *     possible object is
             *     {@link Purchaseprotocol1 .Notificationfeatures.Notificationfeature.Placementfeature }
             *     
             */
            public Purchaseprotocol1 .Notificationfeatures.Notificationfeature.Placementfeature getPlacementfeature() {
                return placementfeature;
            }

            /**
             * Sets the value of the placementfeature property.
             * 
             * @param value
             *     allowed object is
             *     {@link Purchaseprotocol1 .Notificationfeatures.Notificationfeature.Placementfeature }
             *     
             */
            public void setPlacementfeature(Purchaseprotocol1 .Notificationfeatures.Notificationfeature.Placementfeature value) {
                this.placementfeature = value;
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
             *         &lt;element name="featuretypename" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "featuretypename",
                "name"
            })
            public static class Placementfeature {

                @XmlElement(required = true)
                protected String featuretypename;
                @XmlElement(required = true)
                protected String name;

                /**
                 * Gets the value of the featuretypename property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFeaturetypename() {
                    return featuretypename;
                }

                /**
                 * Sets the value of the featuretypename property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFeaturetypename(String value) {
                    this.featuretypename = value;
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

            }

        }

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
     *         &lt;element name="file">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="fileid" type="{}GUID"/>
     *                   &lt;element name="filename" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="signinfo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="hash" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
     *                   &lt;element name="sign" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="signrequired" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "file"
    })
    public static class Protocoldoc {

        @XmlElement(required = true)
        protected Purchaseprotocol1 .Protocoldoc.File file;

        /**
         * Gets the value of the file property.
         * 
         * @return
         *     possible object is
         *     {@link Purchaseprotocol1 .Protocoldoc.File }
         *     
         */
        public Purchaseprotocol1 .Protocoldoc.File getFile() {
            return file;
        }

        /**
         * Sets the value of the file property.
         * 
         * @param value
         *     allowed object is
         *     {@link Purchaseprotocol1 .Protocoldoc.File }
         *     
         */
        public void setFile(Purchaseprotocol1 .Protocoldoc.File value) {
            this.file = value;
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
         *         &lt;element name="fileid" type="{}GUID"/>
         *         &lt;element name="filename" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="signinfo" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="hash" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
         *         &lt;element name="sign" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="signrequired" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "fileid",
            "filename",
            "signinfo",
            "hash",
            "sign",
            "signrequired"
        })
        public static class File {

            @XmlElement(required = true)
            protected String fileid;
            @XmlElement(required = true)
            protected String filename;
            @XmlElement(required = true)
            protected String signinfo;
            @XmlElement(required = true)
            protected byte[] hash;
            @XmlElement(required = true)
            protected String sign;
            @XmlElement(required = true)
            protected String signrequired;

            /**
             * Gets the value of the fileid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFileid() {
                return fileid;
            }

            /**
             * Sets the value of the fileid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFileid(String value) {
                this.fileid = value;
            }

            /**
             * Gets the value of the filename property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFilename() {
                return filename;
            }

            /**
             * Sets the value of the filename property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFilename(String value) {
                this.filename = value;
            }

            /**
             * Gets the value of the signinfo property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSigninfo() {
                return signinfo;
            }

            /**
             * Sets the value of the signinfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSigninfo(String value) {
                this.signinfo = value;
            }

            /**
             * Gets the value of the hash property.
             * 
             * @return
             *     possible object is
             *     byte[]
             */
            public byte[] getHash() {
                return hash;
            }

            /**
             * Sets the value of the hash property.
             * 
             * @param value
             *     allowed object is
             *     byte[]
             */
            public void setHash(byte[] value) {
                this.hash = value;
            }

            /**
             * Gets the value of the sign property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSign() {
                return sign;
            }

            /**
             * Sets the value of the sign property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSign(String value) {
                this.sign = value;
            }

            /**
             * Gets the value of the signrequired property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSignrequired() {
                return signrequired;
            }

            /**
             * Sets the value of the signrequired property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSignrequired(String value) {
                this.signrequired = value;
            }

        }

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
     *         &lt;element name="supprequest" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="reqno" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *                   &lt;element name="reqdate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="reqid" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *                   &lt;element name="reqstate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="rejectreason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "supprequest"
    })
    public static class Supplierpurchaserequest14Cust {

        @XmlElement(required = true)
        protected List<Purchaseprotocol1 .Supplierpurchaserequest14Cust.Supprequest> supprequest;

        /**
         * Gets the value of the supprequest property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the supprequest property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSupprequest().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Purchaseprotocol1 .Supplierpurchaserequest14Cust.Supprequest }
         * 
         * 
         */
        public List<Purchaseprotocol1 .Supplierpurchaserequest14Cust.Supprequest> getSupprequest() {
            if (supprequest == null) {
                supprequest = new ArrayList<Purchaseprotocol1 .Supplierpurchaserequest14Cust.Supprequest>();
            }
            return this.supprequest;
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
         *         &lt;element name="reqno" type="{http://www.w3.org/2001/XMLSchema}integer"/>
         *         &lt;element name="reqdate" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="reqid" type="{http://www.w3.org/2001/XMLSchema}integer"/>
         *         &lt;element name="reqstate" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="rejectreason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "reqno",
            "reqdate",
            "reqid",
            "reqstate",
            "rejectreason"
        })
        public static class Supprequest {

            @XmlElement(required = true)
            protected BigInteger reqno;
            @XmlElement(required = true)
            protected String reqdate;
            @XmlElement(required = true)
            protected BigInteger reqid;
            @XmlElement(required = true)
            protected String reqstate;
            protected String rejectreason;

            /**
             * Gets the value of the reqno property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getReqno() {
                return reqno;
            }

            /**
             * Sets the value of the reqno property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setReqno(BigInteger value) {
                this.reqno = value;
            }

            /**
             * Gets the value of the reqdate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReqdate() {
                return reqdate;
            }

            /**
             * Sets the value of the reqdate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReqdate(String value) {
                this.reqdate = value;
            }

            /**
             * Gets the value of the reqid property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getReqid() {
                return reqid;
            }

            /**
             * Sets the value of the reqid property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setReqid(BigInteger value) {
                this.reqid = value;
            }

            /**
             * Gets the value of the reqstate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReqstate() {
                return reqstate;
            }

            /**
             * Sets the value of the reqstate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReqstate(String value) {
                this.reqstate = value;
            }

            /**
             * Gets the value of the rejectreason property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRejectreason() {
                return rejectreason;
            }

            /**
             * Sets the value of the rejectreason property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRejectreason(String value) {
                this.rejectreason = value;
            }

        }

    }

}
