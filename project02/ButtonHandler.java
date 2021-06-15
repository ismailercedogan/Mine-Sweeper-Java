package project02;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ButtonHandler implements ActionListener{
	private int row,col;
    private MineGrid grid;
    private Btn[][]btns;
    

  public ButtonHandler(int x,int y,MineGrid g,Btn[][]btn){
      row=x;
      col=y;
      grid=g;
      btns=btn;

  }

public void actionPerformed(ActionEvent event){

      if(grid.isMine(row,col)){
    	  if(event.getSource() instanceof Btn) {
    		  Btn button= (Btn) event.getSource();
    		  for(int i=0;i<btns.length;i++) {
    			  for(int j=0;j<btns[0].length;j++)
    		
    			  if(grid.isMine(i,j)){  
    		btns[i][j].setIcon(new ImageIcon("images\\greymine.png"));  
    			
 }
 
    		
    		  }
    		  MineSweeper.iconSetter(new ImageIcon("images\\deadsmiley.png"));
    		  button.setIcon(new ImageIcon("images\\greymine.png"));
    	  }
    		 
    	  JOptionPane.showMessageDialog(null,"OOOPS!!");
       
    		 System.exit(0);
      }

  
}


}


