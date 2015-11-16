import localhost.kt.MutualSettlements;
import localhost.kt.MutualSettlementsPortType;
import sun.misc.BASE64Encoder;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Main {

    public static void main(String[] args) throws IOException {

        String address = "http://Ktua2:Kt2014**@77.120.102.51/Report4/ws/MutualSettlements.1cws?wsdl";
        URL wsdlLocation = new URL(null, address, new sun.net.www.protocol.http.Handler());
        MutualSettlements mutualSettlements = new MutualSettlements(wsdlLocation);
        MutualSettlementsPortType mutualSettlementsSoap = mutualSettlements.getMutualSettlementsSoap();
        String ws_сontractDelay = mutualSettlementsSoap.getAll("WS_СontractDelay", "");
        System.out.println("Yes");
    }
}
