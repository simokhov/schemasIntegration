//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.08.30 at 01:35:51 PM MSK 
//


package generated;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for commissionMemberPresense complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="commissionMemberPresense">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="commissionMember" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" maxOccurs="unbounded"/>
 *         &lt;element name="oosCommissionMember" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" maxOccurs="unbounded"/>
 *         &lt;element name="esopCommissionMember" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" maxOccurs="unbounded"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "commissionMemberPresense", propOrder = {
    "commissionMember",
    "oosCommissionMember",
    "esopCommissionMember"
})
public class CommissionMemberPresense {

    @XmlSchemaType(name = "positiveInteger")
    protected List<BigInteger> commissionMember;
    @XmlSchemaType(name = "positiveInteger")
    protected List<BigInteger> oosCommissionMember;
    @XmlSchemaType(name = "positiveInteger")
    protected List<BigInteger> esopCommissionMember;

    /**
     * Gets the value of the commissionMember property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commissionMember property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommissionMember().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getCommissionMember() {
        if (commissionMember == null) {
            commissionMember = new ArrayList<BigInteger>();
        }
        return this.commissionMember;
    }

    /**
     * Gets the value of the oosCommissionMember property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the oosCommissionMember property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOosCommissionMember().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getOosCommissionMember() {
        if (oosCommissionMember == null) {
            oosCommissionMember = new ArrayList<BigInteger>();
        }
        return this.oosCommissionMember;
    }

    /**
     * Gets the value of the esopCommissionMember property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the esopCommissionMember property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEsopCommissionMember().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getEsopCommissionMember() {
        if (esopCommissionMember == null) {
            esopCommissionMember = new ArrayList<BigInteger>();
        }
        return this.esopCommissionMember;
    }

}
