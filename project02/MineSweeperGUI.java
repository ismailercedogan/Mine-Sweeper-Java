package project02;
import javax.swing.*;

import java.awt.*;

public class MineSweeperGUI extends JPanel {
	
	private static final long serialVersionUID = 1L;
	private  MineGrid grid;
	private static boolean[][] isFlagged;
	private static boolean[][] isClicked;
private static Btn[][]Board;
	
	public  MineSweeperGUI(int numRows, int numCols,int numMines){
	
      Btn[][] Board=new Btn[numRows][numCols];
	  isFlagged=new boolean	[numRows][numCols];
	  isClicked=new boolean[numRows][numCols];
	  grid=new MineGrid(numRows,numCols,numMines);
	  setLayout(new GridLayout(numRows,numCols));
	  Icon btnimage = new ImageIcon("src\\imgs\\covered.png");
	  for (int i=0;i<numRows;i++){
	      for (int j=0;j<numCols;j++){
	    	
	    	 Btn button=new Btn(i,j);
	         button.setIcon(btnimage);
	      
	          add(button);
	       
	          button.addActionListener(new ButtonHandler(i,j,grid,Board));
	          Board[i][j]=button;
	          MyMouseAdapter adapter=new MyMouseAdapter(i,j,grid,Board);
	          button.addMouseListener(adapter);
	          
	      }
	  }

	}

	public static Btn[][] getBoard() {
		return Board;
	}

	public static void setBoard(Btn[][] board) {
		Board = board;
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


