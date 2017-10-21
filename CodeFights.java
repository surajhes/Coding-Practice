/**
 * Created by suraj on 10/12/2017.
 */
public class CodeFights {
    public static void main(String[] args) {
        CodeFights codeFights = new CodeFights();
        double departure[] = {0,0.2};
        double destination[] = {7,0.5};
        int[] carDimensions = {3,2};
        int[][] parkingLot = {{1,0,1,0,1,0},{0,0,0,0,1,0},{0,0,0,0,0,1},{1,0,1,1,1,1}};
        int[] luckySpot = {1, 1, 2, 3};
        System.out.println(codeFights.parkingSpot(carDimensions,parkingLot,luckySpot));
    }
    double perfectCity(double[] departure, double[] destination) {
        double distance = 0.0f;
        boolean xIsInt = false;
        xIsInt = departure[0] == (int)departure[0];
        if(!xIsInt){
            double endX = destination[0];
            boolean result = endX-Math.floor(endX)>0.5;
            if(result){
                distance = Math.abs(Math.ceil(destination[0]) - departure[0]) +
                        Math.abs(destination[1] - departure[1]) + Math.abs(Math.ceil(destination[0]) - destination[0]);
            }else{
                distance = Math.abs(Math.floor(destination[0]) - departure[0]) +
                        Math.abs(destination[1] - departure[1]) + Math.abs(Math.floor(destination[0]) - destination[0]);
            }
            return distance;
        }else{
            double endY = destination[1];
            boolean result = endY-Math.floor(endY)>0.5;
            if(result){
                distance = Math.abs(destination[0] - departure[0]) +
                        Math.abs(Math.ceil(destination[1]) - departure[1]) + Math.abs(Math.ceil(destination[1]) - destination[1]);
            }else{
                distance = Math.abs(destination[0] - departure[0]) +
                        Math.abs(Math.floor(destination[1]) - departure[1]) + Math.abs(Math.floor(destination[1]) - destination[1]);
            }
            return distance;
        }
    }

    boolean parkingSpot(int[] carDimensions, int[][] parkingLot, int[] luckySpot) {
        boolean canPark = true;
        int luckySpotXLowerLeft = luckySpot[0];
        int luckySpotYLowerLeft = luckySpot[1];
        int luckySpotXUpperRight = luckySpot[2];
        int luckySpotYUpperLeft = luckySpot[3];
        for(int i = luckySpotXLowerLeft; i <= luckySpotXUpperRight;i++){
            for(int j = luckySpotYLowerLeft; j <= luckySpotYUpperLeft; j++){
                if(parkingLot[i][j] == 1){
                    return false;
                }
            }
        }
        for(int i = luckySpotXUpperRight; i >= luckySpotXLowerLeft; i--){
            for(int j = luckySpotYLowerLeft; j >= 0; j--){
                if(parkingLot[i][j] == 1){
                    canPark = false;
                }
            }
        }
        if(canPark){
            return true;
        }
        for(int i = luckySpotXLowerLeft; i < parkingLot.length; i++){
            for(int j = luckySpotYUpperLeft; j < parkingLot[i].length; j++){
                if(parkingLot[i][j] == 1 && !canPark)
                    return false;
            }
        }
        int parkingLengthX = Math.abs(luckySpot[0] - luckySpot[3]);
        int parkingLengthY = Math.abs(luckySpot[2] - luckySpot[4]);
        if(parkingLengthX < carDimensions[0] || parkingLengthY < carDimensions[1]){
            return false;
        }
        return true;
    }


}
