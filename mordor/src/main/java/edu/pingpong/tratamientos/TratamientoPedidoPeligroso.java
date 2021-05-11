package edu.pingpong.tratamientos;


import edu.pingpong.interfaces.PedidoPeligroso;
import edu.pingpong.interfaces.TratamientoPedido;
import edu.pingpong.pedidos.PedidoPeligrosoOrden;

public class TratamientoPedidoPeligroso implements TratamientoPedido {
    private final PedidoPeligroso pedido;

    public TratamientoPedidoPeligroso(PedidoPeligroso pedido) {
        this.pedido = pedido;
    }

    @Override
    public boolean tratar() {
        return getPedido().instrucciones().equals("No ponerselo en el dedo")
                ? false
                : true;
    }

    public PedidoPeligroso getPedido() {
        return pedido;
    }
}
