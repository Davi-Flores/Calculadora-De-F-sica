import java.util.Scanner;

public class ForcaElastica {
	private double constMola;
	  private double defMola;

	  public void setValues() {
	    Scanner sc = new Scanner(System.in);

	    System.out.println("Calculando a força elástica\n");
	    System.out.print("Digite a constante elástica do corpo: ");
	    this.constMola = sc.nextDouble();
	    System.out.print("Digite a deformação percebida no corpo: ");
	    this.defMola = sc.nextDouble();
	  }

	  public void getResult() {
	    double result = this.constMola * this.defMola;
	    System.out.printf("O resultado é: %f\n", result);
	  }
}
