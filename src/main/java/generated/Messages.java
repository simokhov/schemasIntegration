//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.11 at 06:03:42 PM MSK 
//


package generated;

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
 *         &lt;element name="Message" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ResultMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ResultObjectID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="DocId" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "message"
})
@XmlRootElement(name = "Messages")
public class Messages {

    @XmlElement(name = "Message", required = true)
    protected List<Messages.Message> message;

    /**
     * Gets the value of the message property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the message property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Messages.Message }
     * 
     * 
     */
    public List<Messages.Message> getMessage() {
        if (message == null) {
            message = new ArrayList<Messages.Message>();
        }
        return this.message;
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
     *         &lt;element name="ResultMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ResultObjectID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="DocId" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
        "resultMessage",
        "resultObjectID",
        "docId"
    })
    public static class Message {

        @XmlElement(name = "ResultMessage", required = true)
        protected String resultMessage;
        @XmlElement(name = "ResultObjectID", required = true)
        protected String resultObjectID;
        @XmlElement(name = "DocId")
        protected int docId;

        /**
         * Gets the value of the resultMessage property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResultMessage() {
            return resultMessage;
        }

        /**
         * Sets the value of the resultMessage property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResultMessage(String value) {
            this.resultMessage = value;
        }

        /**
         * Gets the value of the resultObjectID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResultObjectID() {
            return resultObjectID;
        }

        /**
         * Sets the value of the resultObjectID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResultObjectID(String value) {
            this.resultObjectID = value;
        }

        /**
         * Gets the value of the docId property.
         * 
         */
        public int getDocId() {
            return docId;
        }

        /**
         * Sets the value of the docId property.
         * 
         */
        public void setDocId(int value) {
            this.docId = value;
        }

    }

}
