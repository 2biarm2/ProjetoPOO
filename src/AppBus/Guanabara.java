package AppBus;
import java.util.ArrayList;

public class Guanabara {
	
	ArrayList<Transporte> transporte;
	
	public Guanabara(){
		transporte = new ArrayList<Transporte>();
	}
	
	public void adicionarOnibus(String id){
		try{
			transporte.add(new Onibus(id));	
		}catch(IllegalArgumentException erro){
			System.out.println(erro.getMessage());
		}
	}
	
	public void adicionarTopic(String id){
		try{
			transporte.add(new Topic(id));
		}catch(IllegalArgumentException erro){
			System.out.println(erro.getMessage());
		}
	}
	
	public void listarTransporte(){
		for(int i=0 ; i<transporte.size() ; i++){
			if(transporte.get(i) instanceof Onibus){
				System.out.println("Onibus: " +transporte.get(i).getId() + " " + "Vagas: " +transporte.get(i).getAssentos());
				
			}
			
			else{
				System.out.println("Topic: " +transporte.get(i).getId() + " " + "Vagas: " +transporte.get(i).getAssentos());
				
			}
		}
	}
}