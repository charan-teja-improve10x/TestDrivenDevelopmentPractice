package perimeterofrectangle;

public class PerimeterOfRectangle {

    public int findThePerimeterOfRectangle(int height, int width) {
        int perimeter = 0;
        if (height < 0 || width < 0) {
            perimeter = -1;
        } else if (height == 0 && width == 0) {
            perimeter = 0;
        } else {
            perimeter = (height + width) * 2;
        }
        return perimeter;
    }
}
