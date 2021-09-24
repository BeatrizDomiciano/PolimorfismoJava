package exercicio_polimorfismo;

public class Mamifero extends Animal {

	private String corPelo;
	
	public String getCorPelo() {
		return corPelo;
	}

	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}

	@Override
	public void locomover() {
		if(this.isParado()) {
			this.setParado(false);
			System.out.println( "Correndo...");
		} else {
			System.out.println("Já esou correndo...");
		}
	}

	@Override
	public void alimentar() {
		System.out.println( "Mamando");
		
	}

	@Override
	public void emitirSom() {
		System.out.println( "Som de mamifero");
		
	}

	@Override
	public void parar() {
		if (!this.isParado()) {
			this.setParado(true);
		}
		
		
	}
	

}