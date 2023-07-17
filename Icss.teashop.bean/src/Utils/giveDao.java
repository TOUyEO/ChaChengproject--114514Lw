package Utils;
import bean.Customer;
import bean.GiveBack;
import client.diercen.showgiveBack;
import client.diyicen.Util;
import db.DB;
import java.util.Scanner;
import static db.DB.customerList;
/*
 * 所有回馈操作方法类
 */
public class giveDao {
    private static final giveDao dao = new giveDao();
    public static giveDao dao(){return dao;}
    Scanner scanner = new Scanner(System.in);
    GiveBack giveBack = new GiveBack();
    // 给茶友发放积分的方法
    public void giveSorce(){
        System.out.println("请输入回馈积分：");
        int feedbackPoints = scanner.nextInt();

        System.out.println("回馈已发送给以下茶友：");
        System.out.println("=====================");
        for (Customer customer : customerList) {
            String phone = customer.getPhone();
            int currentPoints = customer.getScore();
            System.out.println("茶友手机号: " + phone);
            System.out.println("当前积分: " + (currentPoints + feedbackPoints));
            System.out.println("---------------------");
        }
        System.out.println("=====================");
        System.out.println();
        System.out.println("返回输入n");
        String item = Util.acceptInput("n");
        if("n".equals(item)){
            showgiveBack.back().giveback();
        }
    }
    // 给茶友发放礼品的方法
    public void giveGift(){
        System.out.print("请输入要发放礼品的茶友手机号：");
        System.out.println("===================================");
        CustomerDao.customerDao().showList();
        System.out.println("===================================");
        String customerphone = scanner.nextLine();
        if(CustomerDao.customerDao().selectCustomer(customerphone) != null){
            GiftDao.GiftDao().showList();
            System.out.println("请选择要发放的礼品(输入名称)：");
            String giftname = scanner.nextLine();
            if(GiftDao.GiftDao().selectGift(giftname) != null){
                add(giveBack);
                giveBack.setCustomerPhone(customerphone);
                giveBack.setName(giftname);
                System.out.println("发放成功!!");
            }else {System.out.println("礼品不存在！");}
        }else{System.out.println("茶友不存在！");}

        System.out.println();
        System.out.println("返回输入n");
        String item = Util.acceptInput("n");
        if("n".equals(item)){
            showgiveBack.back().giveback();
        }
    }
    // 查看礼品回馈记录的方法
    public void showGiveBack(){
        System.out.println("礼品名称\t茶友手机号");
        for(GiveBack c : DB.giveList){
            System.out.println(c.getName()+"\t"+c.getCustomerPhone());
        }
    }
    public void add(GiveBack giveBack) {
        giveBack.setId(DB.giveList.get(DB.giveList.size()-1).getId()+1);
        DB.giveList.add(giveBack);

    }
}
