package project02;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
public class MineSweeperGUI extends JPanel {
	
	private static final long serialVersionUID = 1L;
	private  MineGrid grid;
	private static boolean[][] isFlagged;
	private static boolean[][] isClicked;
	private  ArrayList <JButton>buttons=new ArrayList<>();
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
	     buttons.add(button);
	          add(button);
	          button.addActionListener(new ButtonHandler(i,j,grid,buttons));
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
	public ArrayList<JButton> getButtons() {
		return buttons;
	}
	public void setButtons(ArrayList<JButton> buttons) {
		this.buttons = buttons;
	}

	
	
}	


