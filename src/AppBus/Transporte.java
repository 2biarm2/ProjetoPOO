package AppBus;


public abstract class Transporte {
	
	
	private String id;        
    int vagas;
    protected int assentos;
   
    
    
	public int getAssentos() {
		return assentos;
	}

	public void setAssentos(int assentos) {
		this.assentos = assentos;
	}

	public int getVagas() {
		return vagas;
	}

	public void setVagas(int vagas) {
		this.vagas = vagas;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

			
	public Transporte (String id){
		this.id = id;
		
	}
	

	}