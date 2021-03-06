
package localhost.kt;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "MutualSettlements", targetNamespace = "http://localhost/kt", wsdlLocation = "http://77.120.102.51/Report4/ws/MutualSettlements.1cws?wsdl")
public class MutualSettlements
    extends Service
{

    private final static URL MUTUALSETTLEMENTS_WSDL_LOCATION;
    private final static WebServiceException MUTUALSETTLEMENTS_EXCEPTION;
    private final static QName MUTUALSETTLEMENTS_QNAME = new QName("http://localhost/kt", "MutualSettlements");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://77.120.102.51/Report4/ws/MutualSettlements.1cws?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        MUTUALSETTLEMENTS_WSDL_LOCATION = url;
        MUTUALSETTLEMENTS_EXCEPTION = e;
    }

    public MutualSettlements() {
        super(__getWsdlLocation(), MUTUALSETTLEMENTS_QNAME);
    }

    public MutualSettlements(WebServiceFeature... features) {
        super(__getWsdlLocation(), MUTUALSETTLEMENTS_QNAME, features);
    }

    public MutualSettlements(URL wsdlLocation) {
        super(wsdlLocation, MUTUALSETTLEMENTS_QNAME);
    }

    public MutualSettlements(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, MUTUALSETTLEMENTS_QNAME, features);
    }

    public MutualSettlements(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MutualSettlements(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns MutualSettlementsPortType
     */
    @WebEndpoint(name = "MutualSettlementsSoap")
    public MutualSettlementsPortType getMutualSettlementsSoap() {
        return super.getPort(new QName("http://localhost/kt", "MutualSettlementsSoap"), MutualSettlementsPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MutualSettlementsPortType
     */
    @WebEndpoint(name = "MutualSettlementsSoap")
    public MutualSettlementsPortType getMutualSettlementsSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://localhost/kt", "MutualSettlementsSoap"), MutualSettlementsPortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (MUTUALSETTLEMENTS_EXCEPTION!= null) {
            throw MUTUALSETTLEMENTS_EXCEPTION;
        }
        return MUTUALSETTLEMENTS_WSDL_LOCATION;
    }

}
