package discount;

public class Discount {

    public static float findTheDiscount(float price, float discount) {
        float finalPrice = 0f;
        float discountAmount = price * discount/100;
        finalPrice = price - discountAmount;
        return finalPrice;
    }
}
