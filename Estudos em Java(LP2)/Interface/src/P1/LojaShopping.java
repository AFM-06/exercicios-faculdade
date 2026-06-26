package P1;

public class LojaShopping extends Loja implements Registro{
    private String endereço;
    private String gerente;

    @Override
    public void status(){
        super.status();
        System.out.println("Endereço: "+endereço);
        System.out.println("Nome do gerente responsável: "+gerente);
    }

    @Override
    public void registra_abertura_dia(){
        if(aberta){
            System.out.println("A loja já está aberta.");
        }else{
            System.out.println("Loja aberta.");
            aberta = true;
        }
    }
    @Override
    public void registra_fechamento_dia(){
        if(aberta){
            System.out.println("Loja fechada.");
            aberta = false;
        }else{
            System.out.println("A loja já está fechada.");
        }
    }

    public boolean getAberto(){
        return this.aberta;
    }

    public LojaShopping(String id,String cnpj,String razao_social,boolean aberta,String endereço, String gerente){
        super(id,cnpj,razao_social,aberta);
        this.endereço = endereço;
        this.gerente = gerente;


    }


}