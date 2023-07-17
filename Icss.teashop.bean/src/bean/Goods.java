package bean;
/*
茶叶类
 */
public class Goods {
    private String name;
    private int price;
    private int count;
    private long id;

    public Goods(String name, int price, int count, long id) {
        this.name = name;
        this.price = price;
        this.count = count;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", count=" + count +
                ", id=" + id +
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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Goods() {
    }
}
