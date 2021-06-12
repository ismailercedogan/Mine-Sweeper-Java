package project02;
import java.util.Random;

public class MineGrid {
	private static final int Mýne=-1;
    private int[][] mineInformation;

public MineGrid(int numRows,int numCols,int numMines) {

    mineInformation = new int[numRows][numCols];
    initializeCells();
    placeMines(numMines);
    setMineInformation();
}

public void  initializeCells(){
    for (int i=0;i< mineInformation.length;i++){

        for(int j=0;j< mineInformation[0].length;j++){
            mineInformation[i][j]=0;
        }
    }
}

private  void placeMines(int numMines){
    Random random= new Random();
    for(int i=0;i<numMines;i++){
     int r= random.nextInt(mineInformation.length);
    int c= random.nextInt(mineInformation[0].length);
    if(mineInformation[r][c] != Mýne)
        mineInformation[r][c]= Mýne;

    else
        i--;
    }

}

public boolean isMine(int i,int j){
    return mineInformation[i][j]== Mýne;

}

private void setMineInformation(){
    for (int i=0;i< mineInformation.length;i++){
        for (int j=0;j< mineInformation[0].length;j++){
            if(mineInformation[i][j]==Mýne){

                incrementMineCountAt(i-1,j-1);
                incrementMineCountAt(i-1,j);
                incrementMineCountAt(i-1,j+1);

                incrementMineCountAt(i,j-1);
                incrementMineCountAt(i,j+1);

                incrementMineCountAt(i+1,j-1);
                incrementMineCountAt(i+1,j);
                incrementMineCountAt(i+1,j+1);
            }
        }

    }

}
private void incrementMineCountAt(int i,int j){
    if(isInsideGrid(i,j)&& !isMine(i,j)){
        mineInformation[i][j]++;

    }

}
private boolean isInsideGrid(int i,int j){
    return (i>=0 && i< mineInformation.length)&&(j>=0&& j< mineInformation[0].length);


}
public int getCellContent(int i,int j){

    return  mineInformation[i][j];
}
}
