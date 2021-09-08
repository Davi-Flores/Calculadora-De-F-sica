import java.util.Scanner;

public class ForcaCentripeda {
	private double massa;
	  private double velocidade;
	  private double raio;

	  public void setValues() {
	    Scanner sc = new Scanner(System.in);

	    System.out.println("Calculando a força centrípeta\n");
	    System.out.print("Digite a massa: ");
	    this.massa = sc.nextDouble();
	    System.out.print("Digite a velocidade: ");
	    this.velocidade = sc.nextDouble();
	    System.out.print("Digite o raio: ");
	    this.raio = sc.nextDouble();
	  }

	  public void getResult() {
	    double result = this.massa * (this.velocidade * this.velocidade) / this.raio;
	    System.out.printf("O resultado é: %f\n", result);
	  }
}
