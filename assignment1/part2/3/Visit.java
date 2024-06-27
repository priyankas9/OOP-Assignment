import java.util.Date;

public class Visit {
    private Customer customer;
    private Date date;
    private double serviceExpense;
    private double productExpense;

    public Visit(Customer customer, Date date) {
        this.customer = customer;
        this.date = date;
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }

    public double getTotalExpense() {
        String membershipType = customer.getMembershipType();
        double serviceDiscount = Discount.getServiceDiscountRate(membershipType);
        double productDiscount = Discount.getProductDiscountRate(membershipType);

        double discountedServiceExpense = serviceExpense * (1 - serviceDiscount);
        double discountedProductExpense = productExpense * (1 - productDiscount);

        return discountedServiceExpense + discountedProductExpense;
    }

    @Override
    public String toString() {
        return "Visit{" +
                "customer=" + customer +
                ", date=" + date +
                ", serviceExpense=" + serviceExpense +
                ", productExpense=" + productExpense +
                '}';
    }
}
