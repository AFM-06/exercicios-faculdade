package Pck1;

public class Ingresso {

    private Cliente cliente;
    private String tipo;
    private double valor;

    public Ingresso(Cliente cliente, String tipo, double valor) {
        this.cliente = cliente;
        this.tipo = tipo;
        this.valor = valor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public String getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }
}
