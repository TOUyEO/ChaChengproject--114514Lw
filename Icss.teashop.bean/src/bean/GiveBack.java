package bean;
/*
礼品回馈记录
 */
public class GiveBack {
    private String name;
    private int id;
    private String CustomerPhone;

    public String getName() {
        return name;
    }
    public GiveBack() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "GiveBack{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", CustomerPhone='" + CustomerPhone + '\'' +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomerPhone() {
        return CustomerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        CustomerPhone = customerPhone;
    }

    public GiveBack(String name, int id, String customerPhone) {
        this.name = name;
        this.id = id;
        CustomerPhone = customerPhone;
    }
}
