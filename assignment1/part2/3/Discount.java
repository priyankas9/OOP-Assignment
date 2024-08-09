public class Discount {
    public static double getServiceDiscountRate(String membershipType) {
        switch (membershipType) {
            case "Premium":
                return 0.2;
            case "Gold":
                return 0.15;
            case "Silver":
                return 0.1;
            default:
                return 0.0;
        }
    }

    public static double getProductDiscountRate(String membershipType) {
        return 0.1; 
    }
}
