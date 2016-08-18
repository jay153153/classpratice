package homeclass;

import java.util.Scanner;

public class game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float number=(float)Math.random();
		number *=1000.0f;
		int number2=(int)number;
		int guess;
		Scanner scanner=new Scanner(System.in);
		System.out.println("請輸入數字: ");
		
		while(true)
		{
			guess=scanner.nextInt();
			if (guess>number2)
			{
				System.out.println("too large");
			}
			else if(guess<number2)
			{
				System.out.println("too small");
			}
			else
			{
				System.out.println("BINGO!!");
			}
		}
		
	}

}
