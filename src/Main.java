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

        URL url = new URL("http://Ktua2:Kt2014**@77.120.102.51/Report4/ws/MutualSettlements.1cws?wsdl");
        String userPassword = "Ktua2:Kt2014**";
        String encoding = new BASE64Encoder().encode (userPassword.getBytes());
        URLConnection uc = url.openConnection();
        uc.setRequestProperty ("Authorization", "Basic " + encoding);
        QName qname = new QName("http://localhost/kt", "MutualSettlements");

        Service service = Service.create(url, qname);
        MutualSettlementsPortType hello = service.getPort(MutualSettlementsPortType.class);


        URL wsdlLocation = new URL("http://user[Ktua2]:Kt2014**@77.120.102.51/Report4/ws/MutualSettlements.1cws?wsdl");
        MutualSettlements mutualSettlements = new MutualSettlements(wsdlLocation);
        MutualSettlementsPortType mutualSettlementsSoap = mutualSettlements.getMutualSettlementsSoap();
        String ws_сontractDelay = mutualSettlementsSoap.getAll("WS_СontractDelay", "");
        System.out.println("Yes");
    }
}
