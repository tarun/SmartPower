
package home.power.smartmeter;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the home.power.smartmeter package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _RequestPowerConfiguration_QNAME = new QName("http://smartmeter.power.home/", "requestPowerConfiguration");
    private final static QName _TellPowerConfigurationResponse_QNAME = new QName("http://smartmeter.power.home/", "tellPowerConfigurationResponse");
    private final static QName _TellPowerConfiguration_QNAME = new QName("http://smartmeter.power.home/", "tellPowerConfiguration");
    private final static QName _UnregisterDevice_QNAME = new QName("http://smartmeter.power.home/", "unregisterDevice");
    private final static QName _RegisterDevice_QNAME = new QName("http://smartmeter.power.home/", "registerDevice");
    private final static QName _RegisterDeviceForProgramming_QNAME = new QName("http://smartmeter.power.home/", "registerDeviceForProgramming");
    private final static QName _RegisterDeviceResponse_QNAME = new QName("http://smartmeter.power.home/", "registerDeviceResponse");
    private final static QName _RequestPowerConfigurationResponse_QNAME = new QName("http://smartmeter.power.home/", "requestPowerConfigurationResponse");
    private final static QName _RegisterDeviceForProgrammingResponse_QNAME = new QName("http://smartmeter.power.home/", "registerDeviceForProgrammingResponse");
    private final static QName _UnregisterDeviceResponse_QNAME = new QName("http://smartmeter.power.home/", "unregisterDeviceResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: home.power.smartmeter
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RegisterDevice }
     * 
     */
    public RegisterDevice createRegisterDevice() {
        return new RegisterDevice();
    }

    /**
     * Create an instance of {@link RegisterDeviceForProgrammingResponse }
     * 
     */
    public RegisterDeviceForProgrammingResponse createRegisterDeviceForProgrammingResponse() {
        return new RegisterDeviceForProgrammingResponse();
    }

    /**
     * Create an instance of {@link UnregisterDevice }
     * 
     */
    public UnregisterDevice createUnregisterDevice() {
        return new UnregisterDevice();
    }

    /**
     * Create an instance of {@link RequestPowerConfigurationResponse }
     * 
     */
    public RequestPowerConfigurationResponse createRequestPowerConfigurationResponse() {
        return new RequestPowerConfigurationResponse();
    }

    /**
     * Create an instance of {@link UnregisterDeviceResponse }
     * 
     */
    public UnregisterDeviceResponse createUnregisterDeviceResponse() {
        return new UnregisterDeviceResponse();
    }

    /**
     * Create an instance of {@link TellPowerConfigurationResponse }
     * 
     */
    public TellPowerConfigurationResponse createTellPowerConfigurationResponse() {
        return new TellPowerConfigurationResponse();
    }

    /**
     * Create an instance of {@link TellPowerConfiguration }
     * 
     */
    public TellPowerConfiguration createTellPowerConfiguration() {
        return new TellPowerConfiguration();
    }

    /**
     * Create an instance of {@link RegisterDeviceResponse }
     * 
     */
    public RegisterDeviceResponse createRegisterDeviceResponse() {
        return new RegisterDeviceResponse();
    }

    /**
     * Create an instance of {@link RegisterDeviceForProgramming }
     * 
     */
    public RegisterDeviceForProgramming createRegisterDeviceForProgramming() {
        return new RegisterDeviceForProgramming();
    }

    /**
     * Create an instance of {@link RequestPowerConfiguration }
     * 
     */
    public RequestPowerConfiguration createRequestPowerConfiguration() {
        return new RequestPowerConfiguration();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestPowerConfiguration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://smartmeter.power.home/", name = "requestPowerConfiguration")
    public JAXBElement<RequestPowerConfiguration> createRequestPowerConfiguration(RequestPowerConfiguration value) {
        return new JAXBElement<RequestPowerConfiguration>(_RequestPowerConfiguration_QNAME, RequestPowerConfiguration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TellPowerConfigurationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://smartmeter.power.home/", name = "tellPowerConfigurationResponse")
    public JAXBElement<TellPowerConfigurationResponse> createTellPowerConfigurationResponse(TellPowerConfigurationResponse value) {
        return new JAXBElement<TellPowerConfigurationResponse>(_TellPowerConfigurationResponse_QNAME, TellPowerConfigurationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TellPowerConfiguration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://smartmeter.power.home/", name = "tellPowerConfiguration")
    public JAXBElement<TellPowerConfiguration> createTellPowerConfiguration(TellPowerConfiguration value) {
        return new JAXBElement<TellPowerConfiguration>(_TellPowerConfiguration_QNAME, TellPowerConfiguration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnregisterDevice }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://smartmeter.power.home/", name = "unregisterDevice")
    public JAXBElement<UnregisterDevice> createUnregisterDevice(UnregisterDevice value) {
        return new JAXBElement<UnregisterDevice>(_UnregisterDevice_QNAME, UnregisterDevice.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterDevice }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://smartmeter.power.home/", name = "registerDevice")
    public JAXBElement<RegisterDevice> createRegisterDevice(RegisterDevice value) {
        return new JAXBElement<RegisterDevice>(_RegisterDevice_QNAME, RegisterDevice.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterDeviceForProgramming }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://smartmeter.power.home/", name = "registerDeviceForProgramming")
    public JAXBElement<RegisterDeviceForProgramming> createRegisterDeviceForProgramming(RegisterDeviceForProgramming value) {
        return new JAXBElement<RegisterDeviceForProgramming>(_RegisterDeviceForProgramming_QNAME, RegisterDeviceForProgramming.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterDeviceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://smartmeter.power.home/", name = "registerDeviceResponse")
    public JAXBElement<RegisterDeviceResponse> createRegisterDeviceResponse(RegisterDeviceResponse value) {
        return new JAXBElement<RegisterDeviceResponse>(_RegisterDeviceResponse_QNAME, RegisterDeviceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestPowerConfigurationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://smartmeter.power.home/", name = "requestPowerConfigurationResponse")
    public JAXBElement<RequestPowerConfigurationResponse> createRequestPowerConfigurationResponse(RequestPowerConfigurationResponse value) {
        return new JAXBElement<RequestPowerConfigurationResponse>(_RequestPowerConfigurationResponse_QNAME, RequestPowerConfigurationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterDeviceForProgrammingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://smartmeter.power.home/", name = "registerDeviceForProgrammingResponse")
    public JAXBElement<RegisterDeviceForProgrammingResponse> createRegisterDeviceForProgrammingResponse(RegisterDeviceForProgrammingResponse value) {
        return new JAXBElement<RegisterDeviceForProgrammingResponse>(_RegisterDeviceForProgrammingResponse_QNAME, RegisterDeviceForProgrammingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnregisterDeviceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://smartmeter.power.home/", name = "unregisterDeviceResponse")
    public JAXBElement<UnregisterDeviceResponse> createUnregisterDeviceResponse(UnregisterDeviceResponse value) {
        return new JAXBElement<UnregisterDeviceResponse>(_UnregisterDeviceResponse_QNAME, UnregisterDeviceResponse.class, null, value);
    }

}
