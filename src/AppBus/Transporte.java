package AppBus;


public class Transporte {
	
	
	protected String id;
    protected int assentos;    
    int vagas;
   
    
    
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getAssentos() {
		return assentos;
	}

	public void setAssentos(int assentos) {
		this.assentos = assentos;
	}

		
	public Transporte (String id){
		this.id = id;
		
	}
	

	
	}

