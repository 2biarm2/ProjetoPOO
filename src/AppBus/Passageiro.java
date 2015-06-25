package AppBus;

public class Passageiro {
 String nome;
 String cpf;
 
 public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getCpf() {
	return cpf;
}
public void setCpf(String cpf) {
	this.cpf = cpf;
}

public void comprarVaga(Transporte t){
	
	if(t instanceof Onibus)
	{
		comprarVaga((Onibus) t);
	}
	else
	{
		comprarVaga((Topic) t);
	}
}

public void comprarVaga(Topic t){
	
	if(t.vagas == 0){
		System.out.println("Topic lotada!");	
	}
	else{
		System.out.println("Compra efetuada!");
		t.vagas--;
	}
}

public void comprarVaga(Onibus o){
	
	if(o.vagas == 0){
		System.out.println("Onibus lotado!");	
	}
	else{
		System.out.println("Compra efetuada!");
		o.vagas--;
	}
}
 
}

