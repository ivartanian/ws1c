
package localhost.kt;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Holder;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "MutualSettlementsPortType", targetNamespace = "http://localhost/kt")
@XmlSeeAlso({
    ru._1c.v8._8_1.data.core.ObjectFactory.class,
    localhost.kt.ObjectFactory.class
})
public interface MutualSettlementsPortType {


    /**
     * 
     * @param kod
     * @param report
     * @param date2
     * @param date1
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetTheFile", action = "http://localhost/kt#MutualSettlements:GetTheFile")
    @WebResult(targetNamespace = "http://localhost/kt")
    @RequestWrapper(localName = "GetTheFile", targetNamespace = "http://localhost/kt", className = "localhost.kt.GetTheFile")
    @ResponseWrapper(localName = "GetTheFileResponse", targetNamespace = "http://localhost/kt", className = "localhost.kt.GetTheFileResponse")
    public String getTheFile(
        @WebParam(name = "Report", targetNamespace = "http://localhost/kt")
        String report,
        @WebParam(name = "Kod", targetNamespace = "http://localhost/kt")
        String kod,
        @WebParam(name = "Date1", targetNamespace = "http://localhost/kt")
        String date1,
        @WebParam(name = "Date2", targetNamespace = "http://localhost/kt")
        String date2);

    /**
     * 
     * @param kod
     * @param report
     * @param date2
     * @param date1
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetTheSum", action = "http://localhost/kt#MutualSettlements:GetTheSum")
    @WebResult(targetNamespace = "http://localhost/kt")
    @RequestWrapper(localName = "GetTheSum", targetNamespace = "http://localhost/kt", className = "localhost.kt.GetTheSum")
    @ResponseWrapper(localName = "GetTheSumResponse", targetNamespace = "http://localhost/kt", className = "localhost.kt.GetTheSumResponse")
    public String getTheSum(
        @WebParam(name = "Report", targetNamespace = "http://localhost/kt")
        String report,
        @WebParam(name = "Kod", targetNamespace = "http://localhost/kt")
        String kod,
        @WebParam(name = "Date1", targetNamespace = "http://localhost/kt")
        String date1,
        @WebParam(name = "Date2", targetNamespace = "http://localhost/kt")
        String date2);

    /**
     * 
     * @param report
     * @param options
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetAll", action = "http://localhost/kt#MutualSettlements:GetAll")
    @WebResult(targetNamespace = "http://localhost/kt")
    @RequestWrapper(localName = "GetAll", targetNamespace = "http://localhost/kt", className = "localhost.kt.GetAll")
    @ResponseWrapper(localName = "GetAllResponse", targetNamespace = "http://localhost/kt", className = "localhost.kt.GetAllResponse")
    public String getAll(
        @WebParam(name = "Report", targetNamespace = "http://localhost/kt")
        String report,
        @WebParam(name = "Options", targetNamespace = "http://localhost/kt")
        String options);

    /**
     * 
     * @param structureParameters
     * @param strLog
     * @param report
     * @return
     *     returns byte[]
     */
    @WebMethod(operationName = "GetData", action = "http://localhost/kt#MutualSettlements:GetData")
    @WebResult(targetNamespace = "http://localhost/kt")
    @RequestWrapper(localName = "GetData", targetNamespace = "http://localhost/kt", className = "localhost.kt.GetData")
    @ResponseWrapper(localName = "GetDataResponse", targetNamespace = "http://localhost/kt", className = "localhost.kt.GetDataResponse")
    public byte[] getData(
        @WebParam(name = "Report", targetNamespace = "http://localhost/kt")
        String report,
        @WebParam(name = "StructureParameters", targetNamespace = "http://localhost/kt")
        byte[] structureParameters,
        @WebParam(name = "StrLog", targetNamespace = "http://localhost/kt", mode = WebParam.Mode.INOUT)
        Holder<String> strLog);

}
