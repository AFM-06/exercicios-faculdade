package Testes;
import Main.Pessoa;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PessoaTeste {

    @Test
    public void testeGetters(){
        Pessoa pessoa = new Pessoa(1,"Ana",0);

        int id = pessoa.getId();
        String nome = pessoa.getNome();
        int idade = pessoa.getIdade();

        assertEquals(1,id);
        assertEquals("Ana",nome);
        assertEquals(0,idade);

    }

    @Test (expected = IllegalArgumentException.class)
    public void testarVerificacaoIdInvalido(){
        Pessoa teste1 = new Pessoa(0,"Joao",18);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testarVerificacaoNomeInvalido(){
        Pessoa teste2 = new Pessoa(1,"  ",6);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testarVerificacaoIdadeInvalida(){
        Pessoa teste3 = new Pessoa(1,"Marcos",-1);
    }
}
