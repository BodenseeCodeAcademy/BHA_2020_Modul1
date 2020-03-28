package org.bodenseeCodeAcademy;

public class Week10 {
//Shortest Path

    public static void main(String[] args) {
        int[] shortestPaths= new int[8];

        int[][] distances= new int[8][8];

        shortestPaths=initShortestPaths();

        distances=getDistances();

        for (int i=0;i<8;i++){
            for(int j=i+1;j<8;j++){
                if(distances[i][j]!=Integer.MAX_VALUE) {
                    int currentDistance = shortestPaths[i];
                    int distance = distances[i][j];
                    int totalDistance = currentDistance + distance;
                    if (shortestPaths[j] > totalDistance) {
                        shortestPaths[j] = totalDistance;
                    }
                }
            }
        }
        /*
        * i->0
        *   j->1
        *       currentDistance=0, distance=6;
        *       totalDistance=6 -->shortestPaths[1]=6
        *   j->2
        *       currentDistance=0; distance=7;
        *       totalDistance=7 -->shortestPaths[2]=7;
        *   j->3
        *       currentDistance=0, distance=8;
        *       totalDistance=8; shortestPaths[3]=8;
        *
        * i->1
        *   j->2
        *       currentDistance=6, distance=5;
        *       totalDistance=11
        *   j->3
        *       currentDistance=6, distance=9;
        *       totalDistance=15
        *   j->4
        *       currentDistance=6, distance =10
        *       totalDistance =16; shortestPaths[4]=16
        * i->2
        *   j->3
        *       currentDistance=7, distance= 5
        *       totalDistance=12
        *   j->4
        *       currentDistance=7, distance=2
        *       totalDistance=9, shortestPaths[4]=9
        *   j->5
        *       currentDistance=7, distance=4
        *       totalDistance=11, shortestPaths[5]=11
        * i->3
        *   j->4
        *       currentDistance=8, distance=1;
        *       totalDistance=9
        *   j->5
        *       currentDistance=8, distance=2;
        *       totalDistance=10, shortestPaths[5]=10
        * i->4
        *
        * i->5
        *   j->6
        *       currentDistance=10; distance=8
        *       totalDistance=18, shortestPaths[6]=18
        *   j->7
        *       currentDistance=10, distance=3
        *       totalDistance=13, shortestPaths[7]=13
        * i->6
        *   j->7
        *      currentDistance=18, distance=11
        *       totalDistance=29,
        *
        * */

        System.out.println("Shortest Paths from A;");
        char c='A';
        for (int i=1;i<8;i++){
             c++;
            System.out.println("A to "+c+" is: " +shortestPaths[i]);
        }


    }

    private static int[] initShortestPaths() {
        int[] shortestPaths= new int[8];
        shortestPaths[0]=0;
        for (int i=1; i<8; i++){
            shortestPaths[i]=Integer.MAX_VALUE;
        }
        return  shortestPaths;
    }

    private static int[][] getDistances() {
        int[][] distances= new int[8][8];

        for (int i=0;i<8;i++){
            for (int j=i+1;j<8;j++){
                distances[i][j]=Integer.MAX_VALUE;
            }
        }
        // from A to B,C,D
        distances[0][1]=6;
        distances[0][2]=7;
        distances[0][3]=8;

        //from B to C,D,E
        distances[1][2]=5;
        distances[1][3]=9;
        distances[1][4]=10;

        //from C to D,E,F
        distances[2][3]=5;
        distances[2][4]=2;
        distances[2][5]=4;

        //from D to E,F
        distances[3][4]=1;
        distances[3][5]=2;

        //from F to G,H
        distances[5][6]=8;
        distances[5][7]=3;

        //from G to H
        distances[6][7]=11;
        return distances;

    }


}
