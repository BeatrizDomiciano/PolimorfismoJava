package exercicio_polimorfismo;

public class Aves extends Animal {
	
	private String corPena;
	
	public String getCorPena() {
		return corPena;
	}

	public void setCorPena(String corPena) {
		this.corPena = corPena;
	}

	@Override
	public void locomover() {
		if(this.isParado()) {
		this.setParado(false);
		  	  System.out.println("Voando");
		} else {
			System.out.println("Já esou voando");
		}
	}

	@Override
	public void alimentar() {
		 System.out.println("Alpiste");
		
	}

	@Override
	public void emitirSom() {
		 System.out.println("Piu.. piu..");
		
	}
	 public void  contruirNinho() {
   	  System.out.println("Contruindo Ninho");
     }

	@Override
	public void parar() {
		if (!this.isParado()) {
			this.setParado(true);
		}
		
	}


	

}
