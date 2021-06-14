package project02;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonHandler implements ActionListener{
	private int row,col;
    private MineGrid grid;

  public ButtonHandler(int x,int y,MineGrid g){
      row=x;
      col=y;
      grid=g;

  }

public void actionPerformed(ActionEvent event){

      if(grid.isMine(row,col)){
    	  if(event.getSource() instanceof JButton) {
    		  JButton button= (JButton) event.getSource();
    		  button.setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\Cs102\\images\\greymine.png"));
        
    	  }
    		 JOptionPane.showMessageDialog(null,"OOOPS!!");
       
          System.exit(0);
      }

      else {

          if(event.getSource() instanceof JButton){
              int info=grid.getCellContent(row,col);
        	  JButton button= (JButton) event.getSource();
             // button.setText(String.valueOf(grid.getCellContent(row,col)));
              if(info==1)
            	  button.setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\Cs102\\images\\one.png"));
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
                	
          }}


      }
     
}
/*public void setNeighbourSide(int row,int col,MineGrid grid) {
	int info=grid.getCellContent(row,col);
	int i=row;
	int j=col;
	if(info==0) { 
		
	setNeighbourSide(i-1,j-1,grid);
	setNeighbourSide(i-1,j,grid);
	setNeighbourSide (i-1,j+1,grid);

	setNeighbourSide (i,j-1,grid);
	setNeighbourSide(i,j+1,grid);

	setNeighbourSide (i+1,j-1,grid);
	setNeighbourSide (i+1,j,grid);
	setNeighbourSide (i+1,j+1,grid);
		
		
	}
		
}*/
}
