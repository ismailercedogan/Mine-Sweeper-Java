package project02;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ButtonHandler implements ActionListener{
	private int row,col;
    private MineGrid grid;
    private JButton[][]btns;
    

  public ButtonHandler(int x,int y,MineGrid g,JButton[][]btn){
      row=x;
      col=y;
      grid=g;
      btns=btn;

  }

public void actionPerformed(ActionEvent event){

      if(grid.isMine(row,col)){
    	  if(event.getSource() instanceof JButton) {
    		  JButton button= (JButton) event.getSource();
    		  for(int i=0;i<btns.length;i++) {
    			  for(int j=0;j<btns[0].length;j++)
    		
    			  if(grid.isMine(i,j)){  
    		btns[i][j].setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\Cs102\\images\\greymine.png"));  
    			
 }
 
    		
    		  }
    		  MineSweeper.iconSetter(new ImageIcon("C:\\Users\\user\\Desktop\\Cs102\\images\\deadsmiley.png"));
    		  button.setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\Cs102\\images\\greymine.png"));
    	  }
    		 
    	  JOptionPane.showMessageDialog(null,"OOOPS!!");
       
    		 //System.exit(0);
      }

      else {
    
          if(event.getSource() instanceof JButton){
             // int info=grid.getCellContent(row,col);
        	  JButton button= (JButton) event.getSource();
             // button.setText(String.valueOf(grid.getCellContent(row,col)));
        	  MineSweeperGUI.getIsClicked()[row][col]=true;
        	  if(grid.isInsideGrid(row, col)) {
        		check(this.row,this.col);  
        		  
        	  }
        	 
        	  
        	  
        	  
        	  
        	  /* if(info==1) {
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
                		  button.setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\Cs102\\images\\blank.png"));
                		 check(row,col);
                		 }
*/        	  }


      }
     
}
/*public void setNeighbourSide(int row,int col,MineGrid grid,JButton btn) {
	int info=grid.getCellContent(row,col);
	int i=row;
	int j=col;
	
	int[][] a=MineGrid.getMap();
	//if(i<0||i>=a.length||j<0||j>=a[0].length)
		//return;
	boolean check=MineSweeperGUI.getIsClicked()[i][j]=true;
	btn.setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\Cs102\\images\\blank.png"));
	System.out.println(!(i<0||i>=a.length||j<0||j>=a[0].length)&&!check);
	
	if(info==0&&!(i<0||i>=a.length||j<0||j>=a[0].length))
	
	{ 
		 
	setNeighbourSide(i-1,j,grid,btn);
	setNeighbourSide(i+1,j,grid,btn);
	
	setNeighbourSide (i,j-1,grid,btn);
	setNeighbourSide(i,j+1,grid,btn);	
	}
		
}*/
public void check(int r,int c) {

if (!grid.isInsideGrid(r, c)||MineSweeperGUI.getIsClicked()[r][c]==true
) {
	return;
}
else if(grid.getCellContent(r, c)!=0||grid.getCellContent(r, c)!=-1){
	
	if(grid.getCellContent(r, c)==1) {
		btns[r][c].setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\Cs102\\images\\one.png"));
		MineSweeperGUI.getIsClicked()[r][c]=true;
	}
	else if(grid.getCellContent(r, c)==2) {
		btns[r][c].setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\Cs102\\images\\two.png"));
		MineSweeperGUI.getIsClicked()[r][c]=true;
	}
	else if(grid.getCellContent(r, c)==3) {
		btns[r][c].setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\Cs102\\images\\three.png"));
		MineSweeperGUI.getIsClicked()[r][c]=true;
	}
	else if(grid.getCellContent(r, c)==4) {
		btns[r][c].setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\Cs102\\images\\four.png"));
		MineSweeperGUI.getIsClicked()[r][c]=true;
	}
	else if(grid.getCellContent(r, c)==5) {
		btns[r][c].setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\Cs102\\images\\five.png"));
		MineSweeperGUI.getIsClicked()[r][c]=true;
	}
	else if(grid.getCellContent(r, c)==6) {
		btns[r][c].setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\Cs102\\images\\six.png"));
		MineSweeperGUI.getIsClicked()[r][c]=true;
	}
	else if(grid.getCellContent(r, c)==7) {
		btns[r][c].setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\Cs102\\images\\seven.png"));
		MineSweeperGUI.getIsClicked()[r][c]=true;
	}
	else if(grid.getCellContent(r, c)==8) {
		btns[r][c].setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\Cs102\\images\\eight.png"));
		MineSweeperGUI.getIsClicked()[r][c]=true;
	}
	
	
}
else if (grid.getCellContent(r, c)==0){
	 MineSweeperGUI.getIsClicked()[r][c]=true;
	btns[r][c].setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\Cs102\\images\\blank.png"));
	check(r-1,c);
	check(r+1,c);
	check(r,c+1);
	check(r,c-1);
}

}
}


