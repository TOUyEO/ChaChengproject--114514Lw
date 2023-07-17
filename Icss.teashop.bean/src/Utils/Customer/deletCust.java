package Utils.Customer;
import Utils.CustomerDao;
import client.diercen.showMenu;
import client.diyicen.Util;
import java.util.Scanner;
import static Utils.CustomerDao.customerDao;
/*
 * 删除茶友操作类
 */
public class deletCust {
    private static deletCust delet = new deletCust();
    public static deletCust delet(){return delet;}

    public void deletCustomer(){
        Scanner in = new Scanner(System.in);
        System.out.println("茶城购物管理系统>>茶友信息管理>>删除茶友信息");
        System.out.println("===================================");
        CustomerDao.customerDao().showList();
        System.out.println("===================================");
        System.out.print("请输入茶友的手机号：");
        String phone = in.nextLine();
        // 判断输入是否合法
        while(phone.length()!=11){
            System.out.print("手机号输入错误，请重新输入：");
            phone = in.nextLine();
        }
        System.out.print("是否确定删除(y/n):");
        String flag = Util.acceptInput("y","n");
        if("y".equals(flag)){
            // customerDao中的delet方法，用于删除茶友信息
            customerDao().delete(phone);
        }
        // 返回操作
        System.out.println();
        System.out.println("返回输入n");
        String item = Util.acceptInput("n");
        if("n".equals(item)){
            showMenu.showmenu().showCustMenu();
        }
    }
}
