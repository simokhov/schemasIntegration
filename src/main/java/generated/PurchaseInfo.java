//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.08.30 at 01:35:51 PM MSK 
//


package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PurchaseInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PurchaseInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="purchid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="purchcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="purchname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="custname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="publicdate" type="{}NullableRuDateType" minOccurs="0"/>
 *         &lt;element name="purchamount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PurchaseInfo", propOrder = {

})
public class PurchaseInfo {

    protected String purchid;
    protected String purchcode;
    protected String purchname;
    protected String custname;
    protected String publicdate;
    protected String purchamount;

    /**
     * Gets the value of the purchid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchid() {
        return purchid;
    }

    /**
     * Sets the value of the purchid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchid(String value) {
        this.purchid = value;
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
     * Gets the value of the custname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustname() {
        return custname;
    }

    /**
     * Sets the value of the custname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustname(String value) {
        this.custname = value;
    }

    /**
     * Gets the value of the publicdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicdate() {
        return publicdate;
    }

    /**
     * Sets the value of the publicdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicdate(String value) {
        this.publicdate = value;
    }

    /**
     * Gets the value of the purchamount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchamount() {
        return purchamount;
    }

    /**
     * Sets the value of the purchamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchamount(String value) {
        this.purchamount = value;
    }

}
