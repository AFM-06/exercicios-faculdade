package P1;

abstract public class Loja {

    protected String id;
    protected String cnpj;
    protected String razao_social;
    protected boolean aberta;

    public void status(){
        System.out.printf("Id: %s(CNPJ: %s)\nRazão social: %s.\n",id,cnpj,razao_social);
        if(aberta){
            System.out.print("Atualmente aberta.\n");
        }else{
            System.out.print("Atualmente fechada.\n");
        }
    }

    public Loja(String id,String cnpj,String razao_social,boolean aberta){
        this.id = id;
        this.cnpj = cnpj;
        this.razao_social = razao_social;
        this.aberta = aberta;

    }

}