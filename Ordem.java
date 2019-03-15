import java.util.Random;

public class Ordem
{
	public static void main(String[] args)
	{
		Random rd = new Random();
		int[] v = new int[10];
		for (int i = 0; i < 10; i++)
		{	
			v[i] = rd.nextInt(100);
			System.out.print(v[i] + " ");
		}
		int menor;
		int aux = 0;
		int i;
		i = 0;
		//while(i < 10) {i++;}
		for(int k = 0; k < 10; k++)
		{
			menor = 100;
			for(i = k; i < 10; i++)
				if(v[i] < menor)
				{
					menor = v[i];
					aux = v[k];
					v[k] = menor;
					v[i] = aux;
				}
		}
		System.out.println("");
		for (i = 0; i < 10; i++)
		{	
			System.out.print(v[i] + " ");
		}
	}			
}
