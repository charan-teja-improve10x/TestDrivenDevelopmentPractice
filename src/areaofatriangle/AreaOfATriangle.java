package areaofatriangle;

public class AreaOfATriangle {
    public float findTheArea(float base, float height) {
        float area = 0.0f;
        if (base < 0 || height < 0){
            area = -1;
        }else {
            area = (base * height) /2;
        }
        return area;
    }
}
