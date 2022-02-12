
package kz.iitu.soap.ws1.client.generated;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * <b>A web service which performs GetIpAddress Lookups.</b>
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "GeoIPService", targetNamespace = "http://lavasoft.com/", wsdlLocation = "http://wsgeoip.lavasoft.com/ipservice.asmx?WSDL")
public class GeoIPService
    extends Service
{

    private final static URL GEOIPSERVICE_WSDL_LOCATION;
    private final static WebServiceException GEOIPSERVICE_EXCEPTION;
    private final static QName GEOIPSERVICE_QNAME = new QName("http://lavasoft.com/", "GeoIPService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://wsgeoip.lavasoft.com/ipservice.asmx?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        GEOIPSERVICE_WSDL_LOCATION = url;
        GEOIPSERVICE_EXCEPTION = e;
    }

    public GeoIPService() {
        super(__getWsdlLocation(), GEOIPSERVICE_QNAME);
    }

    public GeoIPService(WebServiceFeature... features) {
        super(__getWsdlLocation(), GEOIPSERVICE_QNAME, features);
    }

    public GeoIPService(URL wsdlLocation) {
        super(wsdlLocation, GEOIPSERVICE_QNAME);
    }

    public GeoIPService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, GEOIPSERVICE_QNAME, features);
    }

    public GeoIPService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public GeoIPService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns GeoIPServiceSoap
     */
    @WebEndpoint(name = "GeoIPServiceSoap")
    public GeoIPServiceSoap getGeoIPServiceSoap() {
        return super.getPort(new QName("http://lavasoft.com/", "GeoIPServiceSoap"), GeoIPServiceSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns GeoIPServiceSoap
     */
    @WebEndpoint(name = "GeoIPServiceSoap")
    public GeoIPServiceSoap getGeoIPServiceSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://lavasoft.com/", "GeoIPServiceSoap"), GeoIPServiceSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (GEOIPSERVICE_EXCEPTION!= null) {
            throw GEOIPSERVICE_EXCEPTION;
        }
        return GEOIPSERVICE_WSDL_LOCATION;
    }

}
