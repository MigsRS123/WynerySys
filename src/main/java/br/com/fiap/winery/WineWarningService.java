package br.com.fiap.winery;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface WineWarningService {
    @WebMethod
    String sendWarn();
}
