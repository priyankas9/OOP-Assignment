public class InvoiceItem {
    // Private member variables
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;

    // Constructor
    public InvoiceItem(String id, String desc, int qty, double unitPrice) {
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    // Getter for ID
    public String getID() {
        return id;
    }

    // Getter for description
    public String getDesc() {
        return desc;
    }

    // Getter for quantity
    public int getQty() {
        return qty;
    }

    // Setter for quantity
    public void setQty(int qty) {
        this.qty = qty;
    }

    // Getter for unit price
    public double getUnitPrice() {
        return unitPrice;
    }

    // Setter for unit price
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    // Method to calculate total price
    public double getTotal() {
        return unitPrice * qty;
    }

    // toString method
    @Override
    public String toString() {
        return "InvoiceItem[id=" + id + ", desc=" + desc + ", qty=" + qty + ", unitPrice=" + unitPrice + "]";
    }

    // Main method for testing
    public static void main(String[] args) {
        InvoiceItem item = new InvoiceItem("A123", "Pen", 10, 2.5);

        // Testing the InvoiceItem class
        System.out.println(item);
        System.out.println("Total: " + item.getTotal());

        item.setQty(20);
        item.setUnitPrice(2.0);
        System.out.println("After updating qty and unit price: " + item);
        System.out.println("Total: " + item.getTotal());
    }
}
