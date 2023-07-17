package bean;

/*
用户类
 */
public class Customer {
    private long id;
    private String phone;
    private String birthday;
    private int score;

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", phome='" + phone + '\'' +
                ", birtjday='" + birthday + '\'' +
                ", score=" + score +
                '}';
    }
    public Customer() {
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getBirthday() {
        return birthday;
    }
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
    public Customer(long id, String phome, String birtjday, int score) {
        this.id = id;
        this.phone = phome;
        this.birthday = birtjday;
        this.score = score;
    }
}
