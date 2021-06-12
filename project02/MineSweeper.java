package project02;
import javax.swing.*;
import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;
public class MineSweeper {

	
		private static final int NUM_MINES=100;
	    private static final int Sýze=20;


	public static void main(String[] args){
		JLabel label3= new JLabel("s");
		Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int seconds = 0;
    
            @Override
            public void run() {
                if (seconds<10) {
            	label3.setText(String.valueOf("0"+seconds));
                seconds++;
                }
                else {
                	label3.setText(String.valueOf(seconds));
                    seconds++;
                }    
            }
            
        };
        timer.schedule(task, 0, 1000);
		
		Icon icon = new ImageIcon("C:\\Users\\user\\Desktop\\Cs102\\images\\smiley.png");
	    JFrame frame=new JFrame("Mine Sweeper | # of mines:"+ NUM_MINES);
	    frame.setLayout(new BorderLayout());
	    frame.setSize(1000,600);
	    JPanel panel1=new JPanel();
	  JPanel panel11=new JPanel();
	 JLabel label1=new JLabel("sad");
	  panel1.setLayout(new BorderLayout());
	  JPanel panel12=new JPanel();
	  JLabel label2= new JLabel(icon);
	  panel11.setBackground(Color.GREEN);
	  panel11.add(label1);
	
	  panel1.add(panel11,BorderLayout.WEST);
	  panel1.add(label2);  
	  label3.setFont(new Font("Digital-7 Mono", Font.PLAIN,40));
	  panel1.add(label3,BorderLayout.EAST);
	  panel1.setBackground(Color.GRAY);
	    frame.add(panel1,BorderLayout.NORTH);
	    JPanel panel2=new MineSweeperGUI(Sýze,Sýze,NUM_MINES);
	   
	    frame.add(panel2,BorderLayout.CENTER);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	
	   
	    frame.setVisible(true);

	
	}

}
