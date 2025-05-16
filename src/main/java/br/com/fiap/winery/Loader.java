package br.com.fiap.winery;

import javax.xml.ws.Endpoint;

public class Loader {
    public static void main(String[] args) {
        WineStockServiceImplementation wineStock = new WineStockServiceImplementation();
        System.out.println("Serviço publicado em http://localhost:8085/WineStockService");
        Endpoint.publish("http://localhost:8085/WineStockService", wineStock);

        WineWarningServiceImplementation warning = new WineWarningServiceImplementation();
        System.out.println("Serviço de aviso publicado em http://localhost:8086/WineWarningService");
        Endpoint.publish("http://localhost:8086/WineWarningService", warning);
    }
}
