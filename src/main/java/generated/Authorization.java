//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.08.30 at 01:35:51 PM MSK 
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
 *         &lt;element name="INN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="KPP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="buFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="buID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniqueToken" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PersonFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "inn",
    "kpp",
    "buFullName",
    "buID",
    "uniqueToken",
    "personFullName"
})
@XmlRootElement(name = "Authorization")
public class Authorization {

    @XmlElement(name = "INN", required = true)
    protected String inn;
    @XmlElement(name = "KPP")
    protected String kpp;
    protected String buFullName;
    protected String buID;
    @XmlElement(name = "UniqueToken", required = true)
    protected String uniqueToken;
    @XmlElement(name = "PersonFullName")
    protected String personFullName;

    /**
     * Gets the value of the inn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINN() {
        return inn;
    }

    /**
     * Sets the value of the inn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINN(String value) {
        this.inn = value;
    }

    /**
     * Gets the value of the kpp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKPP() {
        return kpp;
    }

    /**
     * Sets the value of the kpp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKPP(String value) {
        this.kpp = value;
    }

    /**
     * Gets the value of the buFullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuFullName() {
        return buFullName;
    }

    /**
     * Sets the value of the buFullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuFullName(String value) {
        this.buFullName = value;
    }

    /**
     * Gets the value of the buID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuID() {
        return buID;
    }

    /**
     * Sets the value of the buID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuID(String value) {
        this.buID = value;
    }

    /**
     * Gets the value of the uniqueToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniqueToken() {
        return uniqueToken;
    }

    /**
     * Sets the value of the uniqueToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqueToken(String value) {
        this.uniqueToken = value;
    }

    /**
     * Gets the value of the personFullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonFullName() {
        return personFullName;
    }

    /**
     * Sets the value of the personFullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonFullName(String value) {
        this.personFullName = value;
    }

}
