import java.util.Scanner;

public class Impulso {
	private double forca;
	  private double tempoInicial;
	  private double tempoFinal;

	  public void setValues() {
	    Scanner sc = new Scanner(System.in);

	    System.out.println("Calculando o impulso\n");
	    System.out.print("Força: ");
	    this.forca = sc.nextDouble();
	    System.out.print("Digite o tempo inicial: ");
	    this.tempoInicial = sc.nextDouble();
	    System.out.print("Digite o tempo final: ");
	    this.tempoFinal = sc.nextDouble();
	  }

	  public void getResult() {
	    // f - i
	    double result = this.forca * (this.tempoFinal - this.tempoInicial);
	    System.out.printf("O resultado é: %f\n", result);
  }
}