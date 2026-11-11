package Pck1;

import java.util.ArrayList;

public class Parque {

    private String nome;
    private ArrayList<Ingresso> ingressos;

    public Parque(String nome) {
        this.nome = nome;
        this.ingressos = new ArrayList<>();
    }

    public double calcularPreco(Cliente cliente, String tipo) {
        double valor;

        if (tipo.equalsIgnoreCase("BASICO")) {
            valor = 50.0;
        } else {
            valor = 80.0;
        }

        if (cliente.getIdade() < 12) {
            valor = valor * 0.5;
        }

        return valor;
    }

    public ArrayList<Ingresso> getIngressos() {
        return ingressos;
    }

    public void imprimirRecibo(Ingresso ingresso) {
        System.out.println();
        System.out.println("===== RECIBO =====");
        System.out.println("Parque: " + nome);
        System.out.println("Cliente: " + ingresso.getCliente().getNome());
        System.out.println("Ingresso: " + ingresso.getTipo());
        System.out.println("Valor: R$ " + ingresso.getValor());
        System.out.println("==================");
        System.out.println();
    }

    public void listarIngressos() {
        System.out.println();
        System.out.println("===== INGRESSOS VENDIDOS =====");

        if (ingressos.isEmpty()) {
            System.out.println("Nenhum ingresso vendido.");
        } else {
            for (int i = 0; i < ingressos.size(); i++) {
                Ingresso ingresso = ingressos.get(i);

                System.out.println(
                    (i + 1) + " - "
                    + ingresso.getCliente().getNome()
                    + " | " + ingresso.getTipo()
                    + " | R$ " + ingresso.getValor()
                );
            }
        }

        System.out.println("==============================");
        System.out.println();
    }
}
