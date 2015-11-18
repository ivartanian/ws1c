import com.sun.javafx.fxml.builder.URLBuilder;
import localhost.kt.MutualSettlements;
import localhost.kt.MutualSettlementsPortType;
import sun.misc.BASE64Encoder;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLPermission;
import java.util.Base64;

public class Main {

    public static void main(String[] args) throws IOException {

        String address = "http://77.120.102.51/Report4/ws/MutualSettlements.1cws?wsdl";
        URL wsdlLocation = new URL(null, address);
        MutualSettlements mutualSettlements = new MutualSettlements(wsdlLocation);
        MutualSettlementsPortType mutualSettlementsSoap = mutualSettlements.getMutualSettlementsSoap();
        String ws_сontractDelay = mutualSettlementsSoap.getAll("WS_СontractDelay", "");
        System.out.println("Yes");


        try {
            String webPage = "http://77.120.102.51/Report4/ws/MutualSettlements.1cws?wsdl";
            String name = "Ktua2";
            String password = "Kt2014**";

            String authString = name + ":" + password;
            System.out.println("auth string: " + authString);
            byte[] authEncBytes = Base64.getEncoder().encode(authString.getBytes());
            String authStringEnc = new String(authEncBytes);
            System.out.println("Base64 encoded auth string: " + authStringEnc);

            URL url = new URL(webPage);
            URLConnection urlConnection = url.openConnection();
            urlConnection.setRequestProperty("Authorization", "Basic " + authStringEnc);
            InputStream is = urlConnection.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);

            int numCharsRead;
            char[] charArray = new char[1024];
            StringBuffer sb = new StringBuffer();
            while ((numCharsRead = isr.read(charArray)) > 0) {
                sb.append(charArray, 0, numCharsRead);
            }
            String result = sb.toString();

            System.out.println("*** BEGIN ***");
            System.out.println(result);
            System.out.println("*** END ***");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
