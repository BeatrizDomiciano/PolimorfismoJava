package exercicio_polimorfismo;

public class Reptil extends Animal{
	
	private String corEscama;
	
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
			System.out.println("Rastejando");
		} else {
			System.out.println("Já esou rastejando");
		}
	}

	@Override
	public void alimentar() {
		System.out.println("Comida de Lagarto");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("Rrrrrrrrrr");
		
	}


	@Override
	public void parar() {
		if (!this.isParado()) {
			this.setParado(true);
		}
				
	}
}
