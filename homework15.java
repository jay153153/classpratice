package homework;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class homework15 extends JApplet{
	 static	int count;
	 static String answer = createAnswer(4);
private	 JPanel jpan , jpan2;
private	 JButton bton ;
private	 JTextField TF ;
private	 JTextArea TA ;
private	 JLabel LB ;

	public void init()
	{
		//建立元件
		LB = new JLabel("請輸入數字");
		bton = new JButton("猜");
		TF   = new JTextField(20);//輸入數字 最多20個
		TA   = new JTextArea(20,100);
		jpan = new JPanel();
		jpan2 = new JPanel();
		//建立容器
		jpan.add(LB);
		jpan.add(TF);
		jpan.add(bton);
		jpan2.add(TA);
		add(jpan,BorderLayout.NORTH);
		add(jpan,BorderLayout.CENTER);
		//設置視窗
		setSize(200,400); //設置視窗大小
		setVisible(true);	//是否能不能顯示視窗
//		setDefaultCloseOperation(EXIT_ON_CLOSE);//按下打X 能結束執行
		//將元件放於容器中
		setLayout(new BorderLayout());   //視窗設計師
//		JPanel jpan = new JPanel(new FlowLayout(FlowLayout.LEFT)); //水流式版面
//		add(bton,BorderLayout.NORTH);
		
		//登陸傾聽者
		bton.addActionListener(new ActionListener1());
		
		
	}

class ActionListener1 implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent ae) {
		run();
		 //count++;
		 System.out.println(count);
		 if(count>10){
			 JOptionPane.showMessageDialog(null, "嗐, 魯蛇, \n答案是:" + answer);
		}
	}
}
	 void run() {
		String player = TF.getText();
		TF.setText("");
		String result = checkAB(answer, player);
		if(player.equals(answer)){
	          TA.append(player+"=>"+result+"\n");
	          JOptionPane.showMessageDialog(null, "恭喜老爺,賀喜夫人...");
		 }
		 else{
			 TA.append(player+"=>"+result+"\n");
		 }
	 count++;
	 }	 
	static String checkAB(String answer,String player){
		 int A=0,B=0;
		 for(int i=0;i<player.length();i++){
			 if(player.charAt(i)==answer.charAt(i)){
				A++; 
			 }
			 else if(answer.indexOf(player.charAt(i))!=-1){
				 B++;
			 }
		 }
		 return A+"A"+B+"B";
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
			StringBuffer ret =new StringBuffer("");
			for (int v : poker) ret.append(v);
			  String rets=ret.toString();
			return rets;	
	}

}
