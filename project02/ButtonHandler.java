package project02;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ButtonHandler implements ActionListener{
	private int row,col;
    private MineGrid grid;
    private ArrayList<JButton>btns;

  public ButtonHandler(int x,int y,MineGrid g,ArrayList<JButton> btn){
      row=x;
      col=y;
      grid=g;
      btns=btn;

  }

public void actionPerformed(ActionEvent event){
int value=0;
      if(grid.isMine(row,col)){
    	  if(event.getSource() instanceof JButton) {
    		  JButton button= (JButton) event.getSource();
    		  for(JButton btn:btns) {
    		//2d array coverted for button arraylist
    			  if(grid.isMine(value/20,value%20)){  
    		btn.setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\Cs102\\images\\greymine.png"));  
    			
 }
    value++;
    		button.setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\Cs102\\images\\greymine.png"));
    		  }
    		  MineSweeper.iconSetter(new ImageIcon("C:\\Users\\user\\Desktop\\Cs102\\images\\deadsmiley.png"));
    	  }
    		 JOptionPane.showMessageDialog(null,"OOOPS!!");
       
    		 System.exit(0);
      }

      else {
    
          if(event.getSource() instanceof JButton){
              int info=grid.getCellContent(row,col);
        	  JButton button= (JButton) event.getSource();
             // button.setText(String.valueOf(grid.getCellContent(row,col)));
        	  MineSweeperGUI.getIsClicked()[row][col]=true;
        	  if(info==1) {
            	  button.setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\Cs102\\images\\one.png"));
           
        	  }
              else if(info==2)
            	  button.setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\Cs102\\images\\two.png"));
              else if(info==3)
            	  button.setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\Cs102\\images\\three.png"));
            	 else if(info==4)
            		 button.setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\Cs102\\images\\four.png"));
                	  else if(info==5)
                    	  button.setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\Cs102\\images\\five.png"));
                	  else if(info==6)
                    	  button.setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\Cs102\\images\\six.png"));
                	  else if(info==7)
                    	  button.setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\Cs102\\images\\seven.png"));
                	  else if(info==8)
                    	  button.setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\Cs102\\images\\eight.png"));
                	  else if(info==0) {
                    	  
                		 
                		  setNeighbourSide(row,col,grid,button);
                	
          }}


      }
     
}
public void setNeighbourSide(int row,int col,MineGrid grid,JButton btn) {
	int info=grid.getCellContent(row,col);
	int i=row;
	int j=col;
	JButton b=btn;
	int[][] a=MineGrid.getMap();
	if(i<0||i>=a.length||j<0||j>=a[0].length)
		return;
	
	else
	
	{ 
		 b.setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\Cs102\\images\\blank.png"));
	setNeighbourSide(i-1,j-1,grid,btn);
	setNeighbourSide(i-1,j,grid,btn);
	setNeighbourSide (i-1,j+1,grid,btn);

	setNeighbourSide (i,j-1,grid,btn);
	setNeighbourSide(i,j+1,grid,btn);

	setNeighbourSide (i+1,j-1,grid,btn);
	setNeighbourSide (i+1,j,grid,btn);
	setNeighbourSide (i+1,j+1,grid,btn);
	
		
	}
		
}
}
