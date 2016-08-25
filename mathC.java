package homework;

import java.util.Arrays;

import javax.swing.JOptionPane;
import java.io.*;
public class mathC {

	public static void main(String[] args){


	
	/*String hundred_thousand = JOptionPane.showInputDialog("窾"); 
	String ten_thousand = JOptionPane.showInputDialog("窾"); 
	String thousand = JOptionPane.showInputDialog(""); 
	String hundred = JOptionPane.showInputDialog("κ"); 
	String ten = JOptionPane.showInputDialog(""); 
	String one = JOptionPane.showInputDialog("じ"); 
	
	
	String[] suit={"箂","滁","禠","把","竩","ヮ","嘲","琺","","╤","珺"};
	String[] value={"0","1","2","3","4","5","6","7","8","9"};

	int[][] math = new int[11][10];
	
	for(int[] change:math){
		Arrays.sort(change);
		for(int changes:change){
			System.out.println(suit[11]+value[10]+"俱");
			}
	
		}*/
		
//		//  "3"
//		String x = guess.substring(0,1);
//		//珺
//		String xx = guess.substring(1,2);
//		//κ
//		String xxx = guess.substring(2,3);
//		
//		
//		int xZhIndex = value.;
//		// 
//		String xZh = suit[xZhIndex];
//		//珺
//		String tenZh = guess.substring(1,2);
//		//κ
//		String hundredZh = guess.substring(2,3);
		
		String[] suit={"箂","滁","禠","把","竩","ヮ","嘲","琺","","╤"};
		String value= "0123456789";
		//i =3 , value[i] = "3" , suit[i] = "把"
		
		String inputStr = JOptionPane.showInputDialog("块┰计");
		//12345 -> 滁窾禠把ㄕ竩珺ヮ
		
		String[] numberStrAry = new String[10];
		String[] numberZhStrAry = new String[10];
		
		//step1:计
		//step2:计index
		//step3:笲ノindex计羉砰
		
		int j = 0;
		//for(int i = 0 ; i < inputStr.length(); i++){
		for(int i = inputStr.length() ; i > 0; i--){
			
			numberStrAry[j] = inputStr.substring(i - 1, i);
			
			int index = value.indexOf(numberStrAry[j]);
			
			numberZhStrAry[j] = suit[index];
			
			 //System.out.println("i = " + i + ",index = " + index + ",suit[i] =" + suit[i] + ",numberZhStrAry[i] =" + numberZhStrAry[i]);
			//System.out.println("j = " + j + ", numberZhStrAry[j] =" + numberZhStrAry[j]);
			 
			 
			 j++;
		}
		
		String outputStr = "";
		
		for(int i = numberZhStrAry.length - 1 ; i >= 0 ; i--){
		//for(int i = 0 ; i < numberZhStrAry.length ; i++){
			if(numberZhStrAry[i] != null){
				outputStr += numberZhStrAry[i];
				if(i == 1)outputStr += "珺" ;
				if(i == 2)outputStr += "ㄕ" ;
				if(i == 3)outputStr += "" ;
				if(i == 4)outputStr += "窾" ;
				if(i == 5)outputStr += "窾" ;
				
				//System.out.println(outputStr);
			}
		}
		
		JOptionPane.showMessageDialog(null, outputStr);
		
	}
}