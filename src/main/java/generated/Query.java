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
 *         &lt;element name="DocType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bdate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="edate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="kindname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="docinout" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="purchcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "docType",
    "bdate",
    "edate",
    "kindname",
    "docinout",
    "purchcode"
})
@XmlRootElement(name = "query")
public class Query {

    @XmlElement(name = "DocType")
    protected int docType;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar bdate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar edate;
    protected String kindname;
    protected Integer docinout;
    protected String purchcode;

    /**
     * Gets the value of the docType property.
     * 
     */
    public int getDocType() {
        return docType;
    }

    /**
     * Sets the value of the docType property.
     * 
     */
    public void setDocType(int value) {
        this.docType = value;
    }

    /**
     * Gets the value of the bdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBdate() {
        return bdate;
    }

    /**
     * Sets the value of the bdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBdate(XMLGregorianCalendar value) {
        this.bdate = value;
    }

    /**
     * Gets the value of the edate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEdate() {
        return edate;
    }

    /**
     * Sets the value of the edate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEdate(XMLGregorianCalendar value) {
        this.edate = value;
    }

    /**
     * Gets the value of the kindname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKindname() {
        return kindname;
    }

    /**
     * Sets the value of the kindname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKindname(String value) {
        this.kindname = value;
    }

    /**
     * Gets the value of the docinout property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDocinout() {
        return docinout;
    }

    /**
     * Sets the value of the docinout property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDocinout(Integer value) {
        this.docinout = value;
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

}
