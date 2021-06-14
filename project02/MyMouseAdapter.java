package project02;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
public class MyMouseAdapter extends MouseAdapter {
	private int row,col;
	private MineGrid grid;
	private static int count=0;
	
public MyMouseAdapter(int r,int c,MineGrid g) {	
this.row=r;
this.col=c;
this.grid=g;

}
	
	public void mouseClicked(MouseEvent e) {
	
		if(SwingUtilities.isRightMouseButton(e)) {
		if(e.getSource() instanceof JButton) {
  		  JButton button= (JButton) e.getSource();
  		 if(!MineSweeperGUI.getIsFlagged()[row][col]&&!MineSweeperGUI.getIsClicked()[row][col]) {
  		  
		 button.setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\Cs102\\images\\flagged.png"));
		 MineSweeperGUI.getIsFlagged()[row][col]=true;
	   count++;
	   int number=1;
	   if(count==100) {
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(!grid.isMine(i, j)){
					number=0;
				}
						
			}
		}
		  if (number==1) {
			JOptionPane.showMessageDialog(null," YOU WON!!!");
			  System.exit(0);
	   
		  }
		  }
	   
  		 }
  		 else if(!MineSweeperGUI.getIsClicked()[row][col]){
  			 button.setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\Cs102\\images\\covered2.png"));
  			MineSweeperGUI.getIsFlagged()[row][col]=false;
  		 count--;
  		 }
  		 
		}
		
		}}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		MyMouseAdapter.count = count;
	
	
	
}}
