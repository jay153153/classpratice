package homework;

import java.util.Arrays;

import javax.swing.JOptionPane;
import java.io.*;
public class mathC {

	public static void main(String[] args){


	
	/*String hundred_thousand = JOptionPane.showInputDialog("�Q�U"); 
	String ten_thousand = JOptionPane.showInputDialog("�U"); 
	String thousand = JOptionPane.showInputDialog("�d"); 
	String hundred = JOptionPane.showInputDialog("��"); 
	String ten = JOptionPane.showInputDialog("�Q"); 
	String one = JOptionPane.showInputDialog("��"); 
	
	
	String[] suit={"�s","��","�L","��","�v","��","��","�m","��","�h","�B"};
	String[] value={"0","1","2","3","4","5","6","7","8","9"};

	int[][] math = new int[11][10];
	
	for(int[] change:math){
		Arrays.sort(change);
		for(int changes:change){
			System.out.println(suit[11]+value[10]+"��");
			}
	
		}*/
		
//		//�Ӧ�  "3"
//		String x = guess.substring(0,1);
//		//�B��
//		String xx = guess.substring(1,2);
//		//�ʦ�
//		String xxx = guess.substring(2,3);
//		
//		
//		int xZhIndex = value.;
//		//�Ӧ� 
//		String xZh = suit[xZhIndex];
//		//�B��
//		String tenZh = guess.substring(1,2);
//		//�ʦ�
//		String hundredZh = guess.substring(2,3);
		
		String[] suit={"�s","��","�L","��","�v","��","��","�m","��","�h"};
		String value= "0123456789";
		//i =3 , value[i] = "3" , suit[i] = "��"
		
		String inputStr = JOptionPane.showInputDialog("��J���ԧB�Ʀr");
		//12345 -> ���U�L�d�Ѩոv�B��
		
		String[] numberStrAry = new String[10];
		String[] numberZhStrAry = new String[10];
		
		//step1:����U�Ӧ��
		//step2:����U�Ӧ��index
		//step3:�B��index�A����U�Ӧ���c��r
		
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
				if(i == 1)outputStr += "�B" ;
				if(i == 2)outputStr += "��" ;
				if(i == 3)outputStr += "�a" ;
				if(i == 4)outputStr += "�U" ;
				if(i == 5)outputStr += "�Q�U" ;
				
				//System.out.println(outputStr);
			}
		}
		
		JOptionPane.showMessageDialog(null, outputStr);
		
	}
}