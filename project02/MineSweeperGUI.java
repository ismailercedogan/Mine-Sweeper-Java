package project02;
import javax.swing.*;
import java.awt.*;
public class MineSweeperGUI extends JPanel {
	
	private static final long serialVersionUID = 1L;
	private  MineGrid grid;
	private static boolean[][] isFlagged;
	private static boolean[][] isClicked;
	public  MineSweeperGUI(int numRows, int numCols,int numMines){
      
      
	  isFlagged=new boolean[numRows][numCols];
	  isClicked=new boolean[numRows][numCols];
	  grid=new MineGrid(numRows,numCols,numMines);
	  setLayout(new GridLayout(numRows,numCols));
	  Icon btnimage = new ImageIcon("C:\\Users\\user\\Desktop\\Cs102\\images\\covered2.png");
	  for (int i=0;i<numRows;i++){
	      for (int j=0;j<numCols;j++){
	          JButton button= new JButton();
	         button.setIcon(btnimage);
	     
	          add(button);
	          button.addActionListener(new ButtonHandler(i,j,grid));
	          MyMouseAdapter adapter=new MyMouseAdapter(i,j,grid);
	          button.addMouseListener(adapter);
	          
	      }
	  }

	}
	public static boolean[][] getIsFlagged() {
		return isFlagged;
	}
	public static void setIsFlagged(boolean[][] isFlagged) {
		MineSweeperGUI.isFlagged = isFlagged;
	}
	public static boolean[][] getIsClicked() {
		return isClicked;
	}
	public static void setIsClicked(boolean[][] isClicked) {
		MineSweeperGUI.isClicked = isClicked;
	}

}	


