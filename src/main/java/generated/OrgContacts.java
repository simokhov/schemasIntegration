//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.08 at 11:03:48 AM MSK 
//


package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrgContacts complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrgContacts">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="orgname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orgtypeid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orgtype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orgplace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orgpostaddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orgemail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orgphones" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orgcontactperson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isspecorg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="forbuid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="forbuname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="specorgid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="specorgname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrgContacts", propOrder = {

})
public class OrgContacts {

    protected String orgname;
    protected String orgtypeid;
    protected String orgtype;
    protected String orgplace;
    protected String orgpostaddress;
    protected String orgemail;
    protected String orgphones;
    protected String orgcontactperson;
    protected String isspecorg;
    protected String forbuid;
    protected String forbuname;
    protected String specorgid;
    protected String specorgname;

    /**
     * Gets the value of the orgname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgname() {
        return orgname;
    }

    /**
     * Sets the value of the orgname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgname(String value) {
        this.orgname = value;
    }

    /**
     * Gets the value of the orgtypeid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgtypeid() {
        return orgtypeid;
    }

    /**
     * Sets the value of the orgtypeid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgtypeid(String value) {
        this.orgtypeid = value;
    }

    /**
     * Gets the value of the orgtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgtype() {
        return orgtype;
    }

    /**
     * Sets the value of the orgtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgtype(String value) {
        this.orgtype = value;
    }

    /**
     * Gets the value of the orgplace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgplace() {
        return orgplace;
    }

    /**
     * Sets the value of the orgplace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgplace(String value) {
        this.orgplace = value;
    }

    /**
     * Gets the value of the orgpostaddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgpostaddress() {
        return orgpostaddress;
    }

    /**
     * Sets the value of the orgpostaddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgpostaddress(String value) {
        this.orgpostaddress = value;
    }

    /**
     * Gets the value of the orgemail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgemail() {
        return orgemail;
    }

    /**
     * Sets the value of the orgemail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgemail(String value) {
        this.orgemail = value;
    }

    /**
     * Gets the value of the orgphones property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgphones() {
        return orgphones;
    }

    /**
     * Sets the value of the orgphones property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgphones(String value) {
        this.orgphones = value;
    }

    /**
     * Gets the value of the orgcontactperson property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgcontactperson() {
        return orgcontactperson;
    }

    /**
     * Sets the value of the orgcontactperson property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgcontactperson(String value) {
        this.orgcontactperson = value;
    }

    /**
     * Gets the value of the isspecorg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsspecorg() {
        return isspecorg;
    }

    /**
     * Sets the value of the isspecorg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsspecorg(String value) {
        this.isspecorg = value;
    }

    /**
     * Gets the value of the forbuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForbuid() {
        return forbuid;
    }

    /**
     * Sets the value of the forbuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForbuid(String value) {
        this.forbuid = value;
    }

    /**
     * Gets the value of the forbuname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForbuname() {
        return forbuname;
    }

    /**
     * Sets the value of the forbuname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForbuname(String value) {
        this.forbuname = value;
    }

    /**
     * Gets the value of the specorgid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecorgid() {
        return specorgid;
    }

    /**
     * Sets the value of the specorgid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecorgid(String value) {
        this.specorgid = value;
    }

    /**
     * Gets the value of the specorgname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecorgname() {
        return specorgname;
    }

    /**
     * Sets the value of the specorgname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecorgname(String value) {
        this.specorgname = value;
    }

}
