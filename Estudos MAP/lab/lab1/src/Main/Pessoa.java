package Main;

public class Pessoa {
    private final int id;
    private final String nome;
    private final int idade;

    public Pessoa(int id, String nome, int idade) {
        if (id <= 0) {
            throw new IllegalArgumentException("O ID deve ser maior que zero.");
        }

        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome é obrigatório.");
        }

        if (idade < 0) {
            throw new IllegalArgumentException("A idade deve ser maior ou igual a zero.");
        }

        this.id = id;
        this.nome = nome.trim();
        this.idade = idade;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}