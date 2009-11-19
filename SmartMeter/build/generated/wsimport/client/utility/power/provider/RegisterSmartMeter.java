
package utility.power.provider;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for registerSmartMeter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="registerSmartMeter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customerNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="meterID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="meterLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="meterDeviceInformation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="supportedConfigurationsInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "registerSmartMeter", propOrder = {
    "customerNumber",
    "meterID",
    "meterLocation",
    "meterDeviceInformation",
    "supportedConfigurationsInfo"
})
public class RegisterSmartMeter {

    protected String customerNumber;
    protected String meterID;
    protected String meterLocation;
    protected String meterDeviceInformation;
    protected String supportedConfigurationsInfo;

    /**
     * Gets the value of the customerNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerNumber() {
        return customerNumber;
    }

    /**
     * Sets the value of the customerNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerNumber(String value) {
        this.customerNumber = value;
    }

    /**
     * Gets the value of the meterID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeterID() {
        return meterID;
    }

    /**
     * Sets the value of the meterID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeterID(String value) {
        this.meterID = value;
    }

    /**
     * Gets the value of the meterLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeterLocation() {
        return meterLocation;
    }

    /**
     * Sets the value of the meterLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeterLocation(String value) {
        this.meterLocation = value;
    }

    /**
     * Gets the value of the meterDeviceInformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeterDeviceInformation() {
        return meterDeviceInformation;
    }

    /**
     * Sets the value of the meterDeviceInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeterDeviceInformation(String value) {
        this.meterDeviceInformation = value;
    }

    /**
     * Gets the value of the supportedConfigurationsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupportedConfigurationsInfo() {
        return supportedConfigurationsInfo;
    }

    /**
     * Sets the value of the supportedConfigurationsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupportedConfigurationsInfo(String value) {
        this.supportedConfigurationsInfo = value;
    }

}
