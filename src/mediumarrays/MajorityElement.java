package mediumarrays;

public class MajorityElement {
    public int getMajorityElement(int[]elements) {
        if (elements == null || elements.length == 0){
            return -1;
        }
        return elements[0];
    }
}
