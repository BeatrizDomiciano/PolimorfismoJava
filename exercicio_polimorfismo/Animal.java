package exercicio_polimorfismo;

public abstract class Animal {
	protected float peso;
	protected int idade;
	protected int membros;
	protected boolean parado = true;
	
	public abstract void  locomover();
	public abstract void  alimentar();
	public abstract void  emitirSom();
	public abstract void  parar();
	
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public boolean isParado() {
		return parado;
	}
	public void setParado(boolean parado) {
		this.parado = parado;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getMembros() {
		return membros;
	}
	public void setMembros(int membros) {
		this.membros = membros;
	}

}