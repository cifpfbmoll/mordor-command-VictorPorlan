package edu.pingpong.pedidos;

import edu.pingpong.interfaces.Pedido;
import edu.pingpong.interfaces.PedidoPeligroso;

import java.util.UUID;

public class PedidoPeligrosoOrden implements PedidoPeligroso {
    private int peso;
    private String destino;
    private String instrucciones;
    private final String id;

    public PedidoPeligrosoOrden(String destino, String instrucciones) {
        this.id = UUID.randomUUID().toString();
        this.destino = destino;
        this.instrucciones = instrucciones;
    }
    @Override
    public int peso() {
        return peso;
    }
    @Override
    public String instrucciones() {
        return instrucciones;
    }
    @Override
    public String destino() {
        return destino;
    }

    public String getId() {
        return id;
    }
}
