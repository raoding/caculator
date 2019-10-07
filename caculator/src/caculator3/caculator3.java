package caculator3;
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
public class caculator3
{
	public static void main(String[] args)
	{
		myFrame frame = new myFrame();
		frame.setResizable(false);  //使窗口无法被拉伸
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //关闭窗口
		frame.setVisible(true);  //使窗口可以显示存入数
		frame.setLayout(new FlowLayout(FlowLayout.LEFT,10,5));
	}
}
class myFrame extends JFrame
{
    public myFrame()
	{
		setTitle("简易计算器");
		add(new myPanel());
		setSize(300,300);
	}
}
class myPanel extends JPanel
{
	TextField display;
	JPanel p1=new JPanel();
	JPanel p2=new JPanel();
	public myPanel()
	{
		setLayout(new BorderLayout());
		display=new TextField("",30);
		display.setEnabled(false);
		add(display,BorderLayout.NORTH);
		ActionListener command=new commandAction();
		p1.setPreferredSize(new Dimension(180,40));
		p1.setLayout(new GridLayout(1,2,10,10));
		addbtn1("c",command);
		addbtn1("<<",command);
		add(p1 , BorderLayout.CENTER);
		p2.setPreferredSize(new Dimension(180,180));
		p2.setLayout(new GridLayout(4,4,10,10));
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
			if(Btning != "<<" && Btning!="c" )
			{
				display.setText(display.getText()+Btning);//显示字符的叠加
			}
		    if(Btning=="=")
			{
				display.setText(caculate(display.getText()));//调用计算方法返回计算结果
			}
			if(Btning =="<<")
			{
				String dp1=new String(display.getText());
				display.setText(dp1.substring(0, dp1.length()-1));//按一次清除一位
			}
			if(Btning =="c")
			{
				display.setText("");//清空显示器上的内容
			}
		}
	}
	public String caculate(String string)  //计算函数
	{
 	    StringBuffer dp2=new StringBuffer(string);
	    int symbol=0;
		int j=0;
		for(int i=0;i<dp2.length()-1;i++)
        {
			if(dp2.charAt(i)=='+' || dp2.charAt(i)=='-' || dp2.charAt(i)=='*' || dp2.charAt(i)=='/')
			{
				symbol++;//计算运算符号的个数
			}
        }
		char[ ] Symbol= new char[symbol];      //定义分别搜集数字和运算符的数组
		String[ ] Number= new String[symbol+1];
		int k=0;
		for(k=0;k<Number.length;k++)
		{
			Number[k]="";
		}
		for(k=0;k<(dp2.length()-1);k++)
		{
			if(dp2.charAt(k)=='+' || dp2.charAt(k)=='-' || dp2.charAt(k)=='*' ||dp2.charAt(k)=='/')
		    {
			    Symbol[j]=dp2.charAt(k);  
			    j++;
			    continue;
		    }
			else
			{
				Number[j]+=dp2.charAt(k);
			}
		}
		double result=0;
		for(int m=0;m<Symbol.length;m++)
		{
			double num1=Double.parseDouble(Number[m]);    //类型转换
			double num2=Double.parseDouble(Number[m+1]);
			char sb=Symbol[m];
			switch(sb)                   //判断运算符并进行运算
			{
			case '+':
				 result = num1 + num2;
				 break;
			case '-':
			     result = num1 - num2;
			     break;
			case '*':
			     result = num1 * num2;
			     break;
			case '/':
			     result = num1 / num2;
			     break;
		    default:
		    	 break;
			}
			Number[m+1]=String.valueOf(result);   //将先运算好的结果赋给后续的参与计算的参数
		}
		return String.valueOf(result);   //返回计算总结果
	}
}




 
