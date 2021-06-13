package project02;
import javax.swing.*;
import java.awt.*;
public class MineSweeperGUI extends JPanel {
	
	private static final long serialVersionUID = 1L;
	private  MineGrid grid;

	public  MineSweeperGUI(int numRows, int numCols,int numMines){
      
      
     
	  grid=new MineGrid(numRows,numCols,numMines);
	  setLayout(new GridLayout(numRows,numCols));
	  Icon btnimage = new ImageIcon("C:\\Users\\user\\Desktop\\Cs102\\images\\covered2.png");
	  for (int i=0;i<numRows;i++){
	      for (int j=0;j<numCols;j++){
	          JButton button= new JButton();
	         button.setIcon(btnimage);
	     
	          add(button);
	          button.addActionListener(new ButtonHandler(i,j,grid));
	         button.addMouseListener(new MyMouseAdapter(i,j,grid));
	      }
	  }

	}
	}

