package homework;

import java.awt.BorderLayout;

import javax.swing.JApplet;
import javax.swing.JButton;

public class pratice4 extends JApplet{

	private JButton[] bt = new JButton[5];
	
	public void init(){
		//�إߤ���
		
		bt[0] = new JButton("N");
		bt[1] = new JButton("S");
		bt[2] = new JButton("C");
		bt[3] = new JButton("W");
		bt[4] = new JButton("E");

		//�إ߮e��
		setLayout(new BorderLayout());
		
		//�N����إߩ�e����
		
		add(bt[0],BorderLayout.NORTH);
		add(bt[1],BorderLayout.SOUTH);
		add(bt[2],BorderLayout.CENTER);
		add(bt[3],BorderLayout.WEST);
		add(bt[4],BorderLayout.EAST);
		
	}
}
