import java.util.Scanner;

public class Ifelse {
	public static void main(String[] args)
	{
		Scanner entrada = new Scanner(System.in);
		double livroLinux;
		double livroJava;
		
		System.out.println("Entre com o preço do livro de Linux: ");
		livroLinux = entrada.nextDouble();
		System.out.println("Entre com o preço do livro de Java: ");
		livroJava = entrada.nextDouble();
		
		double total = livroLinux + livroJava;
		System.out.println("O preço total é " + total);
		
		
		if(livroLinux == 10) 
	    {  
			System.out.println("O livro linux 1ta quase de graça KKKKK compra ai");
	    }
		
		if(total <= 100)
		{
			System.out.println("Esse preço vale apena!");
		}
		
		else
		{
			System.out.println("O valor do livro está muito caro ");
		}
		
		
		if(livroLinux < livroJava)
		{
			System.out.println("Livro Linux mais barato");
		}
		else if(livroLinux > livroJava)
		{
			System.out.println("Livro Java mais barato");
		}
		else 
		{
			System.out.println("Ambos livros com o mesmo preço");
		}
	}
}
