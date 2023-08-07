package singleelement;

public class SingleElement {
    public int getSingleElementCount(int[] arr) {
        if (arr == null || arr.length == 0){
            return -1;
        }
        return arr[0];
    }
}
