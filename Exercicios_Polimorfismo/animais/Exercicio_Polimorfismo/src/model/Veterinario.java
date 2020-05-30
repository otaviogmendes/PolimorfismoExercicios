package model;


public class Veterinario{
	
	public void examinar(Cachorro cachorro) {
		
		System.out.println("O veterinario est� cuidando do cachorro ");
		cachorro.emitirSom();
	}
	
	public void examinar(Cavalo cavalo) {
	
		System.out.println("O veterinario est� cuidando do cavalo");
		cavalo.emitirSom();
	}
	
	public void examinar(Preguica preguica) {
	
		System.out.println("O veterinario est� cuidando da pregui�a");
		preguica.emitirSom();
	}

	
}
