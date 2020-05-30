package model;

public class Caminhao extends Veiculo {
	private double cargaMax;
	private int alturaMax;
	private int comprimento;
	
	public double getCargaMax() {
		return cargaMax;
	}
	public void setCargaMax(double cargaMax) {
		this.cargaMax = cargaMax;
	}
	public int getAlturaMax() {
		return alturaMax;
	}
	public void setAlturaMax(int alturaMax) {
		this.alturaMax = alturaMax;
	}
	public int getComprimento() {
		return comprimento;
	}
	public void setComprimento(int comprimento) {
		this.comprimento = comprimento;
	}
	//Construtor
	public Caminhao(double cargaMax, int alturaMax, int comprimento) {
		cargaMax = (double) 0;
		alturaMax = (int) 0;
		comprimento = (int) 0;
	}
	// Outro metodos
	public void entrCam(){
		System.out.println("\nCaminh�o\n");
		System.out.print("Digite o valor da carga m�xima do cam em kg: ");
		this.cargaMax = entrada.nextDouble();
		System.out.print("Digite o valor da altura m�xima em metros: ");
		this.alturaMax = entrada.nextInt();
		System.out.print("Digite o valor do comprimento em metros: ");
		this.comprimento = entrada.nextInt();
		this.entrVeic();
	}
	public void mostrCam() {
		System.out.printf("Carga m�xima: %.2fkg", cargaMax);
		System.out.println("\nAltura m�xima: "+alturaMax+"m");
		System.out.print("Comprimento: "+comprimento+" metros\n");
		this.mostrVeic();
	}
}
