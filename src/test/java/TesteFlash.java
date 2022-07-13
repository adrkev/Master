import java.util.Scanner;

public class TesteFlash {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String nome;
		Boolean i;
		int idade;
		System.out.println("Login de cadastro pra escola #FlashCode");

		System.out.println("Digite seu nome:");
		nome = scan.nextLine();

		System.out.println("Digite sua idade:");
		idade = scan.nextInt();

		System.out.println("O valor das mensalidades vai ser de 250R$, você esta de acordo?");
		i = scan.nextBoolean();

		if (idade >= 18 && i == true) {
			System.out.println("Seja Bem Vindo!");
		} else {
			System.out.println("Infelizmente vc não está pronto pra entra na melhor escola");
		}

	}

}
