package edu.pingpong.tratamientos;

import edu.pingpong.interfaces.Pedido;
import edu.pingpong.interfaces.TratamientoPedido;

import java.util.Set;
import java.util.stream.Collectors;

public class TratamientoPedidoMultiple implements TratamientoPedido {

    private final Set<Pedido> pedidos;
    private Integer pesoTotal = 0;
    private Long numBultos = 0L;

    public TratamientoPedidoMultiple(Set<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    @Override
    public boolean tratar() {
        calcularPesoTotal();
        calcularTotalBultos();
        return pesoTotal > 0 && numBultos == pedidos.size();

    }

    public Integer getPesoTotal() {
        return this.pesoTotal;
    }

    public Long getNumBultos() {
        return this.numBultos;
    }

    public void calcularPesoTotal() {
        this.pesoTotal = pedidos.stream().mapToInt(Pedido::peso).sum();
    }

    public void calcularTotalBultos() {
        this.numBultos = pedidos.stream().count();
    }
}
