//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.14 at 05:55:13 PM MSK 
//


package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ComansFiles complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ComansFiles">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="comansfile" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="file" type="{}OptionalFileType" minOccurs="0"/>
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
@XmlType(name = "ComansFiles", propOrder = {

})
public class ComansFiles {

    protected ComansFiles.Comansfile comansfile;

    /**
     * Gets the value of the comansfile property.
     * 
     * @return
     *     possible object is
     *     {@link ComansFiles.Comansfile }
     *     
     */
    public ComansFiles.Comansfile getComansfile() {
        return comansfile;
    }

    /**
     * Sets the value of the comansfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComansFiles.Comansfile }
     *     
     */
    public void setComansfile(ComansFiles.Comansfile value) {
        this.comansfile = value;
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
     *         &lt;element name="file" type="{}OptionalFileType" minOccurs="0"/>
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
    public static class Comansfile {

        protected OptionalFileType file;

        /**
         * Gets the value of the file property.
         * 
         * @return
         *     possible object is
         *     {@link OptionalFileType }
         *     
         */
        public OptionalFileType getFile() {
            return file;
        }

        /**
         * Sets the value of the file property.
         * 
         * @param value
         *     allowed object is
         *     {@link OptionalFileType }
         *     
         */
        public void setFile(OptionalFileType value) {
            this.file = value;
        }

    }

}
