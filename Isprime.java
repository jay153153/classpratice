package homeclass;

public class Isprime
{
	
	public static void main(String[] args)
	{
		int LIMIT=100;
		
		for(int i=2;i<LIMIT;i++)
		{
			if(Isprime1(i))
			{
				System.out.print(i+" ,");
			}
		}

	}
	public static boolean Isprime1(int number)
	{
		for(int i=2;i<number;i++)
		{
			if(number%i==0)
			{
				return false;
			}
				
		}	
				return true;
	}
}
