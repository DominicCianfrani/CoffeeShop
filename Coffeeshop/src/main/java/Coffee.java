public class Coffee {
    private String FirstName;
    private String LastName;
    private double Cost;
    private int OrderNum;
    private String Order;
    private boolean Decaf;


    public Coffee (String firstName, String lastName, double Cost, int OrderNum, String Order, boolean Decaf) {
        this.FirstName = firstName;
        this.LastName = lastName;
        this.Cost = Cost;
        this.OrderNum = OrderNum;
        this.Order = Order;
        this.Decaf = Decaf;

    }

    // Getters & Setters
    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public double getCost() {
        return Cost;
    }

    public int getOrderNum() {
        return OrderNum;
    }

    public String getOrder() {
        return Order;
    }
    public boolean getDecaf() {
        return Decaf;
    }
}
