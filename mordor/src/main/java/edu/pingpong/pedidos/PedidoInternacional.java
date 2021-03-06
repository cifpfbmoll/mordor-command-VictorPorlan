package edu.pingpong.pedidos;
import java.util.UUID;

import edu.pingpong.interfaces.Pedido;

public class PedidoInternacional implements Pedido {
    private int peso;
    private String destino;
    private final String id;

    public PedidoInternacional(String destino, int peso) {
        this.id = UUID.randomUUID().toString();
        this.peso = peso;
        this.destino = destino;
    }

    public int peso() {
        return peso;
    }

    public String destino() {
        return destino;
    }

    public String getId() {
        return id;
    }
}
