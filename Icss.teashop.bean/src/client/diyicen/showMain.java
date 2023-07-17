package client.diyicen;
import client.diercen.*;
import client.Menu;

public class showMain {
    private static final showMain showmain = new showMain();
    public static showMain showmain(){return showmain;}

    public void showMainMenu(){
        boolean con = true;
        do {
            System.out.println("☆☆☆☆☆欢迎使用-茶城管理系统☆☆☆☆☆");
            System.out.println("===============进入主界面================");
            System.out.println("\t\t 1.茶友信息管理");
            System.out.println("\t\t 2.茶叶信息管理");
            System.out.println("\t\t 3.茶叶结算");
            System.out.println("\t\t 4.礼品信息管理");
            System.out.println("\t\t 5.回馈");
            System.out.println("\t\t 6.注销");
            System.out.println("=======================================");
            System.out.println("请输入选项菜单：");
            String choose = Util.acceptInput("1","2","3","4","5","6");

            switch(choose) {
                case "1":
                    showMenu.showmenu().showCustMenu();
                    break;
                case "2":
                    showTeaMenu.teamenu().teaMenu();
                    break;
                case "3":
                    teaSettlement.settlement().teasettlement();
                    break;
                case "4":
                    showGiftMenu.giftmenu().giftMenu();
                    break;
                case "5":
                    showgiveBack.back().giveback();
                    //Dao.dao().give();
                    break;
                case "6":
                    System.out.println("跳转到登录页");
                    Menu.menu().showLoginMenu();
                    con = false;
                    break;
            }

        }while (con);
    }
}
