package org.bodenseeCodeAcademy;

import java.util.Scanner;

public class GameOfLife {
    private static int[][] A_INFINITY_BOARD_9x9 = new int[][] { //
            { 0, 0, 0, 1, 1, 1, 0, 0, 0 }, //
            { 0, 0, 1, 0, 0, 0, 1, 0, 0 }, //
            { 0, 0, 1, 0, 0, 0, 1, 0, 0 }, //
            { 0, 0, 1, 0, 0, 0, 1, 0, 0 }, //
            { 0, 0, 1, 1, 1, 1, 1, 0, 0 }, //
            { 0, 0, 1, 0, 0, 0, 1, 0, 0 }, //
            { 0, 0, 1, 0, 0, 0, 1, 0, 0 }, //
            { 0, 0, 1, 0, 0, 0, 1, 0, 0 }, //
            { 0, 0, 1, 0, 0, 0, 1, 0, 0 } };

    public static void main(String[] args) {
        int[][] nextGeneration= calculateNextGeneration(A_INFINITY_BOARD_9x9);
        writeMatrixToScreen(nextGeneration);
        writeLiveCellCountToScreen(nextGeneration);
        writeLiveCellCountToScreen(A_INFINITY_BOARD_9x9);

        System.out.println("Please give the number of generations: ");
        Scanner scn = new Scanner (System.in);
        int generationCount = scn.nextInt ();

        if(generationCount<0) {
            System.out.println("Incorrect Input");
        }else if (generationCount==0){
            writeMatrixToScreen(A_INFINITY_BOARD_9x9);
        }else {
            nextGeneration=A_INFINITY_BOARD_9x9;
            for (int i=0;i<generationCount;i++){
                nextGeneration=calculateNextGeneration(nextGeneration);
            }
            writeMatrixToScreen(nextGeneration);
            writeLiveCellCountToScreen(nextGeneration);
        }

    }

    private static void writeLiveCellCountToScreen(int[][] matrix) {
        int liveCellCount=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                liveCellCount+=matrix[i][j];
            }
        }
        System.out.println("Live Cell Count="+liveCellCount);
    }
// main runner method
    private static int[][] calculateNextGeneration(int[][] currentGeneration) {
        int[][] nextGeneration = new int[currentGeneration.length][currentGeneration[0].length];

        for(int i=0;i<currentGeneration.length;i++){
            for(int j=0;j<currentGeneration[i].length;j++){
               int liveNeighbourCount=findLiveNeighbourCount(i,j,currentGeneration);
               int nextGenerationCellValue=decideTheCellValue(currentGeneration[i][j],liveNeighbourCount);
               nextGeneration[i][j]=nextGenerationCellValue;
            }
        }
        return nextGeneration;
    }

//handle corner cases
    private static int findLiveNeighbourCount(int i, int j,int[][] currentGeneration) {
        int liveNeighbourCount=0;
            for(int x=-1;x<2;x++){
                for (int y=-1;y<2;y++){
                    if(i+x >=0 && i+x<currentGeneration.length && j+y>=0 && j+y<currentGeneration[i].length) {
                        liveNeighbourCount += currentGeneration[i + x][j + y];
                    }
                }
            }
            // we don't want to count the current cell as a neighbour!
            liveNeighbourCount-=currentGeneration[i][j];
        return  liveNeighbourCount;
    }

// logic
    private static int decideTheCellValue(int currentCellStatus, int liveNeighbourCount) {
        int nextGenerationValue=-1;
        if(currentCellStatus==0){ //dead
            if(liveNeighbourCount==3){
                nextGenerationValue=1;
            }else {
                nextGenerationValue=0;
            }
        }else{  //alive
            if(liveNeighbourCount<2) nextGenerationValue=0;
            else if (liveNeighbourCount==2 ||liveNeighbourCount==3) nextGenerationValue=1;
            else if (liveNeighbourCount>3) nextGenerationValue=0;
        }
        return nextGenerationValue;
    }

    private static void writeMatrixToScreen(int[][] nextGeneration) {
        for(int i=0;i<nextGeneration.length;i++){
            for(int j=0;j<nextGeneration[i].length;j++){
                System.out.printf("%d",nextGeneration[i][j]);
            }
            System.out.println();
        }
    }
}
