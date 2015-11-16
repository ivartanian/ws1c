
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
 *         &lt;element name="return" type="{http://v8.1c.ru/8.1/data/core}ValueStorage"/>
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
    "_return",
    "strLog"
})
@XmlRootElement(name = "GetDataResponse")
public class GetDataResponse {

    @XmlElement(name = "return", required = true, nillable = true)
    protected byte[] _return;
    @XmlElement(name = "StrLog", required = true, nillable = true)
    protected String strLog;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setReturn(byte[] value) {
        this._return = value;
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
