package br.com.fiap.winery;

import javax.jws.WebService;

@WebService(endpointInterface = "br.com.fiap.winery.WineStockService")
public class WineStockServiceImplementation implements WineStockService {

    @Override
    public String getMenu() {
        // Exemplo de retorno: lista de tipos de uva
        return "1. Cabernet Sauvignon\n2. Merlot\n3. Chardonnay";
    }

    @Override
    public String placeOrder(String name, int quantity) {
        return "Pedido confirmado! " + quantity + " garrafas de " + name;
    }
}
