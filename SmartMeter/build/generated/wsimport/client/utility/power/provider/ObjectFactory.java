
package utility.power.provider;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the utility.power.provider package. 
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

    private final static QName _RegisterSmartMeter_QNAME = new QName("http://provider.power.utility/", "registerSmartMeter");
    private final static QName _RequestPowerProfile_QNAME = new QName("http://provider.power.utility/", "requestPowerProfile");
    private final static QName _TellPowerProfile_QNAME = new QName("http://provider.power.utility/", "tellPowerProfile");
    private final static QName _RequestBillingInformation_QNAME = new QName("http://provider.power.utility/", "requestBillingInformation");
    private final static QName _RequestBillingInformationResponse_QNAME = new QName("http://provider.power.utility/", "requestBillingInformationResponse");
    private final static QName _RegisterSmartMeterResponse_QNAME = new QName("http://provider.power.utility/", "registerSmartMeterResponse");
    private final static QName _TellPowerProfileResponse_QNAME = new QName("http://provider.power.utility/", "tellPowerProfileResponse");
    private final static QName _PayBill_QNAME = new QName("http://provider.power.utility/", "payBill");
    private final static QName _RequestPowerProfileResponse_QNAME = new QName("http://provider.power.utility/", "requestPowerProfileResponse");
    private final static QName _PayBillResponse_QNAME = new QName("http://provider.power.utility/", "payBillResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: utility.power.provider
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PayBill }
     * 
     */
    public PayBill createPayBill() {
        return new PayBill();
    }

    /**
     * Create an instance of {@link RequestBillingInformationResponse }
     * 
     */
    public RequestBillingInformationResponse createRequestBillingInformationResponse() {
        return new RequestBillingInformationResponse();
    }

    /**
     * Create an instance of {@link RequestBillingInformation }
     * 
     */
    public RequestBillingInformation createRequestBillingInformation() {
        return new RequestBillingInformation();
    }

    /**
     * Create an instance of {@link TellPowerProfile }
     * 
     */
    public TellPowerProfile createTellPowerProfile() {
        return new TellPowerProfile();
    }

    /**
     * Create an instance of {@link PayBillResponse }
     * 
     */
    public PayBillResponse createPayBillResponse() {
        return new PayBillResponse();
    }

    /**
     * Create an instance of {@link RegisterSmartMeterResponse }
     * 
     */
    public RegisterSmartMeterResponse createRegisterSmartMeterResponse() {
        return new RegisterSmartMeterResponse();
    }

    /**
     * Create an instance of {@link RegisterSmartMeter }
     * 
     */
    public RegisterSmartMeter createRegisterSmartMeter() {
        return new RegisterSmartMeter();
    }

    /**
     * Create an instance of {@link RequestPowerProfile }
     * 
     */
    public RequestPowerProfile createRequestPowerProfile() {
        return new RequestPowerProfile();
    }

    /**
     * Create an instance of {@link RequestPowerProfileResponse }
     * 
     */
    public RequestPowerProfileResponse createRequestPowerProfileResponse() {
        return new RequestPowerProfileResponse();
    }

    /**
     * Create an instance of {@link TellPowerProfileResponse }
     * 
     */
    public TellPowerProfileResponse createTellPowerProfileResponse() {
        return new TellPowerProfileResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterSmartMeter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://provider.power.utility/", name = "registerSmartMeter")
    public JAXBElement<RegisterSmartMeter> createRegisterSmartMeter(RegisterSmartMeter value) {
        return new JAXBElement<RegisterSmartMeter>(_RegisterSmartMeter_QNAME, RegisterSmartMeter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestPowerProfile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://provider.power.utility/", name = "requestPowerProfile")
    public JAXBElement<RequestPowerProfile> createRequestPowerProfile(RequestPowerProfile value) {
        return new JAXBElement<RequestPowerProfile>(_RequestPowerProfile_QNAME, RequestPowerProfile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TellPowerProfile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://provider.power.utility/", name = "tellPowerProfile")
    public JAXBElement<TellPowerProfile> createTellPowerProfile(TellPowerProfile value) {
        return new JAXBElement<TellPowerProfile>(_TellPowerProfile_QNAME, TellPowerProfile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestBillingInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://provider.power.utility/", name = "requestBillingInformation")
    public JAXBElement<RequestBillingInformation> createRequestBillingInformation(RequestBillingInformation value) {
        return new JAXBElement<RequestBillingInformation>(_RequestBillingInformation_QNAME, RequestBillingInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestBillingInformationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://provider.power.utility/", name = "requestBillingInformationResponse")
    public JAXBElement<RequestBillingInformationResponse> createRequestBillingInformationResponse(RequestBillingInformationResponse value) {
        return new JAXBElement<RequestBillingInformationResponse>(_RequestBillingInformationResponse_QNAME, RequestBillingInformationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterSmartMeterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://provider.power.utility/", name = "registerSmartMeterResponse")
    public JAXBElement<RegisterSmartMeterResponse> createRegisterSmartMeterResponse(RegisterSmartMeterResponse value) {
        return new JAXBElement<RegisterSmartMeterResponse>(_RegisterSmartMeterResponse_QNAME, RegisterSmartMeterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TellPowerProfileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://provider.power.utility/", name = "tellPowerProfileResponse")
    public JAXBElement<TellPowerProfileResponse> createTellPowerProfileResponse(TellPowerProfileResponse value) {
        return new JAXBElement<TellPowerProfileResponse>(_TellPowerProfileResponse_QNAME, TellPowerProfileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayBill }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://provider.power.utility/", name = "payBill")
    public JAXBElement<PayBill> createPayBill(PayBill value) {
        return new JAXBElement<PayBill>(_PayBill_QNAME, PayBill.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestPowerProfileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://provider.power.utility/", name = "requestPowerProfileResponse")
    public JAXBElement<RequestPowerProfileResponse> createRequestPowerProfileResponse(RequestPowerProfileResponse value) {
        return new JAXBElement<RequestPowerProfileResponse>(_RequestPowerProfileResponse_QNAME, RequestPowerProfileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayBillResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://provider.power.utility/", name = "payBillResponse")
    public JAXBElement<PayBillResponse> createPayBillResponse(PayBillResponse value) {
        return new JAXBElement<PayBillResponse>(_PayBillResponse_QNAME, PayBillResponse.class, null, value);
    }

}
