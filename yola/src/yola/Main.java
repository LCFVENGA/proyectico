package yola;

public class Main {

	public static void main(String[] args) {
		System.out.println("Numero fac de 5 es: "+ factorial(5));
	}
	
	public static double factorial(int n)
	{
		if(n==0)
		{
			return 1;
		}
		else
		{
			return n*factorial(n-1);
		}
	}

}
