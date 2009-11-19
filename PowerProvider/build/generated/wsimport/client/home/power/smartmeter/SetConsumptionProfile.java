
package home.power.smartmeter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setConsumptionProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setConsumptionProfile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="newPowerLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setConsumptionProfile", propOrder = {
    "newPowerLevel"
})
public class SetConsumptionProfile {

    protected String newPowerLevel;

    /**
     * Gets the value of the newPowerLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewPowerLevel() {
        return newPowerLevel;
    }

    /**
     * Sets the value of the newPowerLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewPowerLevel(String value) {
        this.newPowerLevel = value;
    }

}
