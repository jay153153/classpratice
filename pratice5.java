package homework;

import java.awt.FlowLayout;

import javax.swing.JApplet;
import javax.swing.JButton;

public class pratice5 extends JApplet{
	
		private JButton[] bt = new JButton[5];
		
		public void init(){
		//�إߤ���
		for(int i=0;i<bt.length;i++)
			bt[i] =new JButton (Integer.toString(i)); //��o����ন�r��
		
		//�إ߮e��
		setLayout(new FlowLayout());
		
		//�s�W��e����
		for(int i=0 ; i<bt.length;i++)
		{
		add(bt[i]);
		}
	}
}
