package exercicio_polimorfismo;

public class Polimorfismo {

	public static void main(String[] args) {
		
		Mamifero m = new Mamifero();
		Peixe p = new Peixe();
		Reptil r = new Reptil();
		Aves a = new Aves();
		Cachorro c = new Cachorro();
		
		System.out.println("----Mamifero----");
		
		
		m.setPeso(10.5f);
		m.setCorPelo("Marrom");
		m.alimentar();
		m.locomover();
		m.emitirSom();
		
		System.out.println("");
		System.out.println("----Peixe----");
		
		
		p.setPeso(.80f);
		p.setCorEscama("Azul e Verde");
		p.locomover();
		p.alimentar();
		
		System.out.println("");
		System.out.println("----Réptil----");
		
		
		r.setPeso(12.5f);
		r.setCorEscama("Verde");
		r.locomover();
		r.emitirSom();
		
		System.out.println("");
		System.out.println("----Aves----");
		
		
		a.setPeso(5.87f);
		a.setCorPena("Vermelho");
		a.locomover();
		a.alimentar();
		
		System.out.println("");
		System.out.println("----Cachorro----");
		
		
		c.setIdade(5);
		c.setCorPelo("Branco");
		c.reagir("Toma comida");
		c.reagir("Vá dormir");
		c.reagir(true);
		c.reagir(false);
		c.emitirSom();

	}

	}


