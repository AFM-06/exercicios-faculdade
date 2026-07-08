package list;

public class No {
	Integer data; //Manter o nome deste atributo
    No next;
	No previous;
	public No(Integer data, No next, No previous){
		this.data = data;
		this.next = next;
		this.previous = previous;
	}
	public Integer getDado() { //Manter o nome desta função. Ela será utilizada nos testes
		return dado;
	}

}
