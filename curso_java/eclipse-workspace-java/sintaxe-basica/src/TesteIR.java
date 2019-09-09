import java.text.DecimalFormat;

public class TesteIR {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#,###.00");
		double salario = 3300.0, valorIR;

		if (salario <= 1903.98) {
			System.out.println("Usuário isento!");
		} else if (salario <= 2826.65) {
			valorIR = salario * 1.075;
			System.out.println("Valor da alíquota do IR: R$" + df.format(valorIR));
		} else if (salario <= 3751.05) {
			valorIR = salario * 1.15;
			System.out.println("Valor da alíquota do IR: R$" + df.format(valorIR));
		} else if (salario <= 4664.68) {
			valorIR = salario * 1.225;
			System.out.println("Valor da alíquota do IR: R$" + df.format(valorIR));
		} else {
			valorIR = salario * 1.275;
			System.out.println("Valor da alíquota do IR: R$" + df.format(valorIR));
		}

	}

}
