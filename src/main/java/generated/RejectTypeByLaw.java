//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.08.08 at 01:27:10 PM MSK 
//


package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for rejectTypeByLaw.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="rejectTypeByLaw">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="R_P1"/>
 *     &lt;enumeration value="R_P1N"/>
 *     &lt;enumeration value="R_P2"/>
 *     &lt;enumeration value="R_P3"/>
 *     &lt;enumeration value="R_P4"/>
 *     &lt;enumeration value="Rejected_1_4_67_FL44"/>
 *     &lt;enumeration value="Rejected_2_4_67_FL44"/>
 *     &lt;enumeration value="Rejected_1_6_69_FL44"/>
 *     &lt;enumeration value="Rejected_2_6_69_FL44"/>
 *     &lt;enumeration value="Rejected_1_31_FL44"/>
 *     &lt;enumeration value="Rejected_9_31_FL44"/>
 *     &lt;enumeration value="Excluded_3_66_FL44"/>
 *     &lt;enumeration value="Excluded_3_66N_FL44"/>
 *     &lt;enumeration value="Excluded_5_66_FL44"/>
 *     &lt;enumeration value="Excluded_14_FL44"/>
 *     &lt;enumeration value="Rejected_11_24__3_5_66_FL44"/>
 *     &lt;enumeration value="Rejected_14_FL44"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "rejectTypeByLaw")
@XmlEnum
public enum RejectTypeByLaw {

    @XmlEnumValue("R_P1")
    R_P_1("R_P1"),
    @XmlEnumValue("R_P1N")
    R_P_1_N("R_P1N"),
    @XmlEnumValue("R_P2")
    R_P_2("R_P2"),
    @XmlEnumValue("R_P3")
    R_P_3("R_P3"),
    @XmlEnumValue("R_P4")
    R_P_4("R_P4"),
    @XmlEnumValue("Rejected_1_4_67_FL44")
    REJECTED_1_4_67_FL_44("Rejected_1_4_67_FL44"),
    @XmlEnumValue("Rejected_2_4_67_FL44")
    REJECTED_2_4_67_FL_44("Rejected_2_4_67_FL44"),
    @XmlEnumValue("Rejected_1_6_69_FL44")
    REJECTED_1_6_69_FL_44("Rejected_1_6_69_FL44"),
    @XmlEnumValue("Rejected_2_6_69_FL44")
    REJECTED_2_6_69_FL_44("Rejected_2_6_69_FL44"),
    @XmlEnumValue("Rejected_1_31_FL44")
    REJECTED_1_31_FL_44("Rejected_1_31_FL44"),
    @XmlEnumValue("Rejected_9_31_FL44")
    REJECTED_9_31_FL_44("Rejected_9_31_FL44"),
    @XmlEnumValue("Excluded_3_66_FL44")
    EXCLUDED_3_66_FL_44("Excluded_3_66_FL44"),
    @XmlEnumValue("Excluded_3_66N_FL44")
    EXCLUDED_3_66_N_FL_44("Excluded_3_66N_FL44"),
    @XmlEnumValue("Excluded_5_66_FL44")
    EXCLUDED_5_66_FL_44("Excluded_5_66_FL44"),
    @XmlEnumValue("Excluded_14_FL44")
    EXCLUDED_14_FL_44("Excluded_14_FL44"),
    @XmlEnumValue("Rejected_11_24__3_5_66_FL44")
    REJECTED_11_24_3_5_66_FL_44("Rejected_11_24__3_5_66_FL44"),
    @XmlEnumValue("Rejected_14_FL44")
    REJECTED_14_FL_44("Rejected_14_FL44");
    private final String value;

    RejectTypeByLaw(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RejectTypeByLaw fromValue(String v) {
        for (RejectTypeByLaw c: RejectTypeByLaw.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
