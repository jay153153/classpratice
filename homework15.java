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
		
		
		JButton guess = new JButton("猜");
 		edit = new JTextArea();					//設置
 		answer.setColumns(4); 		
 		setLayout(new BorderLayout());         //視窗設計師
 		JPanel top = new JPanel(new FlowLayout(FlowLayout.RIGHT)); 
 		JPanel top1 = new JPanel(new FlowLayout(FlowLayout.LEFT)); 
 		               //   		   
 		top.add(guess);						//猜 按鈕在右上角
 		top1.add(answer);					//顯示框
		add(answer,BorderLayout.NORTH);       //顯示框
 		add(top,BorderLayout.EAST);        //猜
  		add(edit,BorderLayout.CENTER);       //輸入框
		//目標視窗
	
		setSize(640,480);	      //視窗大小
		setVisible(true);		  //是否能不能顯示視窗
		setDefaultCloseOperation(EXIT_ON_CLOSE); //按結束直接結束視窗


//執行區
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
				// 開始猜
				String guess = JOptionPane.showInputDialog("猜吧!");
				
				// 比對
				if (guess.equals(answer)){
					// 對了 => 恭喜老爺,...
					isWINNER = true;
					JOptionPane.showMessageDialog(null, "恭喜老爺,...");
					break;
				}else{
					// 錯了 => 提示 1A2b
					String result = checkAB(answer, guess);
					JOptionPane.showMessageDialog(null, guess + ":" + result);
				}
			}
			if (!isWINNER){
				JOptionPane.showMessageDialog(null, "嗐, 魯蛇, \n答案是:" + 
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
			// 洗牌
			int[] poker = new int[n];	// 0,0,...0
			int rand;
			boolean isOK;
			for (int i=0; i<poker.length; i++){
				
				do {
					rand = (int)(Math.random()*10);
					// 檢查機制
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

