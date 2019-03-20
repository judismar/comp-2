import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//Observação importante: Como ainda estamos introduzindo Java, e o conceito de orientação a objeto não foi explicado, chamamos as funções dentro de uma classe de 'funções', apesar de não ser o termo correto.

public class Main
{
	public static void main(String[] args)
	{
		exceptTeste1();
		exceptTeste2();
		try //a ausência de try-catch aqui causa erro de compilação
		{
			exceptTeste3();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Arquivo não existe.");
		}
	}

	static void exceptTeste1() //Aqui tratamos duas exceções 'checked', i.e. exceções que precisam ser tratadas e são previsíveis. Se não tratar, o código não será compilado.
	{
		System.out.println("Nem todo código precisa estar no bloco 'try'. Apenas, de maneira estratégica, o que pode acarretar exceções (esperadas ou não).");
		FileInputStream f;
		try
		{
			f = new FileInputStream("arquivo.txt");
			//Aqui teríamos código de leitura de arquivo etc.
			f.close();
			System.out.println("Leitura de arquivo bem sucedida!");
		}
		catch(FileNotFoundException e)
		{
			//e.printStackTrace();
			System.out.println("Arquivo inexistente.");
		}
		catch(IOException e)
		{
			//e.printStackTrace();
			System.out.println("Erro ao fechar arquivo.");
		}
	}

	static void exceptTeste2() //Aqui tratamos 3 exceções 'unchecked', i.e. exceções que não precisam ser tratadas e indicam BUGS de programação. Neste caso, é importante que o programador corrija seus bugs.
	{
		try
		{
			int x = 3/0;
			System.out.println("Mensagem que não é imprimida: neste ponto, por ter tido exceção, já estamos indo para o bloco catch.");
		 	int y = 2/0;
			int z = 0/0;
		}
		catch(ArithmeticException e)
		{
			//e.printStackTrace();
			System.out.println("Observe que esta mensagem só é exibida uma vez.");
		}

		try
		{
			String s = null;
			int[] v = new int[5];
			int x = v[9];
			System.out.println("Primeiro caracter da string: " + s.charAt(0));
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			//e.printStackTrace();
		}
		catch(NullPointerException e)
		{
			System.out.println("Observe que este texto não é impresso. Por quê?");
		}
	}
	static void exceptTeste3() throws FileNotFoundException //Não precisamos tratar exceções na função atual. Podemos propagar a exceção usando 'throws', permitindo que outra função (inclusive a própria main) trate-a apropriadamente.
	{
		FileInputStream f = new FileInputStream("arquivo.txt");
		//f.close();
	}
}
