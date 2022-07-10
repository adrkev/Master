import java.util.Scanner;

public class Calculo {

	public static void main(String[] args) 
	{
	Operacoes o = new Operacoes();
	
	Scanner scan = new Scanner(System.in);
	int v1, v2;
	int soma, mult, sub;
	double div;
	System.out.println("Digite um valor:");
	v1 = scan.nextInt();
	System.out.println("Digite outro valor:");
	v2 = scan.nextInt();
	
	soma = v1 + v2;
	mult = v1 * v2;
	 sub = v1 - v2;
	 div = v1 / v2;
	 
	 System.out.println("A soma é: " + soma);
	 System.out.println("A multiplicação é: " + mult);
	 System.out.println("A subtração é: " + sub);
	 System.out.println("A divisão é: " + div);
	 
	   //  o .soma(70, 80);
	//     o .vezes(5, 8);
	//    o .divisao(10, 2);
//	     o .subtrair(10, 5);
	}

}
