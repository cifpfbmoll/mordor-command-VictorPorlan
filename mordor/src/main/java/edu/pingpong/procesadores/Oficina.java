package edu.pingpong.procesadores;

import edu.pingpong.interfaces.Pedido;
import edu.pingpong.interfaces.Procesador;
import edu.pingpong.interfaces.Status;
import edu.pingpong.interfaces.TratamientoPedido;

public class Oficina implements Procesador {

    @Override
    public boolean procesa(TratamientoPedido tratamiento) {
        return tratamiento.tratar();
    }
    public String printarStatus(boolean status, Pedido pedido) {
        return status
                ? pedido.destino() + " " + Status.ACEPTADO.name()
                : pedido.destino() + " " + Status.RECHAZADO.name();
    }
}
