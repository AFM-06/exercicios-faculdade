package list;

public class No {
	Integer dado; //Manter o nome deste atributo
    No proximo;
	No anterior;
	public No(Integer dado, No proximo, No anterior){
		this.dado = dado;
		this.proximo = proximo;
		this.anterior = anterior;
	}
	public Integer getDado() { //Manter o nome desta função. Ela será utilizada nos testes
		return dado;
	}

}
