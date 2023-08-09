package mediumarrays;

public class MajorityElement {
    public int getMajorityElement(int[]elements) {
        if (elements == null || elements.length == 0){
            return -1;
        }else {
            int n = elements.length;
            for ( int i = 0; i< n; i++){
                int count = 0;
                for (int j = 0; j< n; j++){
                    if (elements[i] == elements[j]){
                        count++;
                    }
                }
                if (count > n/2){
                    return elements[i];
                }
            }
        }
        return -1;
    }
}
