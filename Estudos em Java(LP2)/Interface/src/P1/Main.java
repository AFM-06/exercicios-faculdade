package P1;

public class Main {
    public static void main(String[] args) {
        LojaShopping shoppingSul = new LojaShopping("001","36.775.907/0001-70","Shooping Zona Sul",false,"Rua das Seriemas, Cristo Rei - 78118-655, Várzea Grande, MT.","Gabriel");
        LojaShopping shoppingNorte = new LojaShopping("002","09.149.791/0001-90","Shooping Zona Norte",false,"Rua José Paulo da Silva Lira, Água Fria - 58053-003, João Pessoa, PB.","Elise");
        LojaShopping shoppingCentro = new LojaShopping("003","65.157.224/0001-57","Shooping Zona Central",false,"Avenida Nações Unidas, Centro - 93510-038, Novo Hamburgo, RS.","Matheus");

        shoppingSul.registra_abertura_dia();
        shoppingSul.status();
        shoppingSul.registra_fechamento_dia();

    }
}