public class Customer {
    private String name;
    private String membershipType;

    public Customer(String name) {
        this.name = name;
        this.membershipType = "None";
    }

    public String getName() {
        return name;
    }

    public String getMembershipType() {
        return membershipType;
    }

    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", membershipType='" + membershipType + '\'' +
                '}';
    }
}
