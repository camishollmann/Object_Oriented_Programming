// Acessar: https://tinyurl.com/aula29-04package sobrecarga;
package sobrecarga; 

class Pizza {
	private String sabor;
	
	public Pizza(String sabor) {
		this.sabor = sabor;
	}
	
	public void mostrarMensagem() {
		System.out.println("Pizza sabor " + sabor);
	}	
}

class Carne {
	private String corte;
	
	public Carne(String corte) {
		this.corte = corte;
	}
	
	public void mostrarMensagem() {
		System.out.println("Carne corte " + corte);
	}
}

class Pao {
	private String tipo;
	
	public Pao(String tipo) {
		this.tipo = tipo;
	}
	
	public void mostrarMensagem() {
		System.out.println("Pão tipo " + tipo);
	}	
}


Class Forno {
	public void assar(Pao pa) {
		System.out.println("Assando pão");
		pa.mostrarMensagem();
	}
	
	public void assar(Carne c) {
		System.out.println("Assando carne");
    c.mostrarMensagem();
	}
	
	public void assar(Pizza pi) {
		System.out.println("Assando pizza");
		pi.mostrarMensagem();
	}
}	

public static void main(String[] args) {
	Pao p1 = new Pao("Brioche");
	Pao p2 = new Pao("Francês");
	
	Carne c1 = new Carne("Picanha");
	Carne c1 = new Carne("Fraldinha");
	
	Pizza pi1 = new Pizza("Quatro queijos");
	Pizza pi2 = new Pizza("Frango com catupiry");
	
	assar(p1);
	assar(p2);
	assar(pi1);
	assar(pi2);
	assar(c1);
	assar(c2);	
}