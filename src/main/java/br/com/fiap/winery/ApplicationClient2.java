package br.com.fiap.winery;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

public class ApplicationClient2 {
    public static void main(String[] args) throws Exception {
        // 1) Conectar ao serviço de estoque
        URL wsdl1 = new URL("http://localhost:8085/WineStockService?wsdl");
        QName q1 = new QName("http://winery.fiap.com.br/", "WineStockServiceImplementationService");
        Service s1 = Service.create(wsdl1, q1);
        WineStockService stock = s1.getPort(WineStockService.class);

        String order = stock.placeOrder("Cabernet", 3);
        System.out.println(order);

        // 2) Conectar ao serviço de aviso de estoque (WineWarningService)
        URL wsdl2 = new URL("http://localhost:8086/WineWarningService?wsdl");
        QName q2 = new QName("http://winery.fiap.com.br/", "WineWarningServiceImplementationService");
        Service s2 = Service.create(wsdl2, q2);
        WineWarningService warnSvc = s2.getPort(WineWarningService.class);

        String warn = warnSvc.sendWarn();
        System.out.println(warn);
    }
}
