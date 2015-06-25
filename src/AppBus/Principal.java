package AppBus;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Guanabara guanabara = new Guanabara();
		guanabara.adicionarOnibus("075");
		guanabara.adicionarTopic("06");
		
		
		Passageiro p = new Passageiro();
		p.comprarVaga(guanabara.transporte.get(1));
		p.comprarVaga(guanabara.transporte.get(0));

		guanabara.listarTransporte();
	}
	
}
	


