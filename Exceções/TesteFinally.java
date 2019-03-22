public class TesteFinally
{
	public static void main(String[] args)
	{
		f();
	}

	static void f()
	{
		try
		{
			int x = 3/0;
			System.out.print("Não vai imprimir.");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Divisão por zero.");
			return;
		}
		catch(Exception e)
		{
			return;
		}
		finally
		{
			System.out.println("Fim de try-catch");
		}
	}
}
