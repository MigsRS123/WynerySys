package br.com.fiap.winery;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

public class ApplicationClient1 {
    public static void main(String[] args) throws Exception {
        URL wsdl = new URL("http://localhost:8085/WineStockService?wsdl");
        QName qname = new QName("http://winery.fiap.com.br/", "WineStockServiceImplementationService");

        Service service = Service.create(wsdl, qname);
        WineStockService client = service.getPort(WineStockService.class);

        String menu = client.getMenu();
        System.out.println("Menu recebido:\n" + menu);
    }
}

