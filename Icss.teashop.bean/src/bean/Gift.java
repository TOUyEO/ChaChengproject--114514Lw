package bean;
/*
礼品类
 */
public class Gift {
    private String name;
    private int price;
    private int count;

    public Gift() {
    }
    @Override
    public String toString() {
        return "Gift{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", count=" + count +
                '}';
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }
    public Gift(String name, int price, int count) {
        this.name = name;
        this.price = price;
        this.count = count;
    }
}
