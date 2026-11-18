package Main;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Cadastro {
    private List<Pessoa> pessoas;

    public Cadastro() {
        this.pessoas = new ArrayList<>();
    }

    public void cadastrar(Pessoa pessoa) {
        if (pessoa == null) {
            throw new IllegalArgumentException("Informe uma pessoa para cadastrar.");
        }

        if (encontrarPorId(pessoa.getId()) != null) {
            throw new IllegalArgumentException("Já existe uma pessoa com esse ID.");
        }

        pessoas.add(pessoa);
    }

    public Pessoa buscarPorId(int id) {
        Pessoa pessoa = encontrarPorId(id);

        if (pessoa == null) {
            throw new NoSuchElementException("Nenhuma pessoa cadastrada com o ID " + id + ".");
        }

        return pessoa;
    }

    public void removerPorId(int id) {
        Pessoa pessoa = buscarPorId(id);
        pessoas.remove(pessoa);
    }

    public int quantidade() {
        return pessoas.size();
    }

    private Pessoa encontrarPorId(int id) {
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getId() == id) {
                return pessoa;
            }
        }

        return null;
    }
}