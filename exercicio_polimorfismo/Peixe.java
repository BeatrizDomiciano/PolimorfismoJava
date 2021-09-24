package exercicio_polimorfismo;

public class Peixe extends Animal {
	
	 private String corEscama ;
	 
	 public String getCorEscama() {
			return corEscama;
		}

		public void setCorEscama(String corEscama) {
			this.corEscama = corEscama;
		}

	@Override
	public void locomover() {
		if(this.isParado()) {
			this.setParado(false);
			System.out.println("Nadando");
		} else {
			System.out.println("Já esou nadando");
		}
	}

	@Override
	public void alimentar() {
		System.out.println("Minhoca");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("Glub.. Glub");
		
	}
	public void soltandoBolhas() {
		System.out.println("Soltando Bolhas");
	}

	

	@Override
	public void parar() {
		if (!this.isParado()) {
			this.setParado(true);
		}
		
		
	}
	

}
