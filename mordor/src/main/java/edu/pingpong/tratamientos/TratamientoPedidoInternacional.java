package edu.pingpong.tratamientos;

import edu.pingpong.interfaces.TratamientoPedido;
import edu.pingpong.pedidos.PedidoInternacional;

public class TratamientoPedidoInternacional implements TratamientoPedido {
    private final PedidoInternacional pedido;

    public TratamientoPedidoInternacional(PedidoInternacional pedido) {
        this.pedido = pedido;
    }

    @Override
    public boolean tratar(){
        /*IntelliJ me recomienda hacerlo con return ! pedid.destino().equals("Mordor"), pero como sería
        igual que el código de David lo hago a mi forma */
        return getPedido().destino().equals("Mordor")
                ? false
                : true;
    }

    public PedidoInternacional getPedido() {
        return pedido;
    }
}
