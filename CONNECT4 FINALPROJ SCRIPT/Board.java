
/**
 * Write a description of class Board here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Board
{
    private int width;
    private int height;
    private int [][] gameboard;
    public Board(int w,int h){

        width=w;
        height=h;
        gameboard=new int[h][w];    
    }

    public Board(){
        gameboard=new int[6][7];    
    }

    public boolean horizontalFour(){
        boolean result=false;
        for(int row=0;row<height;row++){

            for(int col=0;col<width;col++){
                if(gameboard[row][col]!=0 && col+4<=width && gameboard[row][col]==gameboard[row][col+1]&& 
                gameboard[row][col+1]==gameboard[row][col+2] && 
                gameboard[row][col+2]==gameboard[row][col+3] 
                ){

                    result=true;    
                }
            }
        }
        return result;
    }

    public boolean verticalFour(){
        boolean result=false;

        for(int col=0;col<width;col++){
            for(int row=0;row<height;row++){
                if(gameboard[row][col]!=0 && row+4<=height &&gameboard[row][col]==gameboard[row+1][col]&& 
                gameboard[row+1][col]==gameboard[row+2][col] && 
                gameboard[row+2][col]==gameboard[row+3][col] 
                ){
                    result=true;    
                }  
            }
        }   
        return result;
    }

    /**
     * 
     */
    public boolean reversediagFour(){
        boolean result=false;
        //may have to multiple ors
        for (int row=0;row<height;row++){
            for(int col=0;col<width;col++){
                if(gameboard[row][col]!=0 && row+4<=height && col>=3&&
                gameboard[row][col]==gameboard[row+1][col-1] &&
                gameboard[row+1][col-1]==gameboard[row+2][col-2] &&
                gameboard[row+2][col-2]==gameboard[row+3][col-3] 
                ){
                    result=true;
                }
            }
        }
        return result;
    }

    public boolean diagFour(){
        boolean result=false;
        //cant use [rc][rc] index since not always perfect square
        for (int row=0;row<height;row++){
            for(int col=0;col<width;col++){
                if(gameboard[row][col]!=0 && col+4<=width&& row+4<=height&&
                gameboard[row][col]==gameboard[row+1][col+1] &&
                gameboard[row+1][col+1]==gameboard[row+2][col+2] &&
                gameboard[row+2][col+2]==gameboard[row+3][col+3]
                
                
                ){
                    result=true;
                }
            }
        }
        return result;
    }

    public void setBoard(int x,int y,int num){
        gameboard[x][y]=num;    
    }

    public int findRow(int col){
        int rowNum=0;

        while(rowNum<height-1&& gameboard[rowNum+1][col]==0){
            //System.out.print(rowNum+1+":\t");
            //System.out.println(gameboard[rowNum+1][col]);
            rowNum++;

        }
        return rowNum;    
    }

    public int [][]getBoard(){
        return gameboard;    
    }

    public void printBoard(){
        System.out.println("Current Board is:");
        for(int row=0;row<height;row++){

            for(int col=0;col<width;col++){
                System.out.print(gameboard[row][col]+" ");    
            }
            System.out.println("");
        }
    }

    public boolean fullBoard(){
        boolean result=true;
        for(int row=0;row<height;row++){
            for(int col=0;col<width;col++){
                if(gameboard[row][col]==0){
                    result=false;    
                }
            }
        }
        return result;
    }

}

