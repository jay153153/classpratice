package homeclass;

import java.util.Scanner;

public class grammer_switch 
{
	public static void print(String name)
	{
		System.out.println(name);
	}
	public static void main(String[] args)
	{
	
	
	
		Scanner scanner=new Scanner(System.in);
		print("請輸入星期幾: ");
		while(true)
		{
			int day=scanner.nextInt();
		
			switch(day)
				{
				
				case 1:
					print("wear new clothes");
					break;
				case 2:
					print("hungry");
					break;
				case 3:
					print("go to mountains");
					break;
				case 4:
					print("go to test");
					break;
				case 5:
					print("dance");
					break;
				case 6:
					print("Douliou");
					break;
				}
			}
		
	}

}

