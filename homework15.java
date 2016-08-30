package homework;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;



public class homework15 extends JFrame implements ActionListener{
	
	private JButton guess;
	private JTextArea edit;
	private	JTextField answer = new JTextField();
	
		public homework15(){
		super("guess_number");
		
		
		JButton guess = new JButton("�q");
 		edit = new JTextArea();					//�]�m
 		answer.setColumns(4); 		
 		setLayout(new BorderLayout());         //�����]�p�v
 		JPanel top = new JPanel(new FlowLayout(FlowLayout.RIGHT)); 
 		JPanel top1 = new JPanel(new FlowLayout(FlowLayout.LEFT)); 
 		               //   		   
 		top.add(guess);						//�q ���s�b�k�W��
 		top1.add(answer);					//��ܮ�
		add(answer,BorderLayout.NORTH);       //��ܮ�
 		add(top,BorderLayout.EAST);        //�q
  		add(edit,BorderLayout.CENTER);       //��J��
		//�ؼе���
	
		setSize(640,480);	      //�����j�p
		setVisible(true);		  //�O�_�ण����ܵ���
		setDefaultCloseOperation(EXIT_ON_CLOSE); //������������������


//�����
		guess.addActionListener(this);
		guess.addActionListener(new MyListener());
		guess.addActionListener(new homework.MyListener());
		guess.addActionListener(new ActionListener() {
		
			@Override
			public void actionPerformed(ActionEvent e) {
				doOpen();
				
			}
		});
	}

		private void doOpen() {
			boolean isWINNER = false;
			for (int i=0; i<10; i++){
				// �}�l�q
				String guess = JOptionPane.showInputDialog("�q�a!");
				
				// ���
				if (guess.equals(answer)){
					// ��F => ���ߦѷ�,...
					isWINNER = true;
					JOptionPane.showMessageDialog(null, "���ߦѷ�,...");
					break;
				}else{
					// ���F => ���� 1A2b
					String result = checkAB(answer, guess);
					JOptionPane.showMessageDialog(null, guess + ":" + result);
				}
			}
			if (!isWINNER){
				JOptionPane.showMessageDialog(null, "��, �|�D, \n���׬O:" + 
							answer);
			}
				
			
			
		}
		private String checkAB(JTextField answer2, String guess2) {
			// TODO Auto-generated method stub
			return null;
		}

		static String checkAB(String a, String g){
			int A, B; A = B = 0;
			for (int i=0; i<g.length();i++){
				if (g.charAt(i) == a.charAt(i)){
					A++;
				}else if (a.indexOf(g.charAt(i)) != -1){
					B++;
				}
			}
			return A + "A" + B + "B";
		}
		
		static String createAnswer(int n){
			// �~�P
			int[] poker = new int[n];	// 0,0,...0
			int rand;
			boolean isOK;
			for (int i=0; i<poker.length; i++){
				
				do {
					rand = (int)(Math.random()*10);
					// �ˬd����
					isOK = true;
					for (int j=0;j<i;j++){
						if (poker[j]==rand){
							isOK = false;
							break;
						}
					}
					
				}while (!isOK);
				
				poker[i] = rand;
				//System.out.println(poker[i]);
			}
			String ret = "";
			for (int v : poker) ret += v;
			
			return ret;
			
			
		}
	@Override
	public void actionPerformed(ActionEvent e) {
			
	}
	public static void main(String[] args) {
		new homework15();
	}
}

class MyListener implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}

}

