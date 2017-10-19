package mundo;

public class PotenciaInt 
{
	public static int potencia(int a, int b)
	{
		return (b==0)?1:a*potencia(a, b-1);
	}
	
	public static int multiplicar(int a,int b)
	{
		return (b==0)?0:a+multiplicar(a, b-1);
	}
	
	public static int factorial(int n)
	{
		return (n==0)?1:n*factorial(n-1);
	}

}
