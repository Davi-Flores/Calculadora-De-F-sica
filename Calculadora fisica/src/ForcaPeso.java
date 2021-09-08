import java.util.Scanner;

public class ForcaPeso {
	  private double massa;
	  private double gravidadeLocal;

	  public void setValues() {
	    Scanner sc = new Scanner(System.in);

	    System.out.println("Calculando a força peso\n");
	    System.out.print("Digite a massa: ");
	    this.massa = sc.nextDouble();
	    System.out.print("Digite a gravidade local: ");
	    this.gravidadeLocal = sc.nextDouble();
	  }

	 

	public void getResult() {
		System.out.printf("O resultado é: %f\n", this.massa * this.gravidadeLocal);
		
	}

	
}
