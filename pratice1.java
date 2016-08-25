package homework;

import java.io.*;

public class pratice1 {

	public static void main(String[] args)  {
		
		new pratice1().change();
				
	}

		public void change(){
			try{
				System.out.println("請輸入一個正整數:");
				BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
				String s=input.readLine();
				int num=s.length();
			
				String[] suit={"拾","百","千","萬","拾","百","千","億","拾","百","千","兆","百","千"};
				String[] word={"\t","壹","貳","參","肆","伍","陸","柒","捌","玖"};
				for(int i=0;i<num;i++){
					 
					 System.out.print(word[s.charAt(i)-48]+suit[num-1-i]);   //'0'換成 int 是 48,'1'是 49,...
				 }
				 System.out.print("元整");
			}
			catch(Exception ex){}
			
		}//close method change

	}
