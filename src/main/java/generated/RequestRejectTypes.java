//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.12 at 12:12:25 PM MSK 
//


package generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Пункты закона, на основе которых отклонена заявка.
 * 			
 * 
 * <p>Java class for RequestRejectTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestRejectTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rejecttype" type="{}rejectTypeByLaw" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestRejectTypes", propOrder = {
    "rejecttype"
})
public class RequestRejectTypes {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected List<RejectTypeByLaw> rejecttype;

    /**
     * Gets the value of the rejecttype property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rejecttype property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRejecttype().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RejectTypeByLaw }
     * 
     * 
     */
    public List<RejectTypeByLaw> getRejecttype() {
        if (rejecttype == null) {
            rejecttype = new ArrayList<RejectTypeByLaw>();
        }
        return this.rejecttype;
    }

}
