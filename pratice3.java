package homework;

import java.awt.BorderLayout;
import javax.swing.*;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;

public class pratice3 extends JApplet{
		
		private JLabel lb;			//標籤
		private JButton bt;			//按鈕

		//建立元件
		public void init(){
		lb = new JLabel("歡迎光臨");
		bt = new JButton("購買");
		
		//設定容器
	setLayout(new BorderLayout());   //版面管理員
	
		//新增到容器中
	add(lb,BorderLayout.NORTH);
	add(bt,BorderLayout.SOUTH);
	}
}
