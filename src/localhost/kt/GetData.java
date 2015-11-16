
package localhost.kt;

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
 *         &lt;element name="Report" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StructureParameters" type="{http://v8.1c.ru/8.1/data/core}ValueStorage"/>
 *         &lt;element name="StrLog" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "report",
    "structureParameters",
    "strLog"
})
@XmlRootElement(name = "GetData")
public class GetData {

    @XmlElement(name = "Report", required = true)
    protected String report;
    @XmlElement(name = "StructureParameters", required = true)
    protected byte[] structureParameters;
    @XmlElement(name = "StrLog", required = true, nillable = true)
    protected String strLog;

    /**
     * Gets the value of the report property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReport() {
        return report;
    }

    /**
     * Sets the value of the report property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReport(String value) {
        this.report = value;
    }

    /**
     * Gets the value of the structureParameters property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getStructureParameters() {
        return structureParameters;
    }

    /**
     * Sets the value of the structureParameters property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setStructureParameters(byte[] value) {
        this.structureParameters = value;
    }

    /**
     * Gets the value of the strLog property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrLog() {
        return strLog;
    }

    /**
     * Sets the value of the strLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrLog(String value) {
        this.strLog = value;
    }

}
