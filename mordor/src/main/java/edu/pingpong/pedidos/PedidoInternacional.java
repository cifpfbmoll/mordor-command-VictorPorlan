package edu.pingpong.pedidos;

import edu.pingpong.interfaces.Pedido;

public class PedidoInternacional implements Pedido {
    private int peso;
    private String destino;

    public PedidoInternacional(String destino, int peso) {
        this.peso = peso;
        this.destino = destino;
    }

    public int peso() {
        return peso;
    }

    public String destino() {
        return destino;
    }
}
