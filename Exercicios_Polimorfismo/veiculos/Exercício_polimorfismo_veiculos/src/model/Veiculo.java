package model;

import java.util.Scanner;

public class Veiculo {
	private Double peso;
	private Double velocMax;
	private Double preco;
	
	Scanner entrada = new Scanner(System.in);
	
	protected Veiculo() {
		peso = (double) 0;
		velocMax = (double) 0;
		preco = (double) 0;
	}
	
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	public Double getVelocMax() {
		return velocMax;
	}
	public void setVelocMax(Double velocMax) {
		this.velocMax = velocMax;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	//Outro m�todos
	
	public void entrVeic() {
		System.out.print("Informe o peso em kg: ");
		this.peso = entrada.nextDouble();
		System.out.print("Informe a velocidade m�xima em km/h: ");
		this.velocMax = entrada.nextDouble();
		System.out.print("Informe o pre�o em R$: ");
		this.preco = entrada.nextDouble();
	}
	
	public void mostrVeic() {
		System.out.println("Peso: " + peso + "kg");
		System.out.printf("Velocidade m�xima: %.2f km/h", velocMax);
		System.out.printf("\nPre�o: R$%.2f", preco);
	}
	
	
}
