package db;
import bean.*;
import java.util.ArrayList;
import java.util.List;
/*
 * 数据初始化
 */
public class DB {
    public static List<Customer> customerList = new ArrayList<>();
    public static List<Gift> giftList = new ArrayList<>();
    public static List<Goods> goodsList = new ArrayList<>();
    public static Manager manager = new Manager();
    public static List<GiveBack> giveList = new ArrayList<>();
    public static List<Order> orderList = new ArrayList<>();
    // 初始化数据
    public DB(){
        initCustomer();
        initGift();
        initGoods();
        initGiveBack();
        initOrder();
        initManager();
    }
    private void initCustomer(){
        customerList.add(new Customer(10001,"19120373098","2000-1-1",10));
        customerList.add(new Customer(10002,"15344815644","2001-2-2",20));
        customerList.add(new Customer(10003,"18784452235","2002-3-3",30));
    }
    private void initGift(){
        giftList.add(new Gift("圆珠笔",2,5));
        giftList.add(new Gift("笔记本",5,10));
        giftList.add(new Gift("小风扇",50,100));
    }
    private void initGoods(){
        goodsList.add(new Goods("铁观音",100,50,101));
        goodsList.add(new Goods("普洱茶",5000,50,102));
        goodsList.add(new Goods("信阳毛尖",999,50,103));
    }
    private void initGiveBack(){
        giveList.add(new GiveBack("圆珠笔",2,"19120373098"));
    }
    private void initOrder(){
        orderList.add(new Order("19120373098","铁观音",200,2));
        orderList.add(new Order("18784452235","信阳毛尖",999*3,3));
    }

    private void initManager(){
        manager.setName("1");
        manager.setPassword("1");
    }
}
