package Testes;
import Main.Cadastro;
import Main.Pessoa;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CadastroTeste {

    @Test
    public void testarRemoverPessoa(){
        Cadastro cadastro = new Cadastro();
        Pessoa ana = new Pessoa(1,"Ana",0);

        cadastro.cadastrar(ana);
        cadastro.removerPorId(1);

        assertEquals(0,cadastro.quantidade());

    }

    @Test
    public void testarQuantidade(){
        Cadastro cadastro = new Cadastro();
        Pessoa andre = new Pessoa(1,"Andre",17);
        Pessoa pedro = new Pessoa(2,"Pedro",15);

        cadastro.cadastrar(andre);
        cadastro.cadastrar(pedro);

        assertEquals(2,cadastro.quantidade());
    }

    @Test
    public void testarBusca(){
        Cadastro cadastro = new Cadastro();
        Pessoa andre = new Pessoa(34,"Andre",17);
        cadastro.cadastrar(andre);

        assertEquals(andre,cadastro.buscarPorId(34));


    }


    @Test (expected = IllegalArgumentException.class)
    public void testarCadastroNull(){
        Cadastro cadastro = new Cadastro();
        cadastro.cadastrar(null);
    }
}
