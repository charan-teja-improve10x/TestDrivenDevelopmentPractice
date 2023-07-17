package maximumedgeofatriangle;

public class MaximumEdgeOfTriangle {
    public int findTheThirdMaximEdgeOfTriangle(int sideOne, int sideTwo) {
        int thirdEdge = 0;
        if (sideOne == 0 || sideTwo == 0){
            thirdEdge = 0;
        }else {
            thirdEdge = (sideOne + sideTwo) - 1;
        }
        return thirdEdge;
    }
}
