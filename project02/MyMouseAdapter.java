package project02;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
public class MyMouseAdapter extends MouseAdapter {
	private int row,col;
	private MineGrid grid;
	
public MyMouseAdapter(int r,int c,MineGrid g) {	
this.row=r;
this.col=c;
this.grid=g;
}
	
	public void mouseClicked(MouseEvent e) {
		if(SwingUtilities.isRightMouseButton(e)) {
		if(e.getSource() instanceof JButton) {
  		  JButton button= (JButton) e.getSource();
  		  button.setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\Cs102\\images\\flagged.png"));
	
	   }
}}}
