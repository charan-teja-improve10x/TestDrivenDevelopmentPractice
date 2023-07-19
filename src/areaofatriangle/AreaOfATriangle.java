package areaofatriangle;

public class AreaOfATriangle {
    public int findTheAreaOfATriangle(int base, int height) {
        int area = 0;
        if (base < 0 || height < 0){
            area = -1;
        }else {
            area = (base * height) /2;
        }
        return area;
    }
}
