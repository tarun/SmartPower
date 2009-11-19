
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

    private final static QName _RequestConsumptionProfile_QNAME = new QName("http://smartmeter.power.home/", "requestConsumptionProfile");
    private final static QName _RequestConsumptionSummary_QNAME = new QName("http://smartmeter.power.home/", "requestConsumptionSummary");
    private final static QName _SetConsumptionProfileResponse_QNAME = new QName("http://smartmeter.power.home/", "setConsumptionProfileResponse");
    private final static QName _RequestConsumptionSummaryResponse_QNAME = new QName("http://smartmeter.power.home/", "requestConsumptionSummaryResponse");
    private final static QName _RequestConsumptionProfileResponse_QNAME = new QName("http://smartmeter.power.home/", "requestConsumptionProfileResponse");
    private final static QName _SetConsumptionProfile_QNAME = new QName("http://smartmeter.power.home/", "setConsumptionProfile");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: home.power.smartmeter
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RequestConsumptionProfileResponse }
     * 
     */
    public RequestConsumptionProfileResponse createRequestConsumptionProfileResponse() {
        return new RequestConsumptionProfileResponse();
    }

    /**
     * Create an instance of {@link SetConsumptionProfile }
     * 
     */
    public SetConsumptionProfile createSetConsumptionProfile() {
        return new SetConsumptionProfile();
    }

    /**
     * Create an instance of {@link SetConsumptionProfileResponse }
     * 
     */
    public SetConsumptionProfileResponse createSetConsumptionProfileResponse() {
        return new SetConsumptionProfileResponse();
    }

    /**
     * Create an instance of {@link RequestConsumptionSummaryResponse }
     * 
     */
    public RequestConsumptionSummaryResponse createRequestConsumptionSummaryResponse() {
        return new RequestConsumptionSummaryResponse();
    }

    /**
     * Create an instance of {@link RequestConsumptionSummary }
     * 
     */
    public RequestConsumptionSummary createRequestConsumptionSummary() {
        return new RequestConsumptionSummary();
    }

    /**
     * Create an instance of {@link RequestConsumptionProfile }
     * 
     */
    public RequestConsumptionProfile createRequestConsumptionProfile() {
        return new RequestConsumptionProfile();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestConsumptionProfile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://smartmeter.power.home/", name = "requestConsumptionProfile")
    public JAXBElement<RequestConsumptionProfile> createRequestConsumptionProfile(RequestConsumptionProfile value) {
        return new JAXBElement<RequestConsumptionProfile>(_RequestConsumptionProfile_QNAME, RequestConsumptionProfile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestConsumptionSummary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://smartmeter.power.home/", name = "requestConsumptionSummary")
    public JAXBElement<RequestConsumptionSummary> createRequestConsumptionSummary(RequestConsumptionSummary value) {
        return new JAXBElement<RequestConsumptionSummary>(_RequestConsumptionSummary_QNAME, RequestConsumptionSummary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetConsumptionProfileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://smartmeter.power.home/", name = "setConsumptionProfileResponse")
    public JAXBElement<SetConsumptionProfileResponse> createSetConsumptionProfileResponse(SetConsumptionProfileResponse value) {
        return new JAXBElement<SetConsumptionProfileResponse>(_SetConsumptionProfileResponse_QNAME, SetConsumptionProfileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestConsumptionSummaryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://smartmeter.power.home/", name = "requestConsumptionSummaryResponse")
    public JAXBElement<RequestConsumptionSummaryResponse> createRequestConsumptionSummaryResponse(RequestConsumptionSummaryResponse value) {
        return new JAXBElement<RequestConsumptionSummaryResponse>(_RequestConsumptionSummaryResponse_QNAME, RequestConsumptionSummaryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestConsumptionProfileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://smartmeter.power.home/", name = "requestConsumptionProfileResponse")
    public JAXBElement<RequestConsumptionProfileResponse> createRequestConsumptionProfileResponse(RequestConsumptionProfileResponse value) {
        return new JAXBElement<RequestConsumptionProfileResponse>(_RequestConsumptionProfileResponse_QNAME, RequestConsumptionProfileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetConsumptionProfile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://smartmeter.power.home/", name = "setConsumptionProfile")
    public JAXBElement<SetConsumptionProfile> createSetConsumptionProfile(SetConsumptionProfile value) {
        return new JAXBElement<SetConsumptionProfile>(_SetConsumptionProfile_QNAME, SetConsumptionProfile.class, null, value);
    }

}
