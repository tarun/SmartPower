
package soa;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.2-hudson-182-RC1
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "BankServiceService", targetNamespace = "http://soa/", wsdlLocation = "http://153.104.108.11:8080/SOA/BankServiceService?WSDL")
public class BankServiceService
    extends Service
{

    private final static URL BANKSERVICESERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(soa.BankServiceService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = soa.BankServiceService.class.getResource(".");
            url = new URL(baseUrl, "http://153.104.108.11:8080/SOA/BankServiceService?WSDL");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://153.104.108.11:8080/SOA/BankServiceService?WSDL', retrying as a local file");
            logger.warning(e.getMessage());
        }
        BANKSERVICESERVICE_WSDL_LOCATION = url;
    }

    public BankServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BankServiceService() {
        super(BANKSERVICESERVICE_WSDL_LOCATION, new QName("http://soa/", "BankServiceService"));
    }

    /**
     * 
     * @return
     *     returns BankService
     */
    @WebEndpoint(name = "BankServicePort")
    public BankService getBankServicePort() {
        return super.getPort(new QName("http://soa/", "BankServicePort"), BankService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BankService
     */
    @WebEndpoint(name = "BankServicePort")
    public BankService getBankServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://soa/", "BankServicePort"), BankService.class, features);
    }

}