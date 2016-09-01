package homework;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Lotto extends JFrame{
	private JLabel JL ;
	private JButton JB;
	private JTextArea TA;
	private JPanel JP1,JP2;
	public static void main(String[] args) {
			new Lotto();
	}
	Lotto(){
		super("不會中的大樂透");
	
	//建立元件
	JB = new JButton("怒抽");
	JP1 = new JPanel();
	JP2 = new JPanel(new GridLayout(2,3));
	//將元件加速容器
	JP1.add(JB);
	//視窗設定
	setSize(400,400);
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	getContentPane().add(BorderLayout.NORTH,JP1);
	add(JP2);
	JB.addActionListener(new ActionListener(){
	
		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			Running();
		}
		
	});
	}
	void Running()
	{
	    int[] num = new int[6] ;
	    int rand ;
	    boolean isOk ;
	
	   for(int i = 0 ; i < num.length ; i ++)
	   {
		   do
		   {
			   rand = (int)(Math.random() * 49 +1) ;
			   isOk = true ;
			
			   for(int j = 0 ; j < i ; j ++)
			   {
				   if(num[j] == rand)
				   {
					   isOk = false ; 
					   break ;
				   }
			   }	
		   }
		   while(!isOk) ;
		
	       num[i] = rand ;
	       
	       
	       JP2.add(new JLabel(Integer.toString(num[i]))) ;
	    }
	}
	

}

