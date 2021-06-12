package project02;
import javax.swing.*;
public class MineSweeper {

	
		private static final int NUM_MINES=100;
	    private static final int Sýze=20;


	public static void main(String[] args){

	    JFrame frame=new JFrame("Mine Sweeper | # of mines:"+ NUM_MINES);
	    frame.add(new MineSweeperGUI(Sýze,Sýze,NUM_MINES));
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setSize(1000,600);
	    frame.setVisible(true);

	
	}

}
