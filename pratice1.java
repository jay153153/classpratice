package homework;

import java.io.*;

public class pratice1 {

	public static void main(String[] args)  {
		
		new pratice1().change();
				
	}

		public void change(){
			try{
				System.out.println("�п�J�@�ӥ����:");
				BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
				String s=input.readLine();
				int num=s.length();
			
				String[] suit={"�B","��","�d","�U","�B","��","�d","��","�B","��","�d","��","��","�d"};
				String[] word={"\t","��","�L","��","�v","��","��","�m","��","�h"};
				for(int i=0;i<num;i++){
					 
					 System.out.print(word[s.charAt(i)-48]+suit[num-1-i]);   //'0'���� int �O 48,'1'�O 49,...
				 }
				 System.out.print("����");
			}
			catch(Exception ex){}
			
		}//close method change

	}
