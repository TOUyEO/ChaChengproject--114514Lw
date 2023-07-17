package Utils.Customer;
import client.diercen.showMenu;
import client.diyicen.Util;
import bean.Customer;
import java.util.Scanner;
import static Utils.CustomerDao.customerDao;
/*
 * 茶叶添加类
 */


public class addCust {
    private static addCust add = new addCust();
    public static addCust add(){
        return add;
    }
    // 添加的方法
    public void addCustomer(){
        BirthJudgment judgment = new BirthJudgment();
        Scanner in = new Scanner(System.in);
        System.out.println("茶城购物管理系统>>茶友信息管理>>添加茶友信息");

        System.out.print("请输入茶友的手机号：");
        String phone = in.nextLine();
        // 判断输入是否合法
        while(phone.length()!=11){
            System.out.print("手机号输入错误，请重新输入：");
            phone = in.nextLine();
        }
        System.out.print("请输入茶友的生日（年-月-日）：");
        String birthday = in.nextLine();
        // 保存茶友信息
        if (judgment.Judgment(birthday)){
            Customer customer = new Customer();
            customer.setPhone(phone);
            customer.setBirthday(birthday);
            customer.setScore(0);
            customerDao().add(customer);
            System.out.println("添加成功！！！");
        }else  System.out.println("日期不合法");
        // 返回操作
        System.out.println();
        System.out.println("返回输入n");
        String item = Util.acceptInput("n");
        if("n".equals(item)){
            showMenu.showmenu().showCustMenu();
        }
    }
}
