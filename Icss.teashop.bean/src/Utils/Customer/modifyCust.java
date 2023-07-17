package Utils.Customer;
import Utils.CustomerDao;
import client.diercen.showMenu;
import client.diyicen.Util;
import bean.Customer;
import java.util.Scanner;
/*
 * 茶友信息修改的类
 */

public class modifyCust extends CustomerDao {
    private static final modifyCust modify = new modifyCust();
    public static modifyCust modify(){return modify;}
    BirthJudgment judgment = new BirthJudgment();
    public void modifyCustomer(){
        Scanner in = new Scanner(System.in);
        Customer newCust = new Customer();
        System.out.println("茶城购物管理系统>>茶友信息管理>>修改茶友信息");
        System.out.println("===================================");
        CustomerDao.customerDao().showList();
        System.out.println("===================================");
        System.out.print("请输入要修改的茶友的手机号：");
        String phone = in.nextLine();
        while(phone.length()!=11 || selectCustomer(phone) == null){
            System.out.print("手机号输入不存在或错误，请重新输入：");
            phone = in.nextLine();
        }
        // 加判断，是否要修改手机号，如果要修改手机号，输入新的手机号3
            do{
                System.out.print("是否确定修改手机号码(y/n):");
            String flag = Util.acceptInput("y", "n");
            if ("y".equals(flag)) {
                if (selectCustomer(phone) != null) {
                    System.out.print("请输入要修改的手机号码");
                    String pho = in.nextLine();
                    newCust.setPhone(pho);
                    System.out.println("修改成功！\n");
                    System.out.println("是否确定要修改生日日期(y/n)\n");
                    break;
                } else
                    System.out.println("输入的用户不存在");
            }if("n".equals(flag)){

                break;
                }
            }while (true);
            do {
                System.out.print("是否确定要修改生日日期(y/n):");
                String flag = Util.acceptInput("y", "n");
                if ("y".equals(flag)) {
                    System.out.print("请输入茶友的生日（年-月-日）：");
                        String birthday = in.nextLine();
                        if (!birthday.equals(newCust.getBirthday()) && judgment.Judgment(birthday)){
                            newCust.setBirthday(birthday);
                            System.out.println("修改成功！");
                            break;
                    }else{
                            System.out.println("日期不合法或相同！！");
                        }
                }if("n".equals(flag)){
                    break;
                }
            }while (true);
        // 加判断，是否要修改生日，如果要修改生日，则输入新的生日

        modify(phone,newCust);
        System.out.println();
        System.out.println("返回输入n");
        String item = Util.acceptInput("n");
        if("n".equals(item)){
            showMenu.showmenu().showCustMenu();
        }

    }
}
