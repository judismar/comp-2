import java.util.Scanner;

public class MediaNotas
{
	public static void main(String[] args)
	{
		float[] nota = new float[3];
		boolean ok;
		for(int i=0; i < 3; i++)
		{
			ok = false;
			while(!ok)
			{
				try
				{		
					nota[i] = informaNota(i+1);
					ok = true;
				}
				catch(NumberFormatException e)
				{
					System.out.println("Erro. Valor não numérico. Informe novamente.");
				}
				catch(NotaInvalida e)
				{
					System.out.println("Nota inválida. Informe novamente.");
				}
			}
		}
		float media = 0.0f;
		for(int i = 0; i < 3; i++)
			media += nota[i];
		media /= 3;
		System.out.println(media);
	}

	static float informaNota(int numProva) throws NotaInvalida, NumberFormatException
	{
		System.out.print("Informe a nota da prova " + numProva + ": ");
		Scanner input = new Scanner(System.in);
		float nota = 0;
		nota = Float.parseFloat(input.next());
		if(nota < 0 || nota > 10)
		{
			throw new NotaInvalida();
		}
		return nota;
	}
}
