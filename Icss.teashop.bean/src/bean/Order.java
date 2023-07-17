package bean;
/*
订单类
 */
public class Order {
    private String phone;
    private String name;
    private double price;
    private int quantity;

    public Order() {
    }
    @Override
    public String toString() {
        return "Order{" +
                "phone='" + phone + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public Order(String phone, String name, double price, int quantity) {
        this.phone = phone;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
}
