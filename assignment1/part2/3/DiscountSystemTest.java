import java.util.Date;

public class DiscountSystemTest {
    public static void main(String[] args) {
        // Create customers
        Customer customer1 = new Customer("Alice");
        customer1.setMembershipType("Premium");

        Customer customer2 = new Customer("Bob");
        customer2.setMembershipType("Gold");

        Customer customer3 = new Customer("Charlie");
        customer3.setMembershipType("Silver");

        Customer customer4 = new Customer("Dave");

        // Create visits
        Visit visit1 = new Visit(customer1, new Date());
        visit1.setServiceExpense(100);
        visit1.setProductExpense(50);

        Visit visit2 = new Visit(customer2, new Date());
        visit2.setServiceExpense(100);
        visit2.setProductExpense(50);

        Visit visit3 = new Visit(customer3, new Date());
        visit3.setServiceExpense(100);
        visit3.setProductExpense(50);

        Visit visit4 = new Visit(customer4, new Date());
        visit4.setServiceExpense(100);
        visit4.setProductExpense(50);

        // Print total expenses for each visit
        System.out.println(visit1);
        System.out.println("Total expense for " + visit1.getCustomerName() + ": $" + visit1.getTotalExpense());

        System.out.println(visit2);
        System.out.println("Total expense for " + visit2.getCustomerName() + ": $" + visit2.getTotalExpense());

        System.out.println(visit3);
        System.out.println("Total expense for " + visit3.getCustomerName() + ": $" + visit3.getTotalExpense());

        System.out.println(visit4);
        System.out.println("Total expense for " + visit4.getCustomerName() + ": $" + visit4.getTotalExpense());
    }
}
