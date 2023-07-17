package client.diercen;
import Utils.Customer.*;
import client.diyicen.Util;
import client.diyicen.showMain;
/*
 *茶友页面类
 */
public class showMenu {
    private static final showMenu showmenu = new showMenu();
    public static showMenu showmenu(){return showmenu;}

    public void showCustMenu(){
        boolean con = true;
        do {
            System.out.println("===============茶友信息管理================");
            System.out.println("\t\t 1.显示所有茶友信息");
            System.out.println("\t\t 2.添加茶友信息");
            System.out.println("\t\t 3.修改茶友信息");
            System.out.println("\t\t 4.删除茶友信息");
            System.out.println("\t\t 5.查询指定茶友信息");
            System.out.println("=======================================");
            System.out.println("请输入数字选项，或输入\"n\"返回上级菜单:");
            String choose = Util.acceptInput("1", "2", "3", "4", "5", "n");

            switch (choose) {
                case "1":
                    showCust.show().showAll();
                    break;
                case "2":
                    addCust.add().addCustomer();
                    break;
                case "3":
                    modifyCust.modify().modifyCustomer();
                    break;
                case "4":
                    deletCust.delet().deletCustomer();
                    break;
                case "5":
                    inquireCust.inquire().showCustomer();
                    break;
                case "n":
                    con = false;
                    showMain.showmain().showMainMenu();
                    break;
            }
        }while(con);
    }
}
