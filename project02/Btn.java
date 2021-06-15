package project02;

import javax.swing.JButton;

public class Btn extends JButton {
	
	private static final long serialVersionUID = 1L;
	private int row,col;
	
	
	public Btn(int row, int col) {
		this.row = row;
		this.col = col;
	
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getCol() {
		return col;
	}

	public void setCol(int col) {
		this.col = col;
	}

}
