//Aula de sexta-feira, dia 15 de março.

import java.util.Random;

public class F
{
	//U = {0, 1, ..., u-1}
	public static void main(String[] args)
	{
		int[] x = new int[10];
		int[] y = new int[7];

		preencheArray(x, 20);
		preencheArray(y, 20);
		imprimeArrayInt(x);
		imprimeArrayInt(y);
		//System.out.println(soma(x));
		int[] z = intersecaoArrays(x, y);
		imprimeArrayInt(z);
	}

	static void imprimeArrayInt(int[] a)
	{
		for(int i=0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println("");
	}

	static void preencheArray(int[] a, int u)
	{
		Random r = new Random(); 
		for(int i=0; i < a.length; i++)
			a[i] = r.nextInt(u);
	}

	static int soma(int[] x)
	{
		int aux = 0;
		for(int i=0; i < x.length; i++)
			aux += x[i];
		return aux;
	}

	static int[] intersecaoArrays(int[] a1, int[] a2)
	{
		int[] x;
		int cont = 0;
		for(int i=0; i < a1.length; i++)
			for(int j=0; j < a2.length; j++)
				if(a1[i] == a2[j])
				{
					cont++;
					break;
				}
		x = new int[cont];
		int k = 0;
		for(int i=0; i < a1.length; i++)
			for(int j=0; j < a2.length; j++)
				if(a1[i] == a2[j])
				{
					x[k] = a1[i];
					k++;
					break;
				}
		return x;
	}
}
