package homework;

import java.awt.BorderLayout;
import javax.swing.*;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;

public class pratice3 extends JApplet{
		
		private JLabel lb;			//����
		private JButton bt;			//���s

		//�إߤ���
		public void init(){
		lb = new JLabel("�w����{");
		bt = new JButton("�ʶR");
		
		//�]�w�e��
	setLayout(new BorderLayout());   //�����޲z��
	
		//�s�W��e����
	add(lb,BorderLayout.NORTH);
	add(bt,BorderLayout.SOUTH);
	}
}
