/*package caculator;
import java.awt.*;
import java.awt.FlowLayout;
import java.awt.Button;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class main 
{	
	public static void main(String[] args)
	{
		myFrame frame=new myFrame();
		frame.setResizable(false);  //使窗口无法被拉伸
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //关闭窗口
		frame.setVisible(true);  //使窗口可以显示存入数
		frame.setLayout(new FlowLayout(FlowLayout.CENTER,20,5));*/
		/*p1.add(new TextField(30));*/
		/*JTextField p1;
		p1=new JTextField("");
		p1.setEnabled(false);
	    frame.add(p1,BorderLayout.NORTH);
	    ActionListener command=new commandAction();
	    Panel p2=new Panel();
	    Panel p3=new Panel();
	    p2.setPreferredSize(new Dimension(270,50));
	    p2.setLayout(new GridLayout(1,2,10,10));
	    p2.add(new Button("<<"));
	    p3.setPreferredSize(new Dimension(270,270));
	    p3.setLayout(new GridLayout(4,4,10,10)); //4行4列  纵横间距10
	    String[] name= {"7","8","9","+","4","5","6","-","1","2","3","*",".","0","=","/"};
	    for(int i=0;i<name.length;i++)
	    {
	    	p3.add(new Button(name[i]));
	    }
	    frame.add(p2,BorderLayout.CENTER);
	    frame.add(p3,BorderLayout.SOUTH);
		public void init()
	    {
		    allListener f1=new allListener();
	    }
	    public class  allListener implements ActionListener
	    {
	    	public void actionPerformed(ActionEvent e) 
	    	{
	    	   p2.setText("1");
	    	}
	    }
	    
	    new main().init();
	}*/
	/*class myPanel extends JPanel
	{
		JTextField p1;}
		p1=new JTextField("");
		p1.setEnabled(false);
	    frame.add(p1,BorderLayout.NORTH);
	    public void addButton2(String label,ActionListener Listener)
	    {
		    Panel p2=new Panel();
    	    JButton button=new JButton(label);
    	    Button.addActionListener(Listener);
    	    p2.add(button);
        }
	    private void addButton3(String label,ActionListener Listener)
        {
		    Panel p3=new Panel();
    	    JButton button=new JButton(label);
    	    button.addActionListener(Listener);
    	    p3.add(button);
        }*/
	    /*class commandAction implements ActionListener
 	    {
		    public void actionPerformed(ActionEvent event)
		    {
			   JTextField p1;
			   p1=new JTextField("");
			   String executeButton=new String();
			   executeButton=event.getActionCommand();
			   if(executeButton != "<<" &&  executeButton != "=")
			   {
				   p1.setText(p1.getText() + executeButton);
			   }
		     }
	      }
    }
}*/
