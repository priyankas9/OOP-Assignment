public class InvoiceItem {
    // Private member variables
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;

    
    public InvoiceItem(String id, String desc, int qty, double unitPrice) {
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }


    public String getID() {
        return id;
    }

  
    public String getDesc() {
        return desc;
    }


    public int getQty() {
        return qty;
    }

 
    public void setQty(int qty) {
        this.qty = qty;
    }


    public double getUnitPrice() {
        return unitPrice;
    }

   
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

  
    public double getTotal() {
        return unitPrice * qty;
    }

   
    @Override
    public String toString() {
        return "InvoiceItem[id=" + id + ", desc=" + desc + ", qty=" + qty + ", unitPrice=" + unitPrice + "]";
    }

    public static void main(String[] args) {
        InvoiceItem item = new InvoiceItem("A123", "Pen", 10, 2.5);

       
        System.out.println(item);
        System.out.println("Total: " + item.getTotal());

        item.setQty(20);
        item.setUnitPrice(2.0);
        System.out.println("After updating qty and unit price: " + item);
        System.out.println("Total: " + item.getTotal());
    }
}
