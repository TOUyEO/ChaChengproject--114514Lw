package Utils.Customer;
import client.diercen.showMenu;
import client.diyicen.Util;
import bean.Customer;
import java.util.Scanner;
import static Utils.CustomerDao.customerDao;
/*
 * 查询茶友信息的类
 */
public class inquireCust {
    private static final inquireCust inquire = new inquireCust();
    public static inquireCust inquire(){return inquire;}

    public void showCustomer(){
        Scanner in = new Scanner(System.in);
        System.out.println("茶城购物管理系统>>茶友信息管理>>查询茶友信息");
        try {
            System.out.println("请输入要查询的id或手机号：");
            String inputkey = in.nextLine();
            Customer customer;
            if(inputkey.length() == 11){
                customer = customerDao().selectCustomer(inputkey);
                if(customer==null){
                    System.out.println("您查询的用户不存在，该手机号用户，未被注册");
                }
            }else{
                Long id = Long.valueOf(inputkey);
                customer = customerDao().selectCustomer(id);
                if(customer==null){
                    System.out.println("您查询的用户不存在，没有该id");

                }
            }
            System.out.println("茶友号\t手机号\t\t茶友生日\t\t会员积分");
            System.out.println(customer.getId()+"\t"+customer.getPhone()+"\t"+customer.getBirthday()+"\t"+customer.getScore());
        } catch (NumberFormatException e) {
            System.out.println("输入错误，重新执行");
            showCustomer();
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
