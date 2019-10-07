/*package caccukator2;
import java.awt.*;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class caculator
{
	public static void main(String[] args)
	{
		caculator f =new caculator(); 
		myFrame frame = f.new myFrame();
		frame.setResizable(false);  //使窗口无法被拉伸
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //关闭窗口
		frame.setVisible(false);  //使窗口可以显示存入数
	}
	class myFrame extends JFrame
	{
		public myFrame()
		{
			setTitle("简易计算器");
			setSize(300,400);
			pack();
		}
	}
	class myPanel extends JPanel
	{
		JTextField display;
		JPanel p1=new JPanel();
		JPanel p2=new JPanel();
		public myPanel()
		{
			
		    JTextField display=new JTextField("");
		    display.setEnabled(false);
		    add(display,BorderLayout.NORTH);
		    ActionListener command=new commandAction();
		    p1.setLayout(new GridLayout(1,2));
		    p1.setPreferredSize(new Dimension(270,50));
		    addbtn1("c", command);
		    addbtn1("<<", command);
		    add(p1 , BorderLayout.CENTER);
		    p2.setLayout(new GridLayout(4,4));
		    p2.setPreferredSize(new Dimension(270,270));
		    String[] name= {"7","8","9","+","4","5","6","-","1","2","3","*",".","0","=","/"};
		    for(int i=0;i<name.length;i++)
	        {
	        	addbtn2(name[i],command);
	        }
	    	add(p2, BorderLayout.SOUTH);
		}
		public void addbtn1(String label, ActionListener listener)
		{
			Button btn=new Button(label);
			btn.addActionListener(listener);
			p1.add(btn);
		}
		private void addbtn2(String label, ActionListener listener)
		{
			Button btn=new Button(label);
			btn.addActionListener(listener);
			p2.add(btn);
		}
		private class commandAction implements ActionListener
		{
			@Override
			public void actionPerformed(ActionEvent event) 
			// TODO 自动生成的方法存根
			{
				String Btning=event.getActionCommand();
				if(Btning != "<<")
				{
					display.setText(display.getText()+Btning);
				}
			}
		}
		
	}

}*/
