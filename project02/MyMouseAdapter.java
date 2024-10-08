package project02;
import javax.swing.*;



import java.awt.event.*;
public class MyMouseAdapter extends MouseAdapter {
	private int row,col;
	private MineGrid grid;
	private static int count=0;
	private Btn [][] btns;
public MyMouseAdapter(int r,int c,MineGrid g,Btn[][]b) {	
this.row=r;
this.col=c;
this.grid=g;
this.btns=b;
}
	
	public void mouseClicked(MouseEvent e) {
		if(e.getSource() instanceof JButton) {
	  		  Btn button= (Btn) e.getComponent();
		if(SwingUtilities.isRightMouseButton(e)) {
		
  		 if(!MineSweeperGUI.getIsFlagged()[row][col]&&!MineSweeperGUI.getIsClicked()[row][col]) {
  		  
		 button.setIcon(new ImageIcon("src\\imgs\\flagged.png"));
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
			JOptionPane.showMessageDialog(null,"You�re a genius");
			  System.exit(0);
	   
		  }
		  }
	   
  		 }
  		 else if(!MineSweeperGUI.getIsClicked()[row][col]){
  			 button.setIcon(new ImageIcon("src\\imgs\\covered.png"));
  			MineSweeperGUI.getIsFlagged()[row][col]=false;
  		 count--;
  		 }
  		 
		}
		else if(e.getButton()==1) {
			
			if(grid.getCellContent(row, col)!=-1) {
			check(button.getRow(),button.getCol());	
			}
		}
		
		
		
		}
		}
	public void check(int r,int c) {

		if (!grid.isInsideGrid(r, c)||MineSweeperGUI.getIsClicked()[r][c]==true
		) {
			return;
		}
		else if(grid.getCellContent(r, c)!=0&&grid.getCellContent(r, c)!=-1){
			MineSweeperGUI.getIsClicked()[r][c]=true;
			if(grid.getCellContent(r, c)==1) {
				btns[r][c].setIcon(new ImageIcon("src\\imgs\\one.png"));
				
			}
			else if(grid.getCellContent(r, c)==2) {
				btns[r][c].setIcon(new ImageIcon("src\\imgs\\two.png"));
			}
			else if(grid.getCellContent(r, c)==3) {
				btns[r][c].setIcon(new ImageIcon("src\\imgs\\three.png"));
			}
			else if(grid.getCellContent(r, c)==4) {
				btns[r][c].setIcon(new ImageIcon("src\\imgs\\four.png"));
			}
			else if(grid.getCellContent(r, c)==5) {
				btns[r][c].setIcon(new ImageIcon("src\\imgs\\five.png"));
				
			}
			else if(grid.getCellContent(r, c)==6) {
				btns[r][c].setIcon(new ImageIcon("src\\imgs\\six.png"));
			
			}
			else if(grid.getCellContent(r, c)==7) {
				btns[r][c].setIcon(new ImageIcon("src\\imgs\\seven.png"));
				
			}
			else if(grid.getCellContent(r, c)==8) {
				btns[r][c].setIcon(new ImageIcon("src\\imgs\\eight.png"));
			
			}
			
			
		}
		else if (grid.getCellContent(r, c)==0){
			 MineSweeperGUI.getIsClicked()[r][c]=true;
			btns[r][c].setIcon(new ImageIcon("src\\imgs\\blank.png"));
			check(r-1,c);
			check(r+1,c);
			check(r,c+1);
			check(r,c-1);
		}

		}
	
	
	

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		MyMouseAdapter.count = count;
	
	
	
}}
