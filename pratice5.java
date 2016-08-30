package homework;

import java.awt.FlowLayout;

import javax.swing.JApplet;
import javax.swing.JButton;

public class pratice5 extends JApplet{
	
		private JButton[] bt = new JButton[5];
		
		public void init(){
		//建立元件
		for(int i=0;i<bt.length;i++)
			bt[i] =new JButton (Integer.toString(i)); //把這整數轉成字串
		
		//建立容器
		setLayout(new FlowLayout());
		
		//新增到容器中
		for(int i=0 ; i<bt.length;i++)
		{
		add(bt[i]);
		}
	}
}
